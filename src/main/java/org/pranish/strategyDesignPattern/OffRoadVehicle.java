package org.pranish.strategyDesignPattern;

import org.pranish.strategyDesignPattern.driveStrategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SpecialDrive());
    }
}
