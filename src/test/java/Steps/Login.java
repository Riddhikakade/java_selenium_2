package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver=null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("inside steps-browser is opem");
		System.setProperty("webdriver.chrome.driver","C:/Users/Riddhi.Kakade/eclipse-workspace/Testing1/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    
	}

	@When("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("inside steps-user is on login page");
		driver.navigate().to("https://www.booking.com/index.html?aid=375653&label=msn-LOcHQGfA16aswDjFb7_rcw-80539252256335:tikwd-80539278535451:aud-808219487:loc-90:neo:mte:lp158527:dec:qsBooking.com&utm_campaign=Booking%20Name&utm_medium=cpc&utm_source=bing&utm_term=LOcHQGfA16aswDjFb7_rcw&msclkid=ff9ced48fe5610c759978f607873f402");
	    driver.findElement(By.xpath("//a[@class='bui-button bui-button--secondary js-header-login-link']")).click();
        
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside steps -user enters username and pssword");
		 WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
	        login.click();
	        login.sendKeys("kakaderiddhi18@gmail.com");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        //Thread.sleep(1000);
	        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	        password.click();
	        password.sendKeys("Riddhi@123");
	        //driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
		System.out.println("inside steps-click on the login button");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    
	}

	@Then("user is navigate to the homepage")
	public void user_is_navigate_to_the_homepage() {
		System.out.println("inside steps-user is navigate to the homepage");
	    
	    
	}



}

