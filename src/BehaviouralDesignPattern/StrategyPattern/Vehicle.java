package BehaviouralDesignPattern.StrategyPattern;

import BehaviouralDesignPattern.StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    public DriveStrategy driveStrategyObj;

    public Vehicle(DriveStrategy driveStrategyObj) {
        this.driveStrategyObj = driveStrategyObj;
    }

    public void drive() {
        driveStrategyObj.drive();
    }
}
