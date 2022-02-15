package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import io.cucumber.datatable.DataTable;

public class DeleteItems extends TestBase {
	public DeleteItems() {
		PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//a[text()='Cart']")
		WebElement cartIcon;

		@FindBy(xpath = "//tr[@class='success']")
		List<WebElement> cartItems;

		@FindBy(xpath = "//a[text()='Delete']")
		List<WebElement> delete;

		// Actions

		public void verifyCartItems() {
		cartIcon.click();
		if (cartItems.size() > 0) {

		System.out.println("Items added to the cart successfully");

		}

		else {
		System.out.println("Cart is empty");
		}
		}

		public void deleteItem(String delItems) {

		for (int i = 0; i < cartItems.size(); i++) {
		if (cartItems.get(i).getText().equalsIgnoreCase(delItems)) {

		delete.get(i).click();

		}

		}
		}

		public void verifyUpdatedCart(String item) {
		for (int i = 0; i < cartItems.size(); i++) {
		if (cartItems.get(i).getText().equalsIgnoreCase(item)) {
		System.out.println("Item not deleted");
		}
		else {
		System.out.println("Item deleted successfully");
		}

		}

		}

}
