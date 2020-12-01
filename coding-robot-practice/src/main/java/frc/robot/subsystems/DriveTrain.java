
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
public class DriveTrain {
    SpeedController m_frontLeft = new PWMVictorSPX(1);
    SpeedController m_rearLeft = new PWMVictorSPX(2);
    SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);
 
    SpeedController m_frontRight = new PWMVictorSPX(3);
    SpeedController m_rearRight = new PWMVictorSPX(4);
    SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);
 
    DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);
    public void initDefaultCommand() {

    }
 
    public void takeJoystickInputs(Joystick left, Joystick right) {
      m_drive.tankDrive(left.getY(), right.getY());
    }
 
    public void stop() {
       m_drive.stopMotor();
    }
  }