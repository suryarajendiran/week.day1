package week3.day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="We learn java basics as part of java sessions in java week1";
		String[] split=text.split(" ");
		int length = split.length;
			Set<String>set=new LinkedHashSet<String>();
		for (int i = 0; i < length; i++) {
			set.add(split[i]);		
		}
		System.out.println(set);
}	
	
}
	

/*
 * Pseudo code 
 
 * a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";		
 * b) Initialize an integer variable as count	  
 * c) Split the String into array and iterate over it 
 * d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. 
 * f) if the count > 1 then replace the word as "" 
 
 * g) Displaying the String without duplicate words	
 */



