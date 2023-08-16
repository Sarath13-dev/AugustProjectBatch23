package org.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefintionClass {
	
	WebDriver driver;
	
	@Given("User navigates to the facebook url")
	public void user_navigates_to_the_facebook_url() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
	@When("User enters the usersname and password")
	public void user_enters_the_usersname_and_password() {
	    driver.findElement(By.id("email")).sendKeys("Ravi");
	    driver.findElement(By.id("pass")).sendKeys("1234");
	    
	}
	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    driver.findElement(By.name("login")).click();
	    Assert.assertEquals(true, false);
	    
	}
	@Then("User validates the login message")
	public void user_validates_the_login_message() throws InterruptedException {
	    Thread.sleep(3000);
	    driver.close();
	    
	}

}
