package TestCases;

import java.io.IOException;
import java.sql.Driver;

import org.testng.annotations.Test;

import Resources.BaseClass;

public class VerifyLoginTestCase extends BaseClass {
	
	@Test
	public void login() throws IOException {
		
		browserLaunch();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
	}

}
