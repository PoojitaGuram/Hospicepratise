package group;

import org.testng.annotations.Test;

public class TestMethod {
@Test(groups = "smoke")
public void create() {
	System.out.println("create");
}
@Test(groups = "regression")
public void delete() {
	System.out.println("delete");
}
	
}
