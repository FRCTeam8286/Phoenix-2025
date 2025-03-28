package frc.robot.autonomous.tasks;
import frc.robot.subsystems.Elevator;
import edu.wpi.first.wpilibj.Timer;

public class ElevatorMove extends Task{
    public Elevator m_elevator;
    private double m_level; // Store Level as a class-level field
    private Timer m_timer; // Timer for handling delays
    private boolean m_elevatorcalled; // track if the elevator has been caleld
    private boolean m_elevatorReached; // Track if the elevator has reached its position

    public ElevatorMove(double Level) {
        this.m_elevator = Elevator.getInstance();
        this.m_level = Level; // Store Level for later use
        this.m_timer = new Timer(); // Initialize the timer
        this.m_elevatorReached = false; // Initially, the elevator hasn't reached its position
        this.m_elevatorcalled = false;
    }
    @Override
    public void start() {
        m_timer.reset();
        m_timer.start();
    }
  
    @Override
    public void update() {
        if (!m_elevatorReached) {
            // Move the elevator to the desired level
            if (m_level == 2 & m_elevatorcalled == false) {
                m_elevator.goToElevatorL2();
                m_elevatorcalled = true;
            } else if (m_level == 3 & m_elevatorcalled == false) {
                m_elevator.goToElevatorL3();
                m_elevatorcalled = true;
            } else {                
                m_elevatorcalled = true;
                return; // Exit if the level is invalid
            }

            // Wait for 1 second (or adjust as needed) before scoring
            if (m_timer.get() > 3.0) { // 1-second delay
                m_elevatorReached = true; // Mark the elevator as reached
            }
        }
    }
  
    @Override
    public boolean isFinished() {
        return m_elevatorReached;
    }
}