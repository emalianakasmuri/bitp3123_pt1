package mathapp;

import controller.Multiplication;

public class MathApplication {
	
	public static void main (String args[]) {
		
		System.out.println("Demonstrating math application");
		
		Multiplication multiplication = new Multiplication();
		multiplication.generateMultiplicationTable(12);
		
		
		
	}

}
