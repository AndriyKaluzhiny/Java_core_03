package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {
		Robot r = new Robot();
		RobotDancer rd = new RobotDancer();
		RobotCooker rc = new RobotCooker();
		CoffeeRobot cr = new CoffeeRobot();
		
		System.out.println(r.Work(r.workType));
		System.out.println(rd.Work(rd.workType));
		System.out.println(rc.Work(rc.workType));
		System.out.println(cr.Work(cr.workType));
	}
}
