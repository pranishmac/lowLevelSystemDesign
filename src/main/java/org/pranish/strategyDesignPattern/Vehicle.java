package org.pranish.strategyDesignPattern;

import org.pranish.strategyDesignPattern.driveStrategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveObj){
        this.driveStrategy = driveObj;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
