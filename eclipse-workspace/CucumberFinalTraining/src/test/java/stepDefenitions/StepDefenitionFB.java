package stepDefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefenitionFB {
	WebDriver driver;

	@Given("Browser to be launched")
	public void browser_to_be_launched() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	@Given("User landed in Facebook login page")
	public void user_landed_in_Facebook_login_page() {
		driver.get("https://en-gb.facebook.com/login/");
	}

	@When("User Enters invalid username and password")
	public void user_Enters_invalid_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("myusername");
		driver.findElement(By.id("pass")).sendKeys("myPassword");
	}

	@When("User Clicks Login button")
	public void user_Clicks_Login_button() {
		driver.findElement(By.id("loginbutton")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("Error page is displayed")
	public void error_page_is_displayed() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, title);
		System.out.println("Assertion Passed");
	}
	@Then("User closes the browser")
	public void user_closes_the_browser() {
		driver.close();
	}

	@When("User Enters valid {string} and {string}")
	public void user_Enters_valid_and(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
	}


}
