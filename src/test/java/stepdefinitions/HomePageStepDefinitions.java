package stepdefinitions;

import org.junit.Assert;

import com.qa.techfios.base.TestBase;
import com.qa.techfios.pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDefinitions {
	
	HomePage homepage = new HomePage(TestBase.driver);

	@Given("^\"([^\"]*)\" button exists$")
	public void button_exists(String backgroundColor){//Set SkyBlue Background
	    boolean actual = homepage.isBackgroundButtonExists(backgroundColor);
	    Assert.assertTrue(actual);
	    System.out.println("Sky blue button exists");
	}

	@When("^I click on the skyBlue button$")
	public void i_click_on_the_skyBlue_button() {
		homepage.clickSkyBlueBackgroundButton();
	}
	
	@When("^I click on the white button$")
	public void i_click_on_the_white_button() {
		homepage.clickWhiteBackgroundButton();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue(){
		String color = homepage.getBackGroundColor("style");
		color = color.split(": ")[1];//background-color: skyblue;
		color = color.replace(";", "");
		Assert.assertEquals("skyblue", color);
		System.out.println("background color has changed to sky blue");
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white(){
		String color = homepage.getBackGroundColor("style");
		color = color.split(": ")[1];//background-color: white;
		color = color.replace(";", "");
		Assert.assertEquals("white", color);
		System.out.println("background color has changed to white");
	}
	
	
}
