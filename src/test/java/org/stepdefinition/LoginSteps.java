package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginSteps {
    public WebDriver driver;
	@Given("user is in facebook login page")
	public void user_is_in_facebook_login_page() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
	}

	@When("user enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() {
        WebElement txtEmail=driver.findElement(By.id("email"));
        txtEmail.sendKeys("Greens");
        WebElement txtPass=driver.findElement(By.id("pass"));
        txtPass.sendKeys("Greens@123");
	}

	@When("user click login button")
	public void user_click_login_button() throws InterruptedException {
        WebElement btnLogin=driver.findElement(By.name("login"));
        btnLogin.click();
        Thread.sleep(3000);
	}

	@Then("user should be in invalid credentials page")
	public void user_should_be_in_invalid_credentials_page() {
       String url=driver.getCurrentUrl();
       Assert.assertTrue(url.contains("privacy_mutation_token"));
	}
	
	@When("user enter invalid {string} and {string}")
	public void user_enter_invalid_and(String email, String pass) {
        WebElement txtEmail=driver.findElement(By.id("email"));
        txtEmail.sendKeys(email);
        WebElement txtPass=driver.findElement(By.id("pass"));
        txtPass.sendKeys(pass);
	}


}
