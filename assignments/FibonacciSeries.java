package home.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10, firstNum=0, secondNo=1;
		int nextNum;
		for (int i = 1; i < n; i++) {
			System.out.println(firstNum + ",");
			nextNum=firstNum +secondNo;
			firstNum= secondNo;
			secondNo=nextNum;
			
			
		}

	}

}
