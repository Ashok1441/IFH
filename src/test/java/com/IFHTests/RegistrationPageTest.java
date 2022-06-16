package com.IFHTests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.BaseClass.BaseTest;
import com.IFHPages.PersonalAccRegistrationPage;

public class RegistrationPageTest extends BaseTest{
	
	@Parameters("URL")
	@Test
	public void PersonalAccRegistrationPageTest(String URL) throws Throwable {
		new PersonalAccRegistrationPage().PersonalAccRegPage(URL);
	}
	
}
