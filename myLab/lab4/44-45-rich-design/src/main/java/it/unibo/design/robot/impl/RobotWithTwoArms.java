package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.RobotWithArms;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {

    private int countObjects;
    private BasicArm leftArm;
    private BasicArm rightArm;

    public RobotWithTwoArms(String robotName) {
        super(robotName);
        this.leftArm = new BasicArm();
        this.rightArm = new BasicArm();
    }

    public boolean pickUp() {
        if(this.countObjects == 2) {
            return false;
        } else if(this.countObjects == 1) {
            if(this.leftArm.isGrabbing()) {
                this.rightArm.pickUp();
            } else {
                this.leftArm.pickUp();
            }
            this.countObjects++;
            return true;
        } else {
            this.leftArm.pickUp();
            this.countObjects++;
            return true;
        }
    }

        public boolean dropDown() {
        if(getCarriedItemsCount() == 0) {
            return false;
        } else if(getCarriedItemsCount() == 1) {
            if(this.leftArm.isGrabbing()) {
                this.leftArm.dropDown();
            } else {
                this.rightArm.dropDown();
            }
            this.countObjects--;
            return true;
        } else {
            this.leftArm.dropDown();
            this.countObjects--;
            return true;
        }
    }

    public int getCarriedItemsCount() {
        return countObjects;
    }
    
    protected double getBatteryRequirementForMovement() {
        return MOVEMENT_DELTA_CONSUMPTION + MOVEMENT_DELTA_CONSUMPTION * getCarriedItemsCount();
    }

}
