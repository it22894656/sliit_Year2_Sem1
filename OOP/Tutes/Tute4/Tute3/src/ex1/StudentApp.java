package ex1;
import java.util.*;

public class StudentApp {
	
	public static void main(String[] args) {
		
		//Declaring array and allocating memory for objects of type Student 
		Student st[] = new Student[5];
		//Creating actual Student Objects
		for(int i = 0; i < st.length; i++) {
			st[i] = new Student();
		}
		
		Scanner myInputs = new Scanner(System.in);
				
		//Get inputs
		for (int i = 0; i < st.length; i++) {
			System.out.println((i+1) + " :");
			System.out.print("\t" + "Name : ");
			st[i].setName(myInputs.next());
			System.out.print("\t" + "Degree : ");
			st[i].setDegree(myInputs.next());
			System.out.print("\t" + "Mobile : ");
			st[i].setMobile(myInputs.next());
			System.out.println();
			
		}
		
		System.out.println();
		
		//Print them
		for(int i = 0; i < st.length; i++) {
			st[i].print();
			System.out.println();
		}
		
		System.out.println();
		

		
		
	}

}
