// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc3352.Drivetrain.subsystems;
import org.usfirst.frc3352.Drivetrain.RobotMap;
import org.usfirst.frc3352.Drivetrain.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
/**
 *
 */
public class Drivechassis extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController left = RobotMap.drivechassisLeft;
    SpeedController right = RobotMap.drivechassisRight;
    RobotDrive robotDrive21 = RobotMap.drivechassisRobotDrive21;
    DoubleSolenoid shifter = RobotMap.drivechassisShifter;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	setDefaultCommand(new Drive());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void setMotors(double leftMotor, double rightMotor){
        left.set(leftMotor);
        right.set(-rightMotor);
    }
    public void shiftHigh(){
        shifter.set(DoubleSolenoid.Value.kReverse);
    }
    public void shiftLow(){
        shifter.set(DoubleSolenoid.Value.kForward);
    }
}
