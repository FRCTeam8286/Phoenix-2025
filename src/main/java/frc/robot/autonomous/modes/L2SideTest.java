package frc.robot.autonomous.modes;

import frc.robot.autonomous.tasks.BrakeTask;
import frc.robot.autonomous.tasks.DriveForwardTask;
import frc.robot.autonomous.tasks.DriveTrajectoryTask;

public class L2SideTest extends AutoModeBase {
    public void queueTasks() {
        queueTask(new DriveForwardTask(2.6, 0.4));
        
        
        queueTask(new BrakeTask());
    }
}
