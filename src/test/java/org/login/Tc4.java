package org.login;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc4 extends BaseClass {

	public Tc4() {

		PageFactory.initElements(driver, this); 

	}
	
	@FindBy(id="first_name")
	private WebElement dDnfirst;
	
	@FindBy(id="last_name")
	private WebElement dDnlast;
	
	@FindBy(id="address")
	private WebElement dDnaddress;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement getdDncard;
	
	@FindBy(id="cc_type")
	private WebElement dDncctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement dDnmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dDnyear;
	
	@FindBy(id="cc_cvv")
	private WebElement dDncvv;
	
	@FindBy(id="book_now")
	private WebElement dDnbook;

	public WebElement getdDnfirst() {
		return dDnfirst;
	}

	public WebElement getdDnlast() {
		return dDnlast;
	}

	public WebElement getdDnaddress() {
		return dDnaddress;
	}

	public WebElement getdDncard() {
		return getdDncard;
	}

	public WebElement getdDncctype() {
		return dDncctype;
	}

	public WebElement getdDnmonth() {
		return dDnmonth;
	}

	public WebElement getdDnyear() {
		return dDnyear;
	}

	public WebElement getdDncvv() {
		return dDncvv;
	}

	public WebElement getdDnbook() {
		return dDnbook;
	}

	public void bookNow() throws IOException {
		

		WebElement txtFirst = getdDnfirst();
		String fname = getdata("adactin", 1, 2);
		type(txtFirst, fname);

		WebElement txtLast = getdDnlast();
		String lname = getdata("adactin", 1, 3);
		type(txtLast, lname);

		WebElement txtAddress = getdDnaddress();
		String address = getdata("adactin", 1, 4);
		type(txtAddress, address);

		WebElement txtcardnum = getdDncard();
		String card = getdata("adactin", 1, 5);
		type(txtcardnum, card);

		WebElement Ddncc = getdDncctype();
		click(Ddncc);
		selectByIndex(Ddncc, 1);

		WebElement Ddnmonth = getdDnmonth();
		click(Ddnmonth);
		selectByIndex(Ddnmonth, 3);

		WebElement Ddnyear = getdDnyear();
		click(Ddnyear);
		selectByIndex(Ddnyear, 12);

		WebElement txtcvv = getdDncvv();
		String cvv = getdata("adactin", 1, 6);
		type(txtcvv, cvv);

		WebElement Ddnbook = getdDnbook();
		click(Ddnbook);

	}
}
