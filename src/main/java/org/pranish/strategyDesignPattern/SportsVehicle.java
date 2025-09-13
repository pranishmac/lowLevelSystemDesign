package org.pranish.strategyDesignPattern;

import org.pranish.strategyDesignPattern.driveStrategy.SpecialDrive;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(){
        super(new SpecialDrive());
    }
}
