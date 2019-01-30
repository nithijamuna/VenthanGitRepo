package Request;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
public class GetData {
	@Test
	public void testResponse()
	{
		
		try
		{
		
		Response res=RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
	
	int code=res.getStatusCode();
	System.out.print("The status code is DNA:"+   code);
	
	System.out.print("The status code is DNA");
	
	
	Assert.assertEquals(code,200 );
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
	}
	
	@Test
	public static void testres2()
	{
		
		try {
		Response res=RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		
		String val=res.asString();
		
		
		System.out.println("Print the value of API:" +val);
		System.out.println("Secoends the value of API:" +res.getTime());
		
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
