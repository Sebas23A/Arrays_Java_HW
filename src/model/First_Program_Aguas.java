package model;

public class First_Program_Aguas {

	public static void main(String[] args) {
		int sum = 0;
		int[] givenArray = {2, 4, 7, 14, 16, 5, 1};
		
		for (int value: givenArray) {
			sum += value;
		}
			
		System.out.println("The sum of all numbers in the array is: " + sum);
	}

}
