package LearningJava.OOPs.Encapusulation;

public class BankAccount {
	public String name = "Sathesh";
	public long mobileNo = 908080123;
	public String accountType = "Savings";
	public String address = "abc colony, cbe-46";
	private int atmPin = 1602;
	private String userName = "satheshj";
	private String password = "dsyjrdj";
	public long accountLimit = 500000;
	public void setAtmPin(int pin) {
		this.atmPin = pin;
	}
	public int getAtmPin() {
		return atmPin;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
