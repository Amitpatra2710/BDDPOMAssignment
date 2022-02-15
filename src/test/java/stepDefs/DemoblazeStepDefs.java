package stepDefs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AddItems;
import pages.DeleteItems;
//import pages.CheckOutPage;
import pages.LoginPage;
//import pages.SearchResultPage;

public class DemoblazeStepDefs extends TestBase {
	LoginPage loginPage;
	AddItems addItems;
	DeleteItems deleteItem;

	// SearchResultPage resultPage;
	// CheckOutPage checkOutPage;
	//@Before
	public void setup() {
		initialize();
		loginPage = new LoginPage();
		addItems = new AddItems();
		deleteItem = new DeleteItems();
		// checkOutPage = new CheckOutPage();
	}

	WebDriver driver;
	@Given("User Login into App")
	public void user_Login_into_app() {
		initialize();
		loginPage = new LoginPage();
		loginPage.logIntoApp();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}


	//@Given("User adding Items")
	//public void user_adding_items(DataTable Items) throws InterruptedException {
	//	addItems = new AddItems();
		//List<Map<String, String>> Items1 = Items.asMaps();
		//String CartItems = Items1.get(0).get("Items");
		//addItems.addItemToCart(CartItems);
		
	//}
	
	@Given("User adding Items")
	public void user_adding_items() {
		addItems = new AddItems();
		try {
			addItems.addItemToCart();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@When("user delets {string}")
	public void user_delets(String DelItems) {
		//addItems = new AddItems();
		//List<Map<String, String>> Items1 = DelItems.asMaps();
		//String DelItems1 = Items1.get(0).get("DelItems");
		deleteItem.deleteItem(DelItems);
	}

	@Then("cart should be updated")
	public void cart_should_be_updated() {

	}

	@After
	public void teardown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			TakesScreenshot screen = (TakesScreenshot) driver;
			File screenshot = screen.getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
			scenario.attach(fileContent, "image/png", "image1");

		}
	}

}
