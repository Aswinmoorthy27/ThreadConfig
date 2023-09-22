package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;

import BasePackage.Base;

public class LoginPage extends Base {

	public LoginPage EnterUsername(String Username) {
		getDriver().findElement(By.id("username")).sendKeys(Username);
		return this;
	}

	public LoginPage EnterPwd(String Pwd) {
		getDriver().findElement(By.id("password")).sendKeys(Pwd);
		return this;
	}

	public WelcomePage ClickButton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
