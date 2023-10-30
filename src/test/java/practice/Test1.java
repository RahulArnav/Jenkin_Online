package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	@Test(invocationCount = 2, priority = 1,enabled = true)
	public void create() {
		Assert.fail();
		System.out.println("Create");
	}

	@Test(priority = 1,dependsOnMethods = "create")
	public void delete() {
		System.out.println("delete");
	}

	@Test(priority = -3)
	public void modify() {
		System.out.println("modify");
	}
}
