// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.LimelightHelpers;

public class Limelight extends SubsystemBase {
  private NetworkTable table;
  private NetworkTableEntry tv;
  private NetworkTableEntry tx;
  private NetworkTableEntry ts;
  private NetworkTableEntry ty;
  private NetworkTableEntry ta;

  /** Creates a new Limelight. */
  public Limelight() {
    table = NetworkTableInstance.getDefault().getTable("limelight");

    // tv = table.getEntry("tv");
    // tx = table.getEntry("tx");
    // ta = table.getEntry("ta");
    // ty = table.getEntry("ty");

    // Basic targeting data
    tv = LimelightHelpers.getTV(""); // Do you have a valid target?
    tx = LimelightHelpers.getTX(""); // Horizontal offset from crosshair to target in degrees
    ty = LimelightHelpers.getTY(""); // Vertical offset from crosshair to target in degrees
    ta = LimelightHelpers.getTA(""); // Target area (0% to 100% of image)
    // boolean hasTarget = LimelightHelpers.getTV(""); // Do you have a valid target?

    // double txnc =
    //     LimelightHelpers.getTXNC(
    //         ""); // Horizontal offset from principal pixel/point to target in degrees
    // double tync =
    //     LimelightHelpers.getTYNC(
    //         ""); // Vertical  offset from principal pixel/point to target in degrees
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

    // SmartDashboard.putNumber("tv", tv.getDouble(0.0));
    SmartDashboard.putNumber("tx", tx.getDouble(0.0));
    SmartDashboard.putNumber("ta", ta.getDouble(0.0));
    SmartDashboard.putNumber("ty", ty.getDouble(0.0));
  }
}
