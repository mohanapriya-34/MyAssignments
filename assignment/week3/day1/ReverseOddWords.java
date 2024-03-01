package home.assignment.week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

          String test = "I am a software tester";
		
          String[] splitWords = test.split("\\s");
          //System.out.println(splitWords.length);
		for (int i = 0; i < splitWords.length; i++) {
			
			if(i%2!=0)
			{
			
          String oddWords = splitWords[i];
           //System.out.println("odd words:  " +oddWords);     
                String reverse="";
               // System.out.println("ODD WORDS LENGHT:  " +oddWords.length());
                for (int j = oddWords.length()-1; j>=0; j--) {
                    
                    
                    
                    char charAt = oddWords.charAt(j);
                    
                   // System.out.println(charAt);
                    reverse=reverse+charAt;
                    //System.out.print(reverse);
                    
                    }
                
                
                splitWords[i]=reverse;
                
                
    }
            
        }
		 String join = String.join(" ", splitWords);
	        System.out.println(join); 
		}
		
	}

	
