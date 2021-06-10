package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","D:\\java+sel\\Driver.chrome\\ch\\chromedriver90.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://183.82.4.93:5887/LMS_Stage/InnerHome.aspx");
		driver.manage().window().maximize();
		
		/*driver.navigate().to("hhttp://182.18.182.98/MOSS_SB_STAGE_PFPL/Login.aspx");*/
	
		driver.findElement(By.xpath("//input[@id= 'MasterLoginContentPlaceHolder_UserNameTxt']")).sendKeys("1270");
		driver.findElement(By.xpath("//input[@id= 'MasterLoginContentPlaceHolder_PasswordTxt']")).sendKeys("unical@123");
		driver.findElement(By.xpath("//input[@id='MasterLoginContentPlaceHolder_SignInImgBtn']")).click();
   
		driver.findElement(By.xpath("//input[@id='WUCInnerHome1_SignOutImgBtn']")).click();
	}

}
