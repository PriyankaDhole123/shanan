package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComposeInvalidecredintial {

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

	@When("Enter valid email & invalid password")
	public void enter_valid_username_password() {
		
	    driver.findElement(By.xpath("//input[@name='hiddenPassword']")).sendKeys("priyankagawande2015@gmail.com");
	    driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("priyanka");
	}

//	@When("click on Next button  Login Fail")
	public void click_on_login_button() {
		driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]")).click();
	}

	
		


}
