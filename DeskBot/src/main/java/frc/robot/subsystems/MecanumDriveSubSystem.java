package frc.robot.subsystems;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class MecanumDriveSubSystem extends SubsystemBase{
    
    private PWMVictorSPX frontLeft = new PWMVictorSPX(9);
    private PWMVictorSPX frontRight = new PWMVictorSPX(1);
    private PWMVictorSPX backLeft = new PWMVictorSPX(8);
    private PWMVictorSPX backRight = new PWMVictorSPX(0);
    private CommandXboxController drive;
    private final MecanumDrive mcnDrive = new MecanumDrive(frontLeft, backLeft,frontRight, backRight);
    

public MecanumDriveSubSystem(CommandXboxController ctrl){

    backLeft.setInverted(true);
    frontLeft.setInverted(true);
    drive = ctrl;
}


public void Drive(){
    mcnDrive.driveCartesian(drive.getLeftY()*0.5, drive.getLeftX()*0.5, drive.getRightX()*-0.5);
}

}
