package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.MecanumDrive;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class MecanumDriveSubSystem extends SubsystemBase{
    
    private WPI_VictorSPX frontLeft = new WPI_VictorSPX(9);
    private WPI_VictorSPX frontRight = new WPI_VictorSPX(1);
    private WPI_VictorSPX backLeft = new WPI_VictorSPX(8);
    private WPI_VictorSPX backRight = new WPI_VictorSPX(0);
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
