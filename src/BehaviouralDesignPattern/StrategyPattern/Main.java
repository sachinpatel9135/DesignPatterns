package BehaviouralDesignPattern.StrategyPattern;

public class Main {
    public static void main(String[] args){
         Vehicle vehicle = new OffRoadVehicle();
         vehicle.drive();
         Vehicle vehicle1 = new  GoodsVehicle();
         vehicle1.drive();
    }
}
