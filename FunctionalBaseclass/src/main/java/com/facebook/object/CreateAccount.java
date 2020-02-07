package com.facebook.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.baseclass.FunctionalBaseclass;

public class CreateAccount extends FunctionalBaseclass {
	
	@FindBy(className="a-button-text")
	private WebElement createaacct;
	
	@FindBy(name="customerName")
	private WebElement fName;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(id="ap_password")
	private WebElement pass;
	
	@FindBy(id="ap_password_check")
	private WebElement repass;
	
	@FindBy(id="continue")
	private WebElement click;

	public WebElement getCreateaacct() {
		return createaacct;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getRepass() {
		return repass;
	}

	public WebElement getClick() {
		return click;
	}
	
	public CreateAccount() {
    PageFactory.initElements(driver, this);
	}
	

}
