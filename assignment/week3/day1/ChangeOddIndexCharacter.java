package home.assignment.week3.day1;

//import java.util.Arrays;

public class ChangeOddIndexCharacter {

	public static void main(String[] args) {
		
		String test = "changeme";
		
		char[] ch = test.toCharArray();
		for (int i = 1; i < ch.length; i = i + 2) {
			ch[i] = Character.toUpperCase(ch[i]);
		}
		System.out.println("First Logic :  " + new String(ch));

		for (int i = 0; i < test.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(Character.toLowerCase(test.charAt(i)));
			} else {
				System.out.print(Character.toUpperCase(test.charAt(i)));
			}
		}

	}
}

