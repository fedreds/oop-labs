package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.Component;

public abstract class RobotPart implements Component {

    private static final int BATTERY_FULL = 100;
    private boolean power;
    private boolean isAttached; 
    private double battery;
    private ComposableRobot attachedRobot;

    public RobotPart() {
        this.battery = BATTERY_FULL;
        this.power = false;
        this.isAttached = false;
    }

    public boolean turnOn() {
        return this.power = true;
    }

    public boolean turnOff() {
        return this.power = false;
    }

    public boolean attach() {
        if(isAttached) {
            return false;
        } else {
            isAttached = true;
            return true;
        }
    }

    public boolean attachTo(ComposableRobot robot) {
        if (!attach()) {
            return false;
        }
        this.attachedRobot = robot;
        return true;
    }

    public boolean detach() {
        if(!isAttached) {
            return false;
        } else {
            isAttached = false;
            attachedRobot = null;
            return true;
        }
    }

    public boolean detachFrom(ComposableRobot robot) {
        return attachedRobot == robot && detach();
    }

    protected ComposableRobot getAttachedRobot() {
        return attachedRobot;
    }

    protected void setBattery(double amount) {
        this.battery = amount;
    }

    public double getBattery() {
        return this.battery;
    }

    public boolean isOn() {
        return this.power ? true : false; 
    }

}
