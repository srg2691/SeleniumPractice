package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	@Test(expectedExceptions = ArithmeticException.class)//we have to give the expected exception 
	//OR give the super class for Exceptions - Exception class or Throwable class
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;
	}
	

}
