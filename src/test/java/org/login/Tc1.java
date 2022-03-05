package org.login;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc1 extends BaseClass{

	public Tc1() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement txtUserName;

	@FindBy(id = "password")
	private WebElement txtPass;

	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void loginPage() throws IOException {
		
		WebElement txtUserName = getTxtUserName();
		String user = getdata("adactin", 1, 0);
		type(txtUserName, user);

		WebElement txtPass = getTxtPass();
		String pass = getdata("adactin", 1, 1);
		type(txtPass, pass);

		WebElement btnLogin =getBtnLogin();
		click(btnLogin);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
