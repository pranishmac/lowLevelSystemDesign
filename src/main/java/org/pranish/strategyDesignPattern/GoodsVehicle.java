package org.pranish.strategyDesignPattern;

import org.pranish.strategyDesignPattern.driveStrategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
