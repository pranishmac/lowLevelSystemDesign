package org.pranish.strategyDesignPattern.driveStrategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This is normal Drive Strategy!");
    }
}
