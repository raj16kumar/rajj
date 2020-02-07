package com.facebook.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.baseclass.FunctionalBaseclass;

public class SignIn extends FunctionalBaseclass {
	
	@FindBy(className="nav-logo-link")
	private WebElement logo;
	
	public WebElement getLogo() {
		return logo;
	}
	@FindBy(xpath="//span[text()='Account & Lists']")
	private WebElement accounts;
	
	@FindBy(xpath="//span[@class='nav-action-inner']")
	private WebElement signIn;
	
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(id="continue")
	private WebElement click;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(id="signInSubmit")
	private WebElement sumbit;
	
	public WebElement getSumbit() {
		return sumbit;
	}
	@FindBy(xpath="(//div[@class='a-box-inner a-alert-container'])[1]")
	private WebElement alert;
	
	public WebElement getAlert() {
		return alert;
	}


	public WebElement getSignIn() {
		return signIn;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getAccounts() {
		return accounts;
	}


	public WebElement getSignin() {
		return signIn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getClick() {
		return click;
	}
	public SignIn() {
		PageFactory.initElements(driver, this);
	}

}
