package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Loginpage {
	
	@Test
	public static void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java+sel\\Driver.chrome\\ch\\chromedriver90.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://183.82.4.93:5887/LMS_Stage/InnerHome.aspx");
		driver.manage().window().maximize();
		
		/*driver.navigate().to("hhttp://182.18.182.98/MOSS_SB_STAGE_PFPL/Login.aspx");*/
		driver.findElement(By.xpath("//input[@id='MasterLoginContentPlaceHolder_BtnYes']")).click();
	
		driver.findElement(By.xpath("//*[@id='MasterLoginContentPlaceHolder_UserNameTxt']")).sendKeys("1270");
		//*[@id="MasterLoginContentPlaceHolder_UserNameTxt"]
		driver.findElement(By.xpath("//*[@id='MasterLoginContentPlaceHolder_PasswordTxt']")).sendKeys("unical@123");
		driver.findElement(By.xpath("//*[@id='MasterLoginContentPlaceHolder_SignInImgBtn']")).click();
   
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
		
		
		driver.findElement(By.xpath("//*[@id='MasterLoginContentPlaceHolder_SignOutImgBtn']")).click();
		System.out.println("task completed");
		
	}
}
