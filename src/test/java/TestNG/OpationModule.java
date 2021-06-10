package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpationModule {

	
	static WebDriver driver;
	
    @BeforeMethod                           
    	public static void setup() throws InterruptedException {
    		System.setProperty("webdriver.chrome.driver","D:\\java+sel\\Driver.chrome\\ch\\chromedriver90.exe");
            driver = new ChromeDriver();
            driver.get("http://183.82.4.93:5887/LMS_Stage/InnerHome.aspx");
    		driver.manage().window().maximize();
    		
    		driver.findElement(By.xpath("//input[@id='MasterLoginContentPlaceHolder_BtnYes']")).click();
    	
    		driver.findElement(By.xpath("//*[@id='MasterLoginContentPlaceHolder_UserNameTxt']")).sendKeys("1270");
    		//*[@id="MasterLoginContentPlaceHolder_UserNameTxt"]
    		driver.findElement(By.xpath("//*[@id='MasterLoginContentPlaceHolder_PasswordTxt']")).sendKeys("unical@123");
    		driver.findElement(By.xpath("//*[@id='MasterLoginContentPlaceHolder_SignInImgBtn']")).click();
    		
    		/*Thread.sleep(30);
    		Select sl= new Select(driver.findElement(By.name("ctl00$MasterLoginContentPlaceHolder$ddl1']")));
    		sl.selectByValue("6");
    		sl= new Select(driver.findElement(By.xpath("ctl00$MasterLoginContentPlaceHolder$locationddl")));
    		sl.selectByValue("B00005");*/
    		WebDriverWait wait=new WebDriverWait(driver, 20);
    		WebElement link1;
    		link1= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name( "ctl00$MasterLoginContentPlaceHolder$ddl1']")));
    		link1.click();
    		Select sl= new Select(driver.findElement(By.name("ctl00$MasterLoginContentPlaceHolder$ddl1']")));
    		sl.selectByValue("6");
    		
    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name( "ctl00$MasterLoginContentPlaceHolder$locationddl")));
    		link1.click();
    		sl= new Select(driver.findElement(By.xpath("ctl00$MasterLoginContentPlaceHolder$locationddl")));
    		sl.selectByValue("B00005");
    		
    		driver.findElement(By.xpath("//*[@id='MasterLoginContentPlaceHolder_btnLoginSelectedBranch']")).click();
    		WebElement link= driver.findElement(By.partialLinkText("HR"));
    		link.click();
    		try {
    		link.click();
    		
    			     } catch (WebDriverException e)
    			     {
    			    	// link= driver.findElement(By.xpath("//*[@id=\"WUCInnerHome1_HR\"]/div"));
    			    	 link= driver.findElement(By.partialLinkText("HR"));
    			 		link.click();
    			    
    			}
    		//driver.findElement(By.xpath("//*[@id='WUCInnerHome1_Operations']")).click();
    		//driver.get("http://183.82.4.93:5887/LMS_Stage/Operations/CockPitOperations.aspx");
;    		//Actions a = new Actions(driver);
   	        //a.moveToElement(driver.findElement(By.xpath("//*[@id='WUCInnerHome1_Operations']"))).perform();
    		
    		//driver.switchTo();
    		//driver.findElement(By.linkText("operations_big")).click();
    		//driver.findElement(By.partialLinkText("HR")).click();
    		
    		//driver.findElement(By.xpath("//*[@id='WUCInnerHome1_Operations']")).click();
    		driver.findElement(By.xpath("//*[@id=\"WUCInnerHome1_HR\"]/div")).click();
    		//*[@id="WUCInnerHome1_Operations"]/div/div
    		
    		//driver.findElement(By.cssSelector("div.value.operations_big"));
    		//driver.findElement(By.cssSelector("div[class*='operations_big']")).click();
    		
    }
    
    @AfterMethod
       public static void Logout(){
	driver.quit();
    }
    @Test
  public void Opmodule()  {
    	
    	System.out.println("op module main page open");
    	driver.findElement(By.xpath("//*[@id='WUCInnerpages1_Operations']")).click();
    	driver.findElement(By.xpath("//*[@id='ParentContentPlaceHolder']")).click();
    	//*[@id="ParentContentPlaceHolder"]/div/a
	   /* Select Istbox = new Select(driver.findElement(By.id("Headoffice")));
		Istbox.selectByIndex(1);
	
		Select IIstbox= new Select(driver.findElement(By.xpath("//*[@id='MasterLoginContentPlaceHolder_locationddl'])")));	   
		IIstbox.selectByVisibleText("Nirmal");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id='MasterLoginContentPlaceHolder_btnLoginSelectedBranch'])")).click();
		System.out.println("Mouser Over done");*/
		
		}}
   /* @Test(priority=2)	
  public void operationsmodule_APPLICATIONPOLICIES() {
	  //WebDriver driver=new ChromeDriver();
    	
	   driver.findElement(By.xpath("//div[contains(@class='operations_big'])")).click(); 
	   driver.findElement(By.linkText("APPLICATION POLICIES")).click();
	   driver.findElement(By.linkText("General Policy")).click();
	   driver.navigate().back();
	   driver.findElement(By.linkText("Recovery Order")).click();
	   driver.navigate().back();
	   
	   
}}*/
    /*
    @Test(priority=3)	
    public void OrganigationPolicies() {
    WebDriver driver=new ChromeDriver();
       driver.findElement(By.linkText("ORGANIZATION POLICIES")).click(); 
	   driver.findElement(By.linkText("ParentContentPlaceHolder_Loan Policy-link")).click();
	   driver.navigate().back();
	   driver.findElement(By.linkText("ParentContentPlaceHolder_Fee Creation-link")).click();
	   driver.navigate().back();
}
    
    @Test(priority=4)	
    public void PRODUCTS() {
    WebDriver driver=new ChromeDriver();
       driver.findElement(By.linkText(" PRODUCTS")).click(); 
 	   driver.findElement(By.linkText("ParentContentPlaceHolder_Loan Product-link")).click();
 	   driver.navigate().back();
 	   driver.findElement(By.linkText("ParentContentPlaceHolder_Insurance Product-link")).click();
 	   driver.navigate().back();
    }
   
    @Test(priority=5)	
    public void OPERATIONS() {
    WebDriver driver=new ChromeDriver();
       driver.findElement(By.xpath("//*[@id='ParentContentPlaceHolder'])")).click(); 
 	   
    }
    @Test(priority=6)	
    public void INSURANCE() {
    WebDriver driver=new ChromeDriver();
       driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr/td/div[1]/div/div[9]/div/a")).click(); 
       
}
    @Test(priority=7)	
    public void OPERATIONSMASTER() {
    WebDriver driver=new ChromeDriver();
       driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr/td/div[1]/div/div[11]/div/a")).click(); 
    
    
}
    @Test(priority=8)	
    public void OPERATIONSMODIFY() {
    WebDriver driver=new ChromeDriver();
       driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr/td/div[1]/div/div[13]/div/a")).click(); 
       
    }
    @Test(priority=5)	
    public void DOCUMENTTRACKING() {
    WebDriver driver=new ChromeDriver();
       driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr/td/div[1]/div/div[15]/div/a")).click(); 
    
    }}*/
    