package java8_features.static_default_methods;

public class Car implements Vehicle {

  private String brand;

  public Car(String brand) {
    this.brand = brand;
  }

  @Override
  public String getBrand() {
    return brand;
  }

  @Override
  public String speedUp() {
    return "The car is speeding up.";
  }

  @Override
  public String slowDown() {
    return "The car is slowing down.";
  }
}
