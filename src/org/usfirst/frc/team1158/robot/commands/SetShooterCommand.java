package org.usfirst.frc.team1158.robot.commands;

import org.usfirst.frc.team1158.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetShooterCommand extends Command {

    private double speed;

	public SetShooterCommand(double speed) {
    	requires(Robot.shooter);
    	this.speed = speed;
    }

    protected void initialize() {
    	
    	Robot.shooter.setShooterSpeed(speed);
    	
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
