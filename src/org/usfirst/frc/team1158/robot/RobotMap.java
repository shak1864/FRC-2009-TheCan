package org.usfirst.frc.team1158.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static final int DRIVER_JOYSTICK = 0;
	public static final int OPERATOR_JOYSTICK = 1;
	
	public static final int JOYSTICK_LEFT_Y = 1;
	public static final int JOYSTICK_RIGHT_X = 4;

	//Drive Motors
	public static int LEFT = 0;
	public static int RIGHT = 1;
	
	//Drive Sensors
	public static int DRIVER_ENCODER_ONE_A = 0;
	public static int DRIVER_ENCODER_ONE_B = 1;

	public static int DRIVER_ENCODER_TWO_A = 2;
	public static int DRIVER_ENCODER_TWO_B = 3;
	
	//Shooter Motor
	public static int SHOOTER_WHEEL = 2;
	
	public static int CENTERAL_WHEEL = 3;
	
	public static int FLAPPER = 4;
	
	public static int COLLECTER = 5;
	
	//Shooter Sensors
	public static int SHOOTER_LIGHTSENSOR_A = 4;
	
	public static int FLAPPER_LIMIT_SWITCH_FRONT = 5;
	public static int FLAPPER_LIMIT_SWITCH_BACK = 6;
	
	
	
}
