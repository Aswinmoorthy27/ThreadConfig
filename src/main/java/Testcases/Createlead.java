package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import BasePackage.Base;

public class Createlead extends Base {

	public Createlead Createlead() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return this;

	}

	public Createlead Companyname(String Companyname) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(Companyname);
		return this;
	}

	public Createlead Firstname(String Firstname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(Firstname);
		return this;

	}

	public Createlead Lastname(String Lastname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(Lastname);
		return this;

	}

	public Createlead Phonenumber(String Phn) {
		getDriver().findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(Phn);
		return this;

	}

	public Createlead Submit() {
		getDriver().findElement(By.name("submitButton")).click();
		return this;

	}

	public ViewLeadsPage Verfiy() {
		String text = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}
		return new ViewLeadsPage();

	}
}
