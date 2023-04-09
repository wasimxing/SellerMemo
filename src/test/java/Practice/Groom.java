package Practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Groom {
	
	@Parameters("BROWSER")
	
	@Test
	public void m1(String browser) {
		System.out.println(browser);
		System.out.println("java");
		System.out.println("hello");
	}

}
