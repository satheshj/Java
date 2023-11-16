package LearningJava.OOPs.Encapusulation;

public class RestaurantBill {
	public static void main(String a[]) {
		Restaurant obj = new Restaurant();
		obj.setFood("Curd rice");
		obj.setPrice(120);
		System.out.println(
		obj.getFood()+
		+
		obj.getPrice());
	}
	
}
