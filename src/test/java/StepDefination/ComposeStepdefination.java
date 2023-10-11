package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*; //* automatocally import all annotations


public class ComposeStepdefination {
	WebDriver driver=null; //  we can open on any browser
@Given("Broser is open)")
public void broser_is_open() {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Given("user is on login page")
public void user_is_on_login_page() {
   driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AYZoVhcN5xD_TeRVZQgucfiKjUjyEh-nMA3aSli5YWu2uNGTqW-8mr8AMQfDqRSJpOzXLWU9_eA&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
}

@When("Enter valid email & valid password")
public void enter_valid_username_password() {
	
    driver.findElement(By.xpath("//input[@name='hiddenPassword']")).sendKeys("priyankagawande2015@gmail.com");
    driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
    driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("priyankagawande11");
}

@When("click on Next button")
public void click_on_login_button() {
	driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
}

@Then("user land on home page")
public void user_land_on_home_page() {
	String expt="Social";
	String act=driver.findElement(By.xpath("//div[@class='aAy aKe-aLe']")).getText();
	if(expt.equals(act)) {
		System.out.println("user land on home page");
		
	}
	else {
		System.out.println("tc is fail");
	}
	System.out.println("Github sucessfully done");
    
}


@And("click on compose button")
public void click_on_compose_button() {
	driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
}
@And("click on compose button")
public void click_on_newmassageframe() {
	driver.findElement(By.xpath("//input[@class='agP aFw']")).sendKeys("priyankagawande760@gmail.com");
	driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test_Case_review");
	driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Hii,i am priyanka");
	driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();

	

	
}

	
}
