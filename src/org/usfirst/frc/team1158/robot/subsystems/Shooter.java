package org.usfirst.frc.team1158.robot.subsystems;

import org.usfirst.frc.team1158.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {

    private SpeedController centralWheel;
    private SpeedController shooterWheel;
    
    private Encoder shooterEncoder;
    
    public Shooter() {
    	
    	centralWheel = new Victor(RobotMap.CENTERAL_WHEEL);
    	shooterWheel = new Victor(RobotMap.SHOOTER_WHEEL);
    	
    	shooterEncoder = new Encoder(RobotMap.SHOOTER_ENCODER_A, RobotMap.SHOOTER_ENCODER_B);
    }
    
    public void setShooterSpeed(double speed) {
    	
    	shooterWheel.set(speed);
    	
    }
    
    public void turnOnCentralWheel() {
    	
    	centralWheel.set(1);
    	
    }
    
    public void turnOffCentralWheel() {
    	
    	centralWheel.set(0);
    	
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

