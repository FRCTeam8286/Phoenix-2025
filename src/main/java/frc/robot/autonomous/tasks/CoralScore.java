package frc.robot.autonomous.tasks;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.subsystems.Coral;

public class CoralScore extends Task {
    public Coral m_coral;
    private boolean m_coralDone; // Track if the elevator has reached its position
    private boolean m_scoreCalled;
    private boolean m_done;
    
    private Timer m_timer; // Timer for handling delays

    public CoralScore() {
        this.m_coral = Coral.getInstance();
        this.m_coralDone = false; // Initially, the elevator hasn't reached its position
        this.m_timer = new Timer(); // Initialize the timer
        this.m_done = false;
    }
    @Override
    public void start() {
        this.m_scoreCalled = false;        
        m_timer.reset();
        m_timer.start();
    }
  
    @Override
    public void update() {
        if (!m_scoreCalled){            
            // Perform the scoring action
            m_coral.scoreL24();
        }
        else if(m_timer.get() > 1.0){
            m_coralDone = true;
        }
    }
  
    @Override
    public boolean isFinished() {
        return m_coralDone;
    }
}
