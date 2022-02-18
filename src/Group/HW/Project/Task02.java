package Group.HW.Project;

public class Task02 {

	public static void main(String[] args) {
     //Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] num= {
				     {1,2,3,4},
				     {1,2,3,4},
				     {1,2,3,4},
				     {1,2,3,4}, 
		            };
		int total=0;
		;
		for(int i=0; i<num.length;i++) {
		for(int j=0; j<num.length;j++)	
			total+=num[i][j];
		}
		System.out.println(total);
	}

}
