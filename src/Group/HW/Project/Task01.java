package Group.HW.Project;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
	/*  Create an array on int values using a scanner  
	 *  and calculate the sum of all stored elements in that array.
	 */
		

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		
		int size=scan.nextInt();
		int[] arr=new int [size];
		int sum=0;
		System.out.println("Enter the element's of the array");
		
		for(int i=0; i<(size); i++)	{
		arr[i]=scan.nextInt();
		}
		
		for (int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of all elements in the array = "+sum);
		
		
	}

}
