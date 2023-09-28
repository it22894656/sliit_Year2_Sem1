package ex2;

//(a)
public class Test {
		
		public static void main(String[] args) {
			
			Feet f1 = new Feet(6,8);
			Feet f2 = new Feet(8,9);
			
			Feet f0 = new Feet(54,3);
			
			//chk (b)
			Feet f3 = new Feet(5, 6);
			f3.print("Length : ");
			
			//chk (c)
			Feet f4 = new Feet(f2);
			f4.print("chk (c) -> f4 :");
			
			//chk(d)
			Feet mylength = new Feet(5,6);
			Feet newlen = new Feet(6,7);
			mylength.add(newlen);
			mylength.print(); // 12’1”

			//chk (e)
			Feet.print(mylength);
			Feet.print(f0);
			
			//chk (g)
			Feet f5 = Feet.add(f1, f2, f3);
			Feet.print(f5);
		}
	
}
