package Group.HW.Project;

public class Task04 {

	public static void main(String[] args) {
/*Create a 2D array of integers.
 *Develop a program which will calculate the sum of  even and odd numbers for that array.
 */
		int[][] nums = {
				{ 1,2,3,4,5 },
				{ 6,7,8,9,10,11},
				{ 12,13, }
				};
		int evenSum=0, oddSum=0;
		for (int[] row : nums) {
		for (int col : row) {
		if (col % 2 == 0) {
			evenSum+=col;
		}else {
			oddSum+=col;
				}
			}
		}
	System.out.println("The sums of Even numbers and Odd numbers in this Array are "
			+ ""+evenSum+" and "+oddSum);
		
		
		
		
	
	
	
	
}
}
