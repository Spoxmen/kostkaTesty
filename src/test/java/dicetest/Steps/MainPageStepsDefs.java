package dicetest.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dicetest.main.Init;
import pageObjects.MainPage;

public class MainPageStepsDefs {

	WebDriver driver = Init.getDriver();
	MainPage mp = new MainPage();
	
	@Given("^I want to open the webpage$")
	public void i_want_to_open_the_webpage() throws Throwable {

		System.out.println(driver.getTitle());
		
	}

	@When("^I click nwod button$")
	public void i_click_nwod_button() throws Throwable {
		Init.printScr(driver, "MainPage Tests", "Main Page Cucumber Tests");
		mp.nwodClicker();
		Init.printScr(driver, "MainPage Tests", "Main Page Cucumber Tests");
	}

	@When("^i fill IK form with (\\d+)$")
	public void i_fill_IK_form_with(String arg1) throws Throwable {

		mp.ikFiller(arg1);
		Init.printScr(driver, "MainPage Tests", "Main Page Cucumber Tests");
	}

	@When("^click roll button$")
	public void click_roll_button() throws Throwable {

		mp.rollClicker();
		Init.printScr(driver, "MainPage Tests", "Main Page Cucumber Tests");
		Init.sleep(3);
	}
	
	@Then("^i close browser$")
	public void i_close_browser() throws Throwable {

		Init.close();
		
	}
	
}
