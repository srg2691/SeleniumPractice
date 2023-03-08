package testngsessions;

import org.testng.annotations.Test;

public class PriorityTest {
	

	@Test()
	public void a_test() {
		System.out.println("a test");
	}

	@Test()
	public void b_test() {
		System.out.println("b test");
	}

	@Test()
	public void c_test() {
		System.out.println("c test");
	}

	@Test(priority = 1)
	public void d_test() {
		System.out.println("d test");
	}

	@Test(priority = 2)
	public void e_test() {
		System.out.println("e test");
	}
	
	
	//if priority is duplicate for diff test cases, then alphabetical order is followed for the tcs having same priority
	//priority can be in int range -xyz to +xyz
	//if only some tcs have a priority then firstly in alphabetical order, non priority tcs will be run first and then the priority tcs

}
