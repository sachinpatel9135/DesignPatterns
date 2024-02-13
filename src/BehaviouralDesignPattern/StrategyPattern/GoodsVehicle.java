package BehaviouralDesignPattern.StrategyPattern;

import BehaviouralDesignPattern.StrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
