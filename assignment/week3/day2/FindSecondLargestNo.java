package home.assignment.week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a ={3,2,11,4,6,7};  
		
		List<Integer> list=Arrays.asList(a);
		
		Collections.sort(list); 
		int totatl = a.length;
		System.out.println("List of numbers : " +a[totatl - 2]);
		
		
	}

}
