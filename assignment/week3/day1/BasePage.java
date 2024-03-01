package home.assignment.week3.day1;

public class BasePage {
	
	public void findElement(String find)
	{
		System.out.println("Find the element : " +find );
	}
	public void clickElement(String click)
	{
		System.out.println("Click the element : " +click);
	}
	public void enterText(String text)
	{
		System.out.println("Enter the text  element : " +text );
	}
	public void performCommonTasks(String commonTask)
	{
		System.out.println("Perform Common Tasks : " +commonTask );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePage bp = new BasePage();
		bp.findElement("Priya");
		bp.clickElement("Name");
		bp.enterText("TesLeaf");
		bp.performCommonTasks("Method Override");
	}

}
