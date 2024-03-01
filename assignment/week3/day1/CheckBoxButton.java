package home.assignment.week3.day1;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton()
	{
		System.out.println("Verify the check box is enabled and click it: ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxButton cbb = new CheckBoxButton();
       cbb.submit();
       cbb.click();
       cbb.getText();
       cbb.setText("Priya");
	}
	
	
	
	}
