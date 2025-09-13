package org.pranish;

import org.pranish.strategyDesignPattern.GoodsVehicle;
import org.pranish.strategyDesignPattern.OffRoadVehicle;
import org.pranish.strategyDesignPattern.SportsVehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SportsVehicle spoj = new SportsVehicle();
        spoj.drive();

        GoodsVehicle gobj = new GoodsVehicle();
        gobj.drive();

        OffRoadVehicle offobj = new OffRoadVehicle();
        offobj.drive();
    }
}
