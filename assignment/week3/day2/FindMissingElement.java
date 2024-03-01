package home.assignment.week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Integer[] a ={1, 2, 3, 4, 10, 6, 8};  
		
		List<Integer> list=Arrays.asList(a);
		
		Collections.sort(list); 
		int total = a.length;
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]+1!= a[i+1])
			{
				System.out.println(a[i]);
			}
			
		}
		
		 int[] arr={10,9,8,7,5,4,3,1,2};
	        Arrays.sort(arr);
	        System.out.println("Array NUmber :" );
	        for(int i=0;i<arr.length-1;i++)
	        {
	            if(arr[i]+1!=arr[i+1])
	            {
	                System.out.println("Missing NUmber :" +arr[i]+1);
	                //break;
	            }
	        }
		
		
		
	}

}
