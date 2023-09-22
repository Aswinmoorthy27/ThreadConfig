package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import BasePackage.Base;

public class MyLeadsPage extends Base {

	public Createlead Clickleads() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new Createlead();
	}

}
