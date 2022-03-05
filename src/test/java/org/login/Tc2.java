package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc2 extends BaseClass {

	public Tc2() {

		PageFactory.initElements(driver, this);

	}
	@FindBy(id="location")
	private WebElement dDnlocation;  
	
	@FindBy(id="hotels")
	private WebElement dDnhotel;
	
	@FindBy(id="room_type")
	private WebElement dDnroom;
	
	@FindBy(id="Submit")
	private WebElement dDnSubmit;

	public WebElement getdDnlocation() {
		return dDnlocation;
	}

	public WebElement getdDnhotel() {
		return dDnhotel;
	}

	public WebElement getdDnroom() {
		return dDnroom;
	}

	public WebElement getdDnSubmit() {
		return dDnSubmit;
	}
	public void submit() {
		
		WebElement dDnlocation = getdDnlocation();
		click(dDnlocation);
		selectByIndex(dDnlocation, 1);

		WebElement dDnhotel = getdDnhotel();
		click(dDnhotel);
		selectByIndex(dDnhotel, 1);

		WebElement dDnroom = getdDnroom();
		click(dDnroom);
		selectByIndex(dDnroom, 1);

		WebElement dDnSubmit = getdDnSubmit();
		click(dDnSubmit);

	}
	
}
