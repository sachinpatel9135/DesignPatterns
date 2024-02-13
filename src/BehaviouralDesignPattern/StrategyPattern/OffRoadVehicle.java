package BehaviouralDesignPattern.StrategyPattern;

import BehaviouralDesignPattern.StrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
