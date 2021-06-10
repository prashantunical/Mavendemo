package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Swklocation {

	
	
	Select IIstbox= new Select(driver.findElement(By.xpath("//*[@id='MasterLoginContentPlaceHolder_ddl1']")));
	IIstbox.selectByValue("1");
	//IIstbox.selectByVisibleText("Head Office");
	/*IIstbox.selectByVisibleText("Zonal Office");
	IIstbox.selectByVisibleText("Regional Office");
	IIstbox.selectByVisibleText("Area Office");
	IIstbox.selectByVisibleText("Unit Office");
	IIstbox.selectByVisibleText("Branch Office");
	*/
	Select IIIstbox= new Select(driver.findElement(By.xpath("//*[@id='MasterLoginContentPlaceHolder_ddl1']")));
	IIIstbox.selectByVisibleText("Pradakshana Fintech Private Limited");
	/*IIIstbox.selectByVisibleText("Telangana");
	IIIstbox.selectByVisibleText("Mancherial Ro");
	IIIstbox.selectByVisibleText("Cuttak");
	IIIstbox.selectByVisibleText("Mancherial Ao");
	IIIstbox.selectByVisibleText("Cuttack");
	IIIstbox.selectByVisibleText("Mancherial Uo");
	IIIstbox.selectByVisibleText("Hyderabad Uo");
	IIIstbox.selectByVisibleText("Cuttack");
	IIIstbox.selectByVisibleText("Chennoor");
	IIIstbox.selectByVisibleText("Mancherial");
	IIIstbox.selectByVisibleText("Kagaznagar");
	IIIstbox.selectByVisibleText("Nagpur");
	IIIstbox.selectByVisibleText("Raipur");
	IIIstbox.selectByVisibleText("Saroornagar");
	IIIstbox.selectByVisibleText("Nirmal");
	IIIstbox.selectByVisibleText("E Lending");
	IIIstbox.selectByVisibleText("Cuttack");*/
	
	driver.findElement(By.xpath("//*[@id='MasterLoginContentPlaceHolder_btnLoginSelectedBranch']")).click();
	
}
