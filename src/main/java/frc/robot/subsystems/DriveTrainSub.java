// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrainSub extends SubsystemBase 
{
  /** Creates a new DriveTrainSub.4 */
  private Victor leftDrive1;
  private Victor leftDrive2;
  private Victor rightDrive1;
  private Victor rightDrive2;
  public DriveTrainSub() 
  {
    leftDrive1 = new Victor(Constants.LEFT_DRIVE_1);
    leftDrive2 = new Victor(Constants.LEFT_DRIVE_2);
    rightDrive1 = new Victor(Constants.RIGHT_DRIVE_1);
    rightDrive2 = new Victor(Constants.RIGHT_DRIVE_2);
  }

  public void setRightMotors(double speed)
  {
    rightDrive1.set(speed * Constants.DRIVE_SPEED);
    rightDrive2.set(speed * Constants.DRIVE_SPEED);
  }

  public void setLeftMotors(double speed)
  {
    leftDrive1.set(speed * Constants.DRIVE_SPEED);
    leftDrive2.set(speed * Constants.DRIVE_SPEED);
  }

  @Override
  public void periodic() 
  {
    // This method will be called once per scheduler run
  }
}
