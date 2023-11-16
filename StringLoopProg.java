package LearningJava;

public class StringLoopProg {
	public static void main(String args[]) {
		String fiveMul[] = {"Five","Ten","Fifteen","Twenty","TwentyFive"};
		for(int i = 1; i < 30; i++) {
			if(i % 5 == 0) {
				System.out.println(fiveMul[(i/5) - 1]);
			} else {
				System.out.println(i);
			}
		}
	}

}
