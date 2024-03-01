package home.assignment.week3.day2;

public class JavaConnection {
	
	public void connect()
	{
	System.out.println("Connect the Interface and Class");	
	}
	public void disconnect()
	{
		
			System.out.println("Disconnect the Interface and Class");	
			
	}
	public void executeUpdate()
	{
		
			System.out.println("Execute the Interface and Class");	
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       JavaConnection jc = new JavaConnection();
       jc.connect();
       jc.disconnect();
       jc.executeUpdate();
	}

}
