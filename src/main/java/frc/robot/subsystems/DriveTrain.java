/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  //TalonSRX objects
  private static final TalonSRX portMotor = new TalonSRX(Constants.CANIds.TalonSRX_Port_Address);
  private static final TalonSRX starboardMotor = new TalonSRX(Constants.CANIds.TalonSRX_Starboard_Address);

  /**
   * Creates a new DriveTrain. (Runs when the robot starts)
   * @author Joe
   */
  public DriveTrain() {
    // Set everything to default at startup.
    portMotor.configFactoryDefault();
    starboardMotor.configFactoryDefault();
  }

  /**
   * Drives the robot by taking a speed for each side.
   * @author Joe
   * @param port_speed A number from [-1,1]
   * @param starboard_speed A number from [-1,1]
   */
  public void FlyByWire(double port_speed, double starboard_speed){
    portMotor.set(ControlMode.PercentOutput, port_speed);
    starboardMotor.set(ControlMode.PercentOutput, starboard_speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
