package frc.robot.autonomous.modes;

import frc.robot.autonomous.tasks.BrakeTask;
import frc.robot.autonomous.tasks.CoralScore;
import frc.robot.autonomous.tasks.DriveForwardTask;
import frc.robot.autonomous.tasks.ElevatorMove;

public class L2SideTest extends AutoModeBase {
    public void queueTasks() {
        queueTask(new DriveForwardTask(2.6, 0.4));
        queueTask(new ElevatorMove(2));
        queueTask(new CoralScore());
        
        queueTask(new BrakeTask());
    }
}
