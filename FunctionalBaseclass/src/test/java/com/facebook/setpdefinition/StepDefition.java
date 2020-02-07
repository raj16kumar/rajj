package com.facebook.setpdefinition;

import com.facebook.baseclass.FunctionalBaseclass;
import com.facebook.object.CreateAccount;
import com.facebook.object.SignIn;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefition extends FunctionalBaseclass{

	@Given("^User launch amazon application$")
	public void user_launch_amazon_application() throws Throwable {
		geturl("https://www.amazon.com/");

	    
	}

	@Then("^User verify the amazon logo is displayed in the header$")
	public void user_verify_the_amazon_logo_is_displayed_in_the_header() throws Throwable {
		SignIn si=new SignIn();
     elementIsDisplay(si.getLogo());
	    
	}

	@Then("^User click signin button$")
	public void user_click_signin_button() throws Throwable {
		SignIn si=new SignIn();
		mouseact(si.getAccounts());
	   clk(si.getSignin());

	 
	}

	@Then("^User enter emailid in the signin page$")
	public void user_enter_emailid_in_the_signin_page() throws Throwable {
		SignIn si=new SignIn();
		enterText(si.getEmail(),"viruraj16@gmail.com");

	    
	}

	@Then("^User click on the continue button$")
	public void user_click_on_the_continue_button() throws Throwable {
		SignIn si=new SignIn();
        clk(si.getClick());
	    
	}

	@Then("^User enter password after click continue page$")
	public void user_enter_password_after_click_continue_page() throws Throwable {
		Thread.sleep(3000);
     SignIn si=new SignIn();
     enterText(si.getPass(), "1234567890");
	    
	}

	@Then("^User click on the signin button$")
	public void user_click_on_the_signin_button() throws Throwable {
    SignIn si=new SignIn();
   clk(si.getSumbit());	    
	}

	@Then("^User verify the alert message displays for invalid crendentails$")
	public void user_verify_the_alert_message_displays_for_invalid_crendentails() throws Throwable {
		Thread.sleep(3000);
		SignIn si=new SignIn();
        elementIsDisplay(si.getAlert());
	    
	}

	@Then("^User click create your amazon account button$")
	public void user_click_create_your_amazon_account_button() throws Throwable {
    CreateAccount ca=new CreateAccount();
    clk(ca.getClick());
	    
	}

	@Then("^User enter name in create account module$")
	public void user_enter_name_in_create_account_module() throws Throwable {
        CreateAccount ca=new CreateAccount();
        enterText(ca.getfName(), "rajkumar");

	}

	@Then("^User enter emailid in create account module$")
	public void user_enter_emailid_in_create_account_module() throws Throwable {
        CreateAccount ca=new CreateAccount();
        enterText(ca.getEmail(), "viruraj16@gmail.com");

	}

	@Then("^User enter password in create account module$")
	public void user_enter_password_in_create_account_module() throws Throwable {
		

	    
	}

	@Then("^User enter reenter password in create account module$")
	public void user_enter_reenter_password_in_create_account_module() throws Throwable {

	    
	}

	@Then("^User click on create your amazon account$")
	public void user_click_on_create_your_amazon_account() throws Throwable {

	    
	}

	@Then("^User verify the account hasbeen created$")
	public void user_verify_the_account_hasbeen_created() throws Throwable {

	    
	}

	
}
