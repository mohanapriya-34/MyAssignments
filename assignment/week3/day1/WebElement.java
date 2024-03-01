package home.assignment.week3.day1;

public class WebElement {

	public void click()
	{
		System.out.println("Click the URL: Belongs to Webelement class ");
	}
	  
	public void setText(String text)
	{
		System.out.println("Pass the string ::Belongs to Webelement class ");
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement we = new WebElement();
		we.click();
		we.setText("Priya");
	}

}
