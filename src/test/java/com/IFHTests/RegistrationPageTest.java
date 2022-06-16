package com.IFHTests;


import org.testng.annotations.Test;

import com.BaseClass.BaseTest;
import com.IFHPages.AccRegistrationPage;



public class RegistrationPageTest extends BaseTest{
	
	@Test
	public void personalAccRegistrationPageTest() throws Throwable {
		new AccRegistrationPage().personalAccRegPage();
	}
	
	@Test
	public void businessAccRegistrationPageTest() throws Throwable {
		new AccRegistrationPage().businessAccRegPage();
	}
	
	
}
