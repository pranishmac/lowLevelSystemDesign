package org.pranish.strategyDesignPattern.driveStrategy;

public class SpecialDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This is special drive strategy");
    }
}
