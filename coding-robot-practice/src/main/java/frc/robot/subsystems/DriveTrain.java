
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
public class DriveTrain {
    public SpeedController m_frontLeft;
    public SpeedController m_rearLeft;
    public SpeedController m_frontRight;
    public SpeedController m_rearRight;
    public DriveTrain(){
      m_frontLeft = new PWMVictorSPX(1);
      m_rearLeft = new PWMVictorSPX(2);
      m_frontRight = new PWMVictorSPX(3);
      m_rearRight = new PWMVictorSPX(4);
    }
    public SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);
    public SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);
    public void initDefaultCommand() {

    }
  }