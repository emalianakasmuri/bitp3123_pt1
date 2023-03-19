package controller;


public class Multiplication {
	
	private int minCounter = 1;
	private int maxCounter = 12;
	
	public void generateMultiplicationTable (int number) {
		
		System.out.println("\nMultiplication Table for " + number);
		
		int result = 0;
		for (int counter = minCounter; counter < maxCounter; counter++) {
			
			result = number * counter;
			
			System.out.println(number + " x " + counter + " = " + result);
			
		}
		

		
	}

}
