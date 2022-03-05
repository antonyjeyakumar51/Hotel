package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc3 extends BaseClass{

	public Tc3(){

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement dDnselec;
	
	@FindBy(id="continue")
	private WebElement dDnContinue;

	public WebElement getdDnselec() {
		return dDnselec;
	}

	public WebElement getdDnContinue() {
		return dDnContinue;
	}
	public void continuePage() {
		

		WebElement dDnSelec = getdDnselec();
		click(dDnSelec);

		WebElement dDnContinue =getdDnContinue();
		click(dDnContinue);

	}
	
}
