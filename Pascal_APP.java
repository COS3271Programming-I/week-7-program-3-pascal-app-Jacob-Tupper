package pascal_app;

import java.io.PrintStream;

public class Pascal_APP {
	public static void main(String[] args) {
		
		//Creating variables and matrices
		PrintStream so = System.out;
		int[][] Pascal = new int [11][11];
		
		//Assigning the initial values
		Pascal[0][0] = 0;
		Pascal[0][1] = 1;
		
		//Calculating the table
		for (int i = 0; i<Pascal.length -1; i++) {
			for(int j = 1 ; j< Pascal.length; j++) {
				Pascal[i+1][j] = Pascal[i][j-1] + Pascal[i][j];
			}
		}
		//Writing out the table
		for (int i = 0; i<=Pascal.length-1; i++) {
			for(int j = 1 ; j<= Pascal.length-1; j++) {
				so.print(Pascal[i][j] + "\t");
			}
			so.print("\n");
		}
	}
}
