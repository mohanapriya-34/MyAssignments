package home.assignments;

public class PalindromNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;    
		  int n=123;//It is the number variable to be checked for palindrom  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
	}


