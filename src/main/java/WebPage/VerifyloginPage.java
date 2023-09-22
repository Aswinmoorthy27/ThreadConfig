package WebPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import BasePackage.Base;
import Testcases.LoginPage;
import Testcases.MyHomePage;
import Testcases.MyLeadsPage;
import Testcases.WelcomePage;

public class VerifyloginPage extends Base {

	@BeforeTest
	public void setValues() {
		excelFileName ="Createlead";
		sheetName="Sheet1";


	}
	@Test(dataProvider ="senddata")
	public void Run(String Username,String Pwd ,String Companyname,String Firstname,String Lastname,String Phn) {

		LoginPage obj = new LoginPage();
		obj.EnterUsername(Username).EnterPwd(Pwd).ClickButton().verifyTitle().crmclick().myhomeverify().Clickleads().Createlead()
				.Companyname(Companyname).Firstname(Firstname).Lastname(Lastname).Phonenumber(Phn).Submit().Verfiy().verifyleadpage()
				.VerifyFirstname();

	}

}
