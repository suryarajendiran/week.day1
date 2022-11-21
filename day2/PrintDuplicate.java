package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer>num1=new ArrayList<Integer>();
		Collections.sort(num1);
					for (int k = 0; k < data.length; k++) {
						
				for (int l = k+1; l < data.length; l++) {
					if (data[k]==data[l]) {
						System.out.println(data[k]);
					}
					}
				}
	}

}
//get the length of the array
// declare an int variable named count

// iterate from 0 to the array length-1 (outer loop starts here)

	// assign 0 to count 
	
	// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
	
			// compare both the loop variables & check they're equal
		
					// print the matching value
			