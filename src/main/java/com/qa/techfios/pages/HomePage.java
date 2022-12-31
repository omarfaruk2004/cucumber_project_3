package com.qa.techfios.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.techfios.customactions.CustomWebDriverMethods;

public class HomePage extends CustomWebDriverMethods {

	WebDriver driver;
	
	@FindBy(css = "button[onclick*='Sky']")
	private WebElement setSkyBlueBackgroundButton;

	public WebElement getSetSkyBlueBackgroundButton() {
		return this.setSkyBlueBackgroundButton;
	}
	
	public boolean isBackgroundButtonExists(String backgroundColor) {
		WebElement element = driver.findElement(By.xpath("//button[text()='"+backgroundColor+"']"));
		return isElementDisplayed(element);
	}
	
	@FindBy(css = "body")
	private WebElement backGroundBodyElement;

	public WebElement getbackGroundBodyElement() {
		return this.backGroundBodyElement;
	}
	
	@FindBy(css = "button[onclick*='White']")
	private WebElement setWhiteBackgroundButton;

	public WebElement getSetWhiteBackgroundButton() {
		return this.setWhiteBackgroundButton;
	}
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*public String isSetSkyBlueBackgroundButtonExists() {
		return getElementText(getSetSkyBlueBackgroundButton());
	}*/
	
	public void clickSkyBlueBackgroundButton() {
		customClick(getSetSkyBlueBackgroundButton());
	}
	
	/*public String isSetWhiteBackgroundButtonExists() {
		return getElementText(getSetWhiteBackgroundButton());
	}*/
	
	public void clickWhiteBackgroundButton() {
		customClick(getSetWhiteBackgroundButton());
	}
	
	public String getBackGroundColor(String attributeName) {
		return getAttributeValue(backGroundBodyElement, attributeName);
	}

}
