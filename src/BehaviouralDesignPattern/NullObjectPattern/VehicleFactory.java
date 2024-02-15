package BehaviouralDesignPattern.NullObjectPattern;

public class VehicleFactory {
    static Vehicle getVehicleObject(String typeOfVehicle) {
        if("car".equals(typeOfVehicle)) return new Car(40,5);
        return new NullObject();
    }
}
