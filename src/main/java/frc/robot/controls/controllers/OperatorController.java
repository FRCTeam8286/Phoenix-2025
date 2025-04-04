package frc.robot.controls.controllers;

public class OperatorController extends FilteredController {

  public OperatorController(int port) {
    super(port, false, false);
  }

  public OperatorController(int port, boolean useDeadband, boolean useSquaredInput) {
    super(port, useDeadband, useSquaredInput);
  }

  // CORAL
  public boolean getWantsCoralIntake() {
    return this.getRawButton(1);
  }

  // ELEVATOR
  public boolean getWantsElevatorReset() {
    return this.getRawButton(11);
  }

  public boolean getWantsElevatorStow() {
    return this.getRawButton(7);
  }

  public boolean getWantsElevatorL2() {
    return this.getRawButton(8);
  }

  public boolean getWantsElevatorL3() {
    return this.getRawButton(9);
  }

  public boolean getWantsElevatorL4() {
    return this.getRawButton(10);
  }

  public boolean getWantsA1() {
    return this.getHatDown();
  }

  public boolean getWantsA2() {
    return this.getHatUp();
  }

  public boolean getWantsGroundAlgae() {
    return this.getRawButton(12);
  }

  public boolean getWantsStopAlgae() {
    return this.getRawButton(11);
  }
public boolean getWantsStopCoralIntake() {
  return this.getRawButton(2);
}
public boolean getWantsBackupAndTurn() {
  return this.getRawButton(5);}
  public boolean getWantsForwardAndTurn() {
    return this.getRawButton(6);
}
}