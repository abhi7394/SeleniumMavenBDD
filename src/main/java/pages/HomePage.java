package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;
import utilities.utility;

public class HomePage extends BaseTest {

	@FindBy(xpath = "//img[@id='ztb-profile-image-pre']")
	protected WebElement profileImage;

	@FindBy(id = "ztb-user-name")
	protected WebElement userName;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String usernameExists() {

		// utility.waitForelement(profileImage);
		profileImage.click();
		return userName.getText();

	}
}
