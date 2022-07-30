package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {
   
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement text_mail;
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement text_password;
	
	public WebElement getText_mail() {
		return text_mail;
	}
	
	public WebElement getText_password() {
		return text_password;
	}
	
	
}
