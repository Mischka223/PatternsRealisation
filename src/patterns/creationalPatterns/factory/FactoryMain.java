package patterns.creationalPatterns.factory;

public class FactoryMain {

  public static void main(String[] args) {
    CarFactory carFactory = new CarFactory();
    Car audi = carFactory.createCar("Audi");
    Car bmw = carFactory.createCar("BMW");
    audi.drive();
    bmw.drive();
  }

}
interface Car {
  void drive();

}

class BMW implements Car {
  @Override
  public void drive() {
    System.out.println("BMW is driving");
  }
}

class Audi implements Car {
  @Override
  public void drive() {
    System.out.println("Audi is driving");
  }
}

class CarFactory {

  Car createCar(String carName){
    switch (carName){
      case "BMW": return new BMW();
      case "Audi": return new Audi();
      default: return null;
    }
  }
}
