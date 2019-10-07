
public class OldRobotBuilder  implements RobotBuilder {
	
	private Robot robot;
	
	
	public OldRobotBuilder() {
		this.robot = new Robot();
	}

	public void buildRobotHead() {
		robot.setRobotHead("Tin Head");
	}

	
	public void buildRobotTorso() {
		robot.setRobotTorso("Tin Torso");
	}

	
	public void buildRobotArms() {
		robot.setRobotArms("Long arms");
	}

	
	public void buildRobotLegs() {
		robot.setRobotLegs("Roller Skates");
	}

	
	public Robot getRobot() {
		System.out.println("Robozinho");
		return this.robot;
	}
}
