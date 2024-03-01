package home.assignment.week3.day1;

public class RadioButton extends Button{
	
	public void selectRadioButton()
	{
		System.out.println("Select the radio button :");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton rb = new RadioButton();
		rb.submit();
		rb.click();
		rb.getText();
		rb.setText("Priya");
	}
}
