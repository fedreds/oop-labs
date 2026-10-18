package it.unibo.design.robot.impl;

public class AtomicBattery extends RobotPart{

    private double BATTERY_DELTA_CONSUMPTION = 20; 

    public AtomicBattery() {
    }

    protected String[] specificCommands() {
        return new String[]{"maxRecharge"};
    }

    public boolean turnOn() {
        if(getBattery() > getBatteryRequirementForRecharge()) {
            ComposableRobot robot = getAttachedRobot();
            boolean turnedOn = super.turnOn();
            robot.recharge();
            setBattery(getBattery() - BATTERY_DELTA_CONSUMPTION);
            IO.println("Battery Recharged");
            return turnedOn;
        } else {
            return false;
        }
        
    }

    protected double getBatteryRequirementForRecharge() {
        return BATTERY_DELTA_CONSUMPTION;
    }
}
