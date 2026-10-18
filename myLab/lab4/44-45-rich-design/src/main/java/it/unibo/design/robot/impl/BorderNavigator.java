package it.unibo.design.robot.impl;

import it.unibo.design.robot.environment.api.Position2D;
import it.unibo.design.robot.environment.impl.RobotEnvironment;

public class BorderNavigator extends RobotPart {

    private String direction;

    public BorderNavigator() {
		this.direction = "right";
	}

	protected String[] specificCommands() {
        return new String[]{"cycle"};
    }

    public void cycle(ComposableRobot robot) {
        while (robot.isBatteryEnough(robot.getBatteryRequirementForMovement()) && !isAtBoundary(robot.getPosition())) {
            if (move(robot)) {
                if (isAtBoundary(robot.getPosition())) {
                    turnAtBoundary();
                }
            }
        }
    }

    private boolean move(ComposableRobot robot) {
        if ("right".equals(direction)) {
            return robot.moveRight();
        } else if ("up".equals(direction)) {
            return robot.moveUp();
        } else if ("left".equals(direction)) {
            return robot.moveLeft();
        } else if ("down".equals(direction)) {
            return robot.moveDown();
        }
        return false;
    }

    private boolean isAtBoundary(Position2D position) {
        return ("right".equals(direction) && position.getX() == RobotEnvironment.X_UPPER_LIMIT)
            || ("up".equals(direction) && position.getY() == RobotEnvironment.Y_UPPER_LIMIT)
            || ("left".equals(direction) && position.getX() == RobotEnvironment.X_LOWER_LIMIT)
            || ("down".equals(direction) && position.getY() == RobotEnvironment.Y_LOWER_LIMIT);
    }

    private void turnAtBoundary() {
        if ("right".equals(direction)) {
            setDirection("up");
        } else if ("up".equals(direction)) {
            setDirection("left");
        } else if ("left".equals(direction)) {
            setDirection("down");
        } else if ("down".equals(direction)) {
            setDirection("right");
        }
    }

    private void setDirection(String direction) {
        this.direction = direction;
    }
}
