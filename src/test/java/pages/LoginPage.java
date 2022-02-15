package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//a[@id='login2']")
	WebElement logInBtn;

	@FindBy(xpath = "//input[@id='loginusername']")
	WebElement userName;

	@FindBy(xpath = "//input[@id='loginpassword']")
	WebElement passWord;

	@FindBy(xpath = "//button[text()='Log in']")
	WebElement login;

//@FindBy(xpath = "//*[@id='logInModal']/div/div/div[3]/button[2]")
//WebElement login1;
	@FindBy(xpath = "//a[text()='Add to cart']")
	WebElement addCart;

	@FindBy(xpath = "(//a[@class='nav-link'])[1]")
	WebElement homeBtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

//Actions

	public void logIntoApp() {
		logInBtn.click();
		userName.sendKeys("Amit@2022");
		passWord.sendKeys("Amit@2022");
		login.click();
	}

	public void addItemToCart(String Item) throws InterruptedException {
		WebElement item = driver.findElement(By.xpath("//a[text()='" + Item + "']"));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", item);
		Thread.sleep(500);

		addCart.click();
		Thread.sleep(1000);
		// Webdriver Wait = new W
		driver.switchTo().alert().accept();
		homeBtn.click();
	}

}