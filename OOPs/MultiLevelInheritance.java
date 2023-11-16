package LearningJava.OOPs;

class Goa {
	int rs = 15000;

	void enjoyment() {
		System.out.println("Chill with Prends");
	}
}

class Tanjavur extends Goa {
	int expense = 3000;

	void workship() {
		System.out.println("Lord shiva");
	}
}

class LasVegas extends Tanjavur {
	int money = 100000;

	void visit() {
		System.out.println("Hear Heartless by weeknd");
	}
}

public class MultiLevelInheritance {
	public static void main(String args[]) {
		LasVegas xo = new LasVegas();
		System.out.println(xo.rs + " " + xo.expense + " " + xo.money);
		xo.enjoyment();
		xo.visit();
		xo.workship();
	}
}
