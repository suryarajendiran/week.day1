package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		Integer data[]= {3,2,11,4,6,7};
	List<Integer>lar=new ArrayList<Integer>(Arrays.asList(data));
	Collections.sort(lar);
	
	for (int i = 1; i < lar.size(); i++) {
		int num=lar.get(i);
		System.out.println("second Largest number is" + " "+lar.get(4));

	 }
}
}



/*
Pseudo Code:
1) Arrange the array in ascending order
2) Pick the 2nd element from the last and print it
*/