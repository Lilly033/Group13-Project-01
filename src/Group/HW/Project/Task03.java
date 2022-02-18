package Group.HW.Project;

public class Task03 {

	public static void main(String[] args) {
/*Create a 2D array or integer type where you will store odd and even numbers.
 *  Develop a program which will identify/print the even numbers only.
 * 
 */
		
	int [][]nums= {{1,2,3,4,5},
	              { 6,7,8,9,10}, 
	            };
	System.out.println("Even numbers in this Array are:");
	for (int[] row : nums) {
	for (int col : row) {
	if (col% 2 == 0) {
	System.out.print(col + " ");
			}
		}
	}
	
		
		
	
	
	
	
		
	
	
		
		
		
		
	}

}
