package it.unibo.design.robot.impl;

import java.util.Arrays;

public class RobotArm extends CommandableRobotPart{

    public static final double PICK_UP_DELTA_CONSUMPTION = 1.2;
    public static final double DROP_DOWN_DELTA_CONSUMPTION = 1.2;

    private boolean freeHand;

    public RobotArm() {
        this.freeHand = true;
    }

    protected boolean isGrabbing() {
        return this.freeHand == false ? true : false;
    }

    public void pickUp() {
        this.freeHand = false;
        this.setBattery(this.getBattery() - PICK_UP_DELTA_CONSUMPTION);
    }

    public void dropDown() {
        this.freeHand = true;
        this.setBattery(this.getBattery() - DROP_DOWN_DELTA_CONSUMPTION);
    }

    protected  double getConsumptionForPickUp() {
        return PICK_UP_DELTA_CONSUMPTION;
    }

    protected  double getConsumptionForDropDown() {
        return DROP_DOWN_DELTA_CONSUMPTION;
    }

    public String[] availableCommands() {
        return new String[]{"pickUp", "dropDown"};
    }

	public void sendCommand(String command) {
        if(command == availableCommands()[0] ) {
            pickUp();
        } else if (command == availableCommands()[1]) {
            dropDown();
        }
	}
}
