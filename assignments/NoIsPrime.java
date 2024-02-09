package home.assignments;

public class NoIsPrime {

	public boolean isPrime(int num)
	{ 
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			
				if ( num % i == 0)
		{ 
			prime =false;
			break;
		}}
				if(prime) {
					
					return true;
									
				}
				else
				{
					return false;
				}
 		
		} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 NoIsPrime no = new NoIsPrime();
		 System.out.println(no.isPrime(67));
	}}

			
			
		


