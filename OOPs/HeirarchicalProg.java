package LearningJava.OOPs;
class Batman{
	String name1 = "Bruce Wayne";
	void fight() {
		System.out.println("I fight with barehands");
	}
	
}
class NightWing extends Batman{
	String name2 = "Dick Grayson";
	void style() {
		System.out.println("NightWing fight with weapons");
	}
}
class Robin extends Batman{
	String name = "Damian Wayne";
	void fightStyle() {
		System.out.println("Robin fight with kendo sticks");
	}
	
}

public class HeirarchicalProg {
	public static void main(String args[]) {
		Robin obj = new Robin();
		System.out.println("I'm "+obj.name+" last robin of "+obj.name1);
		NightWing obj1 = new NightWing();
		System.out.println("I'm "+obj1.name2+" first robin of "+obj1.name1);
		obj.fight();
		obj.fightStyle();
		obj1.style();
		obj1.fight();
	}
}
