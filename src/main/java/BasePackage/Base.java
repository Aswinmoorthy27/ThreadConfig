package BasePackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Excel.Exceldata;

import java.io.IOException;
import java.time.Duration;

import io.cucumber.java.Before;

public class Base {

	private static final ThreadLocal<ChromeDriver> Driver = new ThreadLocal<>();

	public void setDriver() {
		Driver.set(new ChromeDriver());
	}

	public RemoteWebDriver getDriver() {
		return Driver.get();
	}

	// public RemoteWebDriver driver;
	public String excelFileName;
	public String sheetName;

	@Parameters("browser")

	@BeforeMethod
	public void Precondition() {
		setDriver();
//		if (browser.equalsIgnoreCase("chrome")) {
//			new ChromeDriver();
//
//		} else if (browser.equalsIgnoreCase("Edge")) {
//			new EdgeDriver();
//
//		}
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/login");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}

	@DataProvider
	public String[][] senddata() throws IOException {
		return Exceldata.excelmethod(excelFileName, sheetName);
	}
}
