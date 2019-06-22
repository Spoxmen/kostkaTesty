package kostkaSelenium.kostka;

import org.junit.*;
import org.openqa.selenium.WebDriver;

import kostkaSelenium.kostka.Init;
import pageObjects.MainPage;

public class MainPageTest {
	WebDriver driver;
	MainPage mp = new MainPage();
	
	@Before
	public void start() {
		System.out.println("Start testu");
		driver = Init.getDriver();
	}
	
	public void testStrony() {
		mp.nwodClicker();
		mp.ikFiller("5");
		mp.rollClicker();
		Init.sleep(10);
	}
	
	@After
	public void close() {
		Init.close();
	}
	
}
