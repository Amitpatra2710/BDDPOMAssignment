package pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.TestBase;

public class AddItems extends TestBase {
	//samsung
	@FindBy(xpath ="//a[text() = 'Samsung galaxy s6']")
	WebElement samsung;
	
	@FindBy(xpath ="//*[@id='tbodyid']/div[2]/div/a")
	WebElement addSamsung;
	@FindBy(xpath ="//*[@id='navbarExample']/ul/li[1]/a")
	WebElement SamsungHome;
	Alert prompt = driver.switchTo().alert();
	//Nokia
	@FindBy(xpath ="//*[@id='tbodyid']/div[2]/div/div/h4/a")
	WebElement nokia;
	
	@FindBy(xpath ="//*[@id='tbodyid']/div[2]/div/a")
	WebElement addNonia;
	@FindBy(xpath ="//*[@id='navbarExample']/ul/li[1]/a")
	WebElement NokiaHome;
	//Nexus
	@FindBy(xpath ="//*[@id='tbodyid']/div[3]/div/div/h4/a")
	WebElement nexus;
	
	@FindBy(xpath ="//*[@id='tbodyid']/div[2]/div/a")
	WebElement addNexus;
	
	@FindBy(xpath ="//*[@id='navbarExample']/ul/li[1]/a")
	WebElement NexusHome;
	
	//@FindBy(xpath="//div[@class='col-lg-9']/div/div/div/div/h4/a")
	//List<WebElement> items;
	@FindBy(xpath = "//a[text()='Add to cart']")
	WebElement addCart;

	@FindBy(xpath = "(//a[@class='nav-link'])[1]")
	WebElement homeBtn;
	
	//Actions
	//public void AddItemstoCart(String Items) {
		
//		WebElement item = driver.findElement(By.xpath("//a[text()='"+ Item +"']"));
//        
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", item);
//        
//		samsung.click();
//		addSamsung.click();
//		//JavascriptExecutor js = new JavascriptExecutor();
//		Alert prompt = driver.switchTo().alert();
//		prompt.accept();
//		SamsungHome.click();
//		for(WebElement item : items ) {
//			if(item.getText().equalsIgnoreCase(Items)) {
//				JavascriptExecutor Js = (JavascriptExecutor)driver;
//				Js.executeScript("arguments[0].click()", items);
		
		
//			}
		
		
	
	
//	public void addItemToCart(String Item) throws InterruptedException {
//		WebElement item = driver.findElement(By.xpath("//a[text()='" + Item + "']"));
//
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", item);
//		Thread.sleep(500);
//
//		addCart.click();
//		Thread.sleep(1000);
//		// Webdriver Wait = new W
//		driver.switchTo().alert().accept();
//		homeBtn.click();
//	}
	
	public void addItemToCart() throws InterruptedException {
		
		//WebElement item = driver.findElement(By.xpath("//a[text()='" + Item + "']"));
		
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", samsung);
			Thread.sleep(500);
			addCart.click();
			driver.switchTo().alert().accept();
			homeBtn.click();
				
	}
	
		
		}
	

