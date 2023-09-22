package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import BasePackage.Base;

public class MyHomePage extends Base {

	public MyLeadsPage myhomeverify() {
		WebElement Myhome = getDriver().findElement(By.xpath("//a[text()='My Home']"));
		String MyHomeVerify = Myhome.getText();
		System.out.println("" + MyHomeVerify);

		if (MyHomeVerify.equals(MyHomeVerify)) {
			System.out.println("MyHome Is Verified");
		}
		return new MyLeadsPage();

	}

}
