package group;

import org.testng.annotations.Test;

public class ExecuteMethod {
	public class TestMethod {
		@Test(groups = "smoke")
		public void update() {
			System.out.println("update");
		}
		@Test(groups = {"smoke","regression"})
		public void execute() {
			System.out.println("execute");
		}

}}
