package org.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.login.Tc1;
import org.login.Tc2;
import org.login.Tc3;
import org.login.Tc4;
import org.login.Tc5;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel extends BaseClass {
	public static void main(String[] args) throws IOException {
		
		getDriver();
		
		getUrl("https://adactinhotelapp.com/");

		Tc1 p1 = new Tc1();
		p1.loginPage();

		Tc2 p2 = new Tc2();
		p2.submit();

		Tc3 p3 = new Tc3();
		p3.continuePage();

		Tc4 p4 = new Tc4();
		p4.bookNow();

		Tc5 p5 = new Tc5();
		p5.orderNow();

	}

}
