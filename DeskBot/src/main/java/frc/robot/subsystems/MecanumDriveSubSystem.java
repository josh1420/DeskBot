package frc.robot.subsystems;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class MecanumDriveSubSystem {
    
    private PWMVictorSPX frontLeft;
    private PWMVictorSPX frontRight;
    private PWMVictorSPX backLeft;
    private PWMVictorSPX backRight;
    private CommandXboxController drive;
    private final MecanumDrive mcnDrive = new MecanumDrive(frontLeft, backLeft,frontRight, backRight);
    

public MecanumDriveSubSystem(CommandXboxController ctrl){
    frontLeft = new PWMVictorSPX(0);
    frontRight = new PWMVictorSPX(1);
    backLeft = new PWMVictorSPX(2);
    backRight = new PWMVictorSPX(4);
    drive =ctrl;
}


public void Drive(){
    mcnDrive.driveCartesian(drive.getLeftX()*0.5, drive.getLeftY()*0.5, drive.getRightX()*0.5);
}

}
