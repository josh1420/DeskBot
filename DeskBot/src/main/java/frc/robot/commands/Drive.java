package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.MecanumDriveSubSystem;

public class Drive {
    public MecanumDriveSubSystem m_SubSystem;
     public Drive(MecanumDriveSubSystem subsystem) {
    m_SubSystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
   // addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_SubSystem.Drive();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
