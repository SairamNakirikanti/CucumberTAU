package com.tau.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	private WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\Desktop\\chromedriver_2.44.exe");
		driver = new ChromeDriver();

	}

	@Given("I am in the login page of the para bank application")
	public void i_am_in_the_login_page_of_the_para_bank_application() {

		driver.get("https://parabank.parasoft.com/parabank/index.html");
	}

	@When("I enter valid {string} and {string}")
	public void i_enter_valid_credentials_(String username, String password) {

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("username")).submit();

	}

	@Then("I ahould be taken to the overview page")
	public void i_ahould_be_taken_to_the_overview_page() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[contains(text(),'Accounts Overview')]")).isDisplayed();
		driver.findElement(By.linkText("Log Out")).click();

	}

	@After
	public void quitBrowser() {
		driver.quit();
	}
}
