package it.unibo.design.robot.impl;

public class BasicArm {

    public static final double PICK_UP_DELTA_CONSUMPTION = 1.2;
    public static final double DROP_DOWN_DELTA_CONSUMPTION = 1.2;

    private boolean freeHand;

    public BasicArm() {
        this.freeHand = true;
    }

    protected boolean isGrabbing() {
        return this.freeHand == false ? true : false;
    }

    public void pickUp() {
        this.freeHand = false;
    }

    public void dropDown() {
        this.freeHand = true;
    }

    public double getConsumptionForPickUp() {
        return PICK_UP_DELTA_CONSUMPTION;
    }

    public double getConsumptionForDropDown() {
        return DROP_DOWN_DELTA_CONSUMPTION;
    }

}
