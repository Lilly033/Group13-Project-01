package Group.HW.Project;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
/*Write a java program to check whether a given number is prime or not?
 * 
 */
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int j = 0;
		for (int i =2; i < num; i++) {
			if (num % i == 0) {
				j++;
				break;
			}
		}
		if (j == 0)
			System.out.println("Prime");
		else
			System.out.println("not Prime");
	}	
		
		
		
		
		
		
	}


