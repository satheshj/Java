package LearningJava.Exceptions;

public class IndexOutExp {
	public static void main(String ar[]) {
		int arr[] = {1,2,3};
		String strw = null;
		try {
			arr[3]  = 2;
			strw.charAt(9);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
		
		System.out.println("After exceptions");
		
	}

}
