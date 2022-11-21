package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		 List<Integer>a=new ArrayList<Integer>();
		    Collections.sort(a);
					   for (int i = 0; i < arr.length; i++) {
		  			    	int count=i+1;
		   	if(arr[i]!=count) {
		    		System.out.println(count);
		    		break;
						    	}
	}
	}
}
//Sort the array	
		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration