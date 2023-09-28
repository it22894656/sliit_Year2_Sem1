package ex2;

public class Feet {
	private int feet;
	private int inches;
	
	public Feet() {
		
	}
	public Feet(int feet, int inches) {
		this.feet = feet;
		this.inches = inches;
	}
	
	//(c)
	public Feet(Feet f1) {
		this.feet = f1.feet;
		this.inches = f1.inches;
	}
	
	public void add(Feet f1, Feet f2) {
		int tot = 0;
		tot = f1.feet * 12 + f1.inches + f2.feet * 12 + f2.inches;
		this.feet = tot / 12;
		this.inches = tot % 12;
	}	
	
	//(d) adds current length to the new length and stores it in the current feet object 
	public void add(Feet f1) {
		int tot = this.feet * 12 + this.inches + f1.feet * 12 + f1.inches;
		this.feet = tot / 12;
		this.inches = tot % 12;
	}
	
	public void print() {
		System.out.println(this.feet + "'" + this.inches + "\"");
	}
	
	//(b) Overload the print() function to add a message to be printed in front of the length.
	public void print(String msg) {
		System.out.println(msg + feet + "'" + inches + "\"");
	}
	
	//(e)
	public static void print(Feet f1) {
		System.out.println("Length : " + f1.feet + "'" + f1.inches + "\"");
	}
	
	//(f)
	
	//(g)
	public static Feet add(Feet f1, Feet f2, Feet f3) {
		int tot = (f1.feet + f2.feet + f3.feet) * 12 + f1.inches + f2.inches + f3.inches;
		return (new Feet(tot / 12, tot % 12));
		
	}
	
}
