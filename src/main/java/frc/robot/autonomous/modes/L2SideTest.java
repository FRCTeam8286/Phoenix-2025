package frc.robot.autonomous.modes;

import frc.robot.autonomous.tasks.BrakeTask;
import frc.robot.autonomous.tasks.DriveTrajectoryTask;

public class L2SideTest extends AutoModeBase {
    public void queueTasks() {
        queueTask(new DriveTrajectoryTask("L2 Side"));
        
        
        queueTask(new BrakeTask());
    }
}
