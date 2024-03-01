package home.assignment.week4.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		String companyName = "google";
		Set<Character> unq=new LinkedHashSet<Character>();
		for (Character words : companyName.toCharArray()) {
			unq.add(words);
			
		}
		
		
		System.out.println(unq);
	}

}
