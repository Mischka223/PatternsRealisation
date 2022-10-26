package patterns.creationalPatterns.builder;

import java.util.StringJoiner;

import patterns.creationalPatterns.builder.BuilderMain.Car.CarBuilder;

public class BuilderMain {

  public static void main(String[] args) {
    Car bmw = new CarBuilder("BMW").setColor("Black").build();
    System.out.println(bmw);
    Car audi = new CarBuilder("Audi").setColor("Blue").setMaxSpeed(300).build();
    System.out.println(audi);
    System.out.println(bmw);

  }



 static class Car{
    private String name;
    private String color;
    private int maxSpeed;



    private Car(CarBuilder carBuilder) {
      this.color = carBuilder.color;
      this.maxSpeed = carBuilder.maxSpeed;
      this.name = carBuilder.name;
    }

   @Override
   public String toString() {
     return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
         .add("name='" + name + "'")
         .add("color=" + color)
         .add("maxSpeed=" + maxSpeed)
         .toString();
   }

   static class CarBuilder {

      private String name;
      private String color;
      private int maxSpeed;


      public CarBuilder(String name) {
        this.name = name;
      }

      public CarBuilder setColor(String color) {
        this.color = color;
        return this;
      }

      public CarBuilder setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
      }

      public Car build(){
        return new Car(this);
      }
    }
  }
}
