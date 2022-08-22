package model;

public class Third__Program_Aguas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] storage = toPower(6,3);
		
		// Printing the elements of the array
        for (int i = 0; i < storage.length; i++)
            System.out.print(storage[i] + " ");
	}
	
	public static int[] toPower(int size, int power) {
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.pow(i, power);
		}
		return arr;
		
	}

}
