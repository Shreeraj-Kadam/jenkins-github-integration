package mavenParameter;

import org.testng.annotations.Test;

public class MavenParameterDemoTest {
	
	@Test
	public void parameterDemo() {
		String url = System.getProperty("url", "https://flipcart.com");
		String user = System.getProperty("user", "user2");
		String password = System.getProperty("password", "user2@1234");
		
		System.out.println(url);
		System.out.println(user);
		System.out.println(password);
		
	}
	
	
}
