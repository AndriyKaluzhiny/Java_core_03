package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {
		Animal a = new Animal();
		
		System.out.println(a);
		System.out.println("Вік тварини:  " + a.getAge());
		a.setAge(14);
		a.setName("Бик");
		a.setSpeed(2);
		
		
		System.out.println(a);
	}
}
