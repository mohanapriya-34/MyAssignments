package home.assignment.week3.day1;

public class LoginPage extends BasePage {
	
	public void performCommonTasks(String commonTask)
	{
		System.out.println("Perform Common Tasks : " +commonTask );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp = new LoginPage();
		lp.performCommonTasks("Overrided Method");
	}

}
