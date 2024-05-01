package testNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	String name = "Mithran";
	
	@Test
	public void assertTest() {
//		Assert.assertEquals(name, "name");
//		Assert.assertEquals(name, "Mithran");
		
		Assert.assertNotEquals(name, "mithran");
		Assert.assertNull(name);
		Assert.assertNotNull(null);
		
		Assert.assertSame(name,name);
		Assert.assertTrue(false);
	}
}
