package org.usfirst.frc.team1158.robot.subsystems;

import org.usfirst.frc.team1158.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
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
    
    private SpeedController flapper;
    
    private DigitalInput flapperLimitFront;
    private DigitalInput flapperLimitBack;
    
    public Shooter() {
    	
    	centralWheel = new Victor(RobotMap.CENTERAL_WHEEL);
    	shooterWheel = new Victor(RobotMap.SHOOTER_WHEEL);
    	flapper = new Victor(RobotMap.FLAPPER);
    	
    	shooterEncoder = new Encoder(RobotMap.SHOOTER_ENCODER_A, RobotMap.SHOOTER_ENCODER_B);
    	
    	flapperLimitFront = new DigitalInput(RobotMap.FLAPPER_LIMIT_SWITCH_FRONT);
    	flapperLimitBack = new DigitalInput(RobotMap.FLAPPER_LIMIT_SWITCH_BACK);
    	
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
    
    public void getLimitFront() {
    	
    	flapperLimitFront.get();
    	
    }
    
    public void getLimitBack() {
    	
    	flapperLimitBack.get();
    	
    }
    
    public void setFlapperSpeed(double speed) {
    	
    	flapper.set(speed);
    	
    }

    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

