package java8_features.static_default_methods;

public interface Vehicle {

  String getBrand();

  String speedUp();

  String slowDown();

  default String turnAlarmOn() {
    return "Turning the vehicle alarm on.";
  }

  default String turnAlarmOff() {
    return "Turning the vehicle alarm off.";
  }
}
