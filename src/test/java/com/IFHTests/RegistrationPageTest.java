package com.IFHTests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.BaseClass.BaseTest;
import com.IFHPages.PersonalAccRegistrationPage;

public class RegistrationPageTest extends BaseTest{
	
	@Test
	public void PersonalAccRegistrationPageTest() throws Throwable {
		new PersonalAccRegistrationPage().PersonalAccRegPage();
	}
	
}
