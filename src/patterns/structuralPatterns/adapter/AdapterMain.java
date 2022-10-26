package patterns.structuralPatterns.adapter;

public class AdapterMain {

  public static void main(String[] args) {
    CarWash carWash = new CarWash();
    Audi audi = new Audi();
    MyTruck myTruck = new MyTruck();
    TruckWrapper truckWrapper = new TruckWrapper(myTruck);
    carWash.wash(truckWrapper);
  }
}

interface Truck{
  void clean();
}


class TruckWrapper implements Car{
  private Truck truck;

  public TruckWrapper(Truck truck) {
    this.truck = truck;
  }

  @Override
  public void wash() {
    truck.clean();
  }
}

class MyTruck implements Truck{

  @Override
  public void clean() {
    System.out.println("My truck is washing");
  }
}

interface Car{
  void wash();
}

class Audi implements Car{
  @Override
  public void wash() {
    System.out.println("Audi is washing");
  }
}

class CarWash{
  void wash(Car car){
  car.wash();
  }
}
