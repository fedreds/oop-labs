package it.unibo.design.robot.impl;

import it.unibo.design.robot.api.RobotWithArms;

public class RobotWithTwoArms extends BaseRobot implements RobotWithArms {

    private int countObjects;
    private BasicArm arm1;
    private BasicArm arm2;

    public RobotWithTwoArms(String robotName) {
        super(robotName);
        this.arm1 = new BasicArm();
        this.arm2 = new BasicArm();
    }

    public boolean pickUp() {
        if(this.countObjects == 2) {
            return false;
        } else if(this.countObjects == 1) {
            if(this.arm1.isGrabbing()) {
                this.arm2.pickUp();
            } else {
                this.arm1.pickUp();
            }
            this.countObjects++;
            return true;
        } else {
            this.arm1.pickUp();
            this.countObjects++;
            return true;
        }
    }

        public boolean dropDown() {
        if(getCarriedItemsCount() == 0) {
            return false;
        } else if(getCarriedItemsCount() == 1) {
            if(this.arm1.isGrabbing()) {
                this.arm1.dropDown();
            } else {
                this.arm2.dropDown();
            }
            this.countObjects--;
            return true;
        } else {
            this.arm1.dropDown();
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
