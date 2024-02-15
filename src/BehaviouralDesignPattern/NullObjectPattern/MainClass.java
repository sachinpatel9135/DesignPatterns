package BehaviouralDesignPattern.NullObjectPattern;

public class MainClass {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("car");
        System.out.println(vehicle.getSeatingCapacity());
        System.out.println(vehicle.getTankCapacity());
        Vehicle vehicle1 = VehicleFactory.getVehicleObject("noVehicle");
        System.out.println(vehicle1.getSeatingCapacity());
        System.out.println(vehicle1.getTankCapacity());
    }
}
