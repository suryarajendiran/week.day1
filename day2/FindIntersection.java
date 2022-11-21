package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class FindIntersection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,2,11,4,6,7};
        int[] b= {1,2,8,4,9,7};
		List<Integer>data1=new ArrayList<Integer>();
        List<Integer>data2=new ArrayList<Integer>();
             for (int i = 0; i < a.length; i++) {
	    data1.add(a[i]);
	  }
        for (int j = 0; j < b.length; j++) {
	    data2.add(b[j]);
}
                      for (int i = 0; i < data1.size(); i++) {
		    for (int j = 0; j < data2.size(); j++) {
		if(data1.get(i)==data2.get(j)){
			System.out.println(data1.get(i));
	}
	}
}
	}
	}


/*
 * Pseudo Code

 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement
 
 *  f) Print the first array (shoud match item in both arrays)
 */
