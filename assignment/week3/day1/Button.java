package home.assignment.week3.day1;

public class Button extends WebElement{
	
	public void submit()
	{
		System.out.println("Submit the data:");
	}

	public void getText()
	{
		System.out.println("Get the text data :");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Button b = new Button();
       b.submit();
       b.click();
       b.getText();
       b.setText("Priya");
	}

}
