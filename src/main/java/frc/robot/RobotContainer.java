// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
// import frc.robot.Constants.AutoConstants;
import frc.robot.Ports.*;
// import frc.robot.autos.paths.[...];
import frc.robot.subsystems.Limelight;
import monologue.Logged;

public class RobotContainer implements Logged {
  private final Limelight limelight = new Limelight();

  public RobotContainer() {
    // configurations
  }
}
