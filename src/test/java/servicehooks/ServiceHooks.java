package servicehooks;

import com.qa.techfios.base.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks extends TestBase{
	
	@Before
	public void setUp() {
		initializeBrowser();
		driver.get(properties.getProperty("url"));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
