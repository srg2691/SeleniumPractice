package testngsessions;

import org.testng.annotations.Test;

public class InvocationCount {
	
	
	@Test(invocationCount = 10)//to run the test a fixed number of times, here 10
	public void createUserTest() {
		System.out.println("create user");
	}	
	

}
