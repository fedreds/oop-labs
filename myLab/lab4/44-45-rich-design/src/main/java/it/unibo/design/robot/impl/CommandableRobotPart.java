package it.unibo.design.robot.impl;

import java.util.Arrays;

public abstract class CommandableRobotPart extends RobotPart {

    public abstract void sendCommand(String command);
    
    public abstract String[] availableCommands();
    
}
