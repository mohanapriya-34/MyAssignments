package home.assignment.week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn Java basics as part of java sessions in java week1 We Java";
		String[] words = text.split("\\s");
		int count =0;
			for (int i = 0; i < words.length; i++) {
				
				
				for (int j = i+1; j < words.length; j++) {
					if(words[i].equals((words[j])))
					{
			            count = count+1;  
			            System.out.println(count);
			            System.out.println("Duplicate words: " +words[i]);
					
					}
				}
			}
		}
	}
	
				
			
		
			
	


