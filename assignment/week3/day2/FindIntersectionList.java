package home.assignment.week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = {3, 2 ,11,4 ,6, 7};
		int[] a2 = {1, 2, 8, 4, 9, 7};
		List<Integer> allPrice = new ArrayList<Integer>();
		for (int i = 0; i < a1.length; i++) {
			//System.out.println(a1[i]);
		
			for (int j = 0; j < a2.length; j++) {
				//System.out.println(a2[j]);
				
				if (a1[i]==a2[j]) {
					//System.out.println("Duplicate no :  "  +a1[i]);
					allPrice.add(a1[i]);
					
				}
				
			}
		}
		System.out.println("Logic  : "+ allPrice);
		//int[] aa1 = {3, 2 ,11,4 ,6, 7};
		//int[] aa2 = {1, 2, 8, 4, 9, 7};
		List<Integer> array1 = new ArrayList<Integer>();
		array1.add(3);
		array1.add(2);
		array1.add(11);
		array1.add(4);
		array1.add(6);
		array1.add(7);
		
		List<Integer> array2 = new ArrayList<Integer>();
		array2.add(1);
		array2.add(2);
		array2.add(8);
		array2.add(4);
		array2.add(9);
		array2.add(7);
		
		List<Integer> allPrice2 = new ArrayList<Integer>();
		
		for (int i = 0; i < array1.size(); i++) {
			//System.out.println("Duplicate no **:  "  +array1.get(i));
			for (int j = 0; j < array2.size(); j++) {
				//System.out.println(a2[j]);
				//System.out.println("Duplicate no2 :  "  +array2.get(i));
				if (array1.get(i) == (array2.get(j))) {
					//System.out.println("Duplicate no :  "  +array1.get(i));
					allPrice2.add(array1.get(i));
					
				}
				
			}
		}
		
		System.out.println("Logic2*********:  "+ allPrice2);
		
	}

}
