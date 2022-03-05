package org.login;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc5 extends BaseClass {

	public Tc5() {

		PageFactory.initElements(driver, this);

	}
	@FindBy(id="order_no")
	private WebElement dDnOrder;
	
	public WebElement getdDnOrder() {
		return dDnOrder;
	}
	
	public void orderNow() throws IOException {
		

		implicityWait(300);

		WebElement dnDOrder = getdDnOrder();
		String attribute = getAttribute(dnDOrder);
		writeData("adactin", 1, 7, attribute);
	}
	
}
