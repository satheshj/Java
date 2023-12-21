package LearningJava;

public class RevTriangle {
	public static void main(String ar[]) {
		int rows  = 3;
		//triangle
		for(int i = 0 ; i < rows ; i++) {
			for(int j =3; j>i;j--) {
				System.out.print(" ");
			}
			
			for(int k = 0; k<=i ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//revTriangle
		for(int i = 0 ; i < rows ; i++) {
			for(int j =0; j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int k = 3; k>i ; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
