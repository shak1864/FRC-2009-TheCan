package org.usfirst.frc.team1158.robot.commands;

import org.usfirst.frc.team1158.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TurnCentralWheelOnCommand extends Command {

    public TurnCentralWheelOnCommand() {
        requires(Robot.shooter);
    }

    protected void initialize() {
    	
    	Robot.shooter.turnOnCentralWheel();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }


    protected void interrupted() {
    }
}
