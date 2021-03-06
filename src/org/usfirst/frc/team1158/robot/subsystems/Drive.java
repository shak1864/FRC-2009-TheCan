package org.usfirst.frc.team1158.robot.subsystems;

import org.usfirst.frc.team1158.robot.RobotMap;
import org.usfirst.frc.team1158.robot.subsystems.Drive.Shifter;
import org.usfirst.frc.team1158.robot.subsystems.Drive.Speed;


import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
private RobotDrive robotDrive;
	
	private SpeedController left;
	private SpeedController right;
    
    public enum Shifter {
		High, Low
	}

	public enum Speed {
		Normal, Slow
	}

	private Shifter currGear = Shifter.Low;
	private Speed currSpeed = Speed.Normal;
    
    public Drive() {
    	
    	left = new Victor(RobotMap.LEFT);
    	right = new Victor(RobotMap.RIGHT);
    	
    	robotDrive = new RobotDrive(left, right); 
    }
    
    public Shifter getCurrGear() {
		return currGear;
	}

	public Speed getCurrSpeed() {
		return currSpeed;
	}
 
	public void arcadeDrive(Joystick joystick) {
		double driveMove = 1 * joystick.getRawAxis(RobotMap.JOYSTICK_LEFT_Y);
		double turnMove = 1 * joystick.getRawAxis(RobotMap.JOYSTICK_RIGHT_X);
		robotDrive.arcadeDrive(driveMove, turnMove, true);
		
	}


	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
