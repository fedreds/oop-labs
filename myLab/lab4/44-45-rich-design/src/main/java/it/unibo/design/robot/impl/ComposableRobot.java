package it.unibo.design.robot.impl;

import java.util.Arrays;

import it.unibo.design.robot.api.Robot;

public abstract class ComposableRobot extends BaseRobot {

    private RobotPart[] componentList = new RobotPart[]{};
    public ComposableRobot(String robotName) {
        super(robotName);
    }

    public boolean attachComponent(RobotPart part) {
        if(part.attachTo(this)) {
            RobotPart[] temp = Arrays.copyOf(componentList, componentList.length + 1);
            componentList = temp;
            componentList[componentList.length-1] = part;
            return true;
        } else {
            return false;
        }        
    }

    public boolean detachComponent(RobotPart part) {
        if(part.detachFrom(this)) {
            for(int i = 0; i < componentList.length; i++) {
                if (componentList[i] == part) {
                    componentList[i] = null;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public void doCycle() {
        for(RobotPart elem : componentList) {
            if(elem instanceof BorderNavigator) {
                ((BorderNavigator)elem).cycle(this);
            }
        }
    }
}
