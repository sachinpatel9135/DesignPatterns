package BehaviouralDesignPattern.StrategyPattern;

import BehaviouralDesignPattern.StrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
