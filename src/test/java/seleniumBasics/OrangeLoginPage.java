package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base;

public class OrangeLoginPage {
	
	private WebDriver driver;
	Base base = new Base();
	
	public OrangeLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "oxd-text oxd-text--h5 orangehrm-login-title")
	WebElement text_Login;
	
	@FindBy(name = "username")
	WebElement textBox_UserName;
	
	@FindBy(name = "password")
	WebElement textBox_Password;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement button_Login;
	
	@FindBy(xpath = "//p[text()= 'Forgot your password? ']")
	WebElement link_ForgotPassword;
	
	@FindBy(xpath = "//div[@class = 'orangehrm-login-footer-sm']/a[1]")
	WebElement link_LinkedIn;
	
	@FindBy(xpath = "//div[@class = 'orangehrm-login-footer-sm']/a[2]")
	WebElement link_Facebook;
	
	@FindBy(xpath = "//div[@class = 'orangehrm-login-footer-sm']/a[3]")
	WebElement link_Twitter;
	
	@FindBy(xpath = "//div[@class = 'orangehrm-login-footer-sm']/a[4]")
	WebElement link_YouTube;
	
	@FindBy(xpath = "//h6[text() = 'Reset Password']")
	WebElement text_ForgotPassword_ResetPassword;
	
	@FindBy(name = "username")
	WebElement textBox_ForgotPassword_UserName;
	
	
	public void validateLoginPage() {
		Assert.assertEquals(text_Login.getText(), "Login");
		Assert.assertTrue(button_Login.isDisplayed());
	}
	
	public void loginOrangeHRM(String userName, String password) {
		textBox_UserName.sendKeys("Admin");
		textBox_Password.sendKeys("admin123");
		button_Login.click();
	}
	
	public void resetPassword(String userName) {
		link_ForgotPassword.click();
		base.waitForElementToBeVisible(text_ForgotPassword_ResetPassword, 10);
	}
	
	

}
