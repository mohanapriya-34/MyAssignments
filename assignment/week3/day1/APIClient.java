package home.assignment.week3.day1;

public class APIClient {

	public void sendRequest(String endpoint)
	{
		//endpoint = "SendRequest";
		System.out.println("method 1 :" +endpoint );
	}
	
	public void sendRequest(String endpoint,String requestBody, boolean requestStatus)
	{
		//endpoint = "SendRequest method2";
		//requestBody = "RequestBody method2";
		System.out.println("method 2 :" +endpoint );
		System.out.println("method 2 :" +requestBody );
		System.out.println("method 2 Request:" +requestStatus );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient apc = new APIClient();
		apc.sendRequest("Priya");
		apc.sendRequest("Priya", "Method2.1", true);

	}

}
