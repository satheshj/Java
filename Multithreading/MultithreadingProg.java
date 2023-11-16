package LearningJava.Multithreading;

class SoftwareUpdate extends Thread{
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.println("Updating software");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Restart extends Thread{
	public void run() {
		for(int i = 0;i <= 5; i++) {
		System.out.println("Restarting");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

public class MultithreadingProg {
	public static void main(String a[]) {
		SoftwareUpdate soft = new SoftwareUpdate();
		
		Restart re  = new Restart();
		soft.start();
		re.start();
		
	}

}
