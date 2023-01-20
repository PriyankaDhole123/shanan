package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*; //* automatocally import all annotations


public class ActiTimeStep {
	WebDriver driver=null; //  we can open on any browser
@Given("Broser is open")
public void broser_is_open() {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Given("user is on login page")
public void user_is_on_login_page() {
   driver.get("https://demo.actitime.com/login.do");
}

@When("Enter valid username & password")
public void enter_valid_username_password() {
	
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
}

@When("click on login button")
public void click_on_login_button() {
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
}

@Then("user land on home page")
public void user_land_on_home_page() {
	String expt="Enter Time-Track";
	String act=driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
	if(expt.equals(act)) {
		System.out.println("user land on home page");
		
	}
	else {
		System.out.println("tc is fail");
	}
	System.out.println("Github sucessfully done");
    
}


	
}
