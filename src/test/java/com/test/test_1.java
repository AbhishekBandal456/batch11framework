package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.loginpom;
import com.utility.BaseClass;

public class test_1 extends BaseClass{
	
	@Test
	public void test_001() {
		
		loginpom login=PageFactory.initElements(driver, loginpom.class);
		
		login.getText_mail().sendKeys("abhishek");
		login.getText_password().sendKeys("13654");
	}
	

}
