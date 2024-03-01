package home.assignment.week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] comp = {"HCL, Wipro, Aspire, CTS"};
		System.out.println(Arrays.toString(comp));
		List<String> comp2 = Arrays.asList(comp);
		Collections.sort(comp2);
		System.out.println(comp2);
		for (int i = 0; i<comp2.size();  i++) {
			System.out.println(comp2.get(i));

			
		}
		
	}

}
