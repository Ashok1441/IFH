package com.IFHPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseActionClass.Action;
import com.BaseClass.BaseTest;
import com.BaseClass.Config_Properties;
import com.BaseClass.FileLib;
import com.BaseClass.IAutoConsts;

public class AccRegistrationPage extends Config_Properties {

	private @FindBy(xpath = "//button[@id='ifhItem0']") WebElement clickOnFAQsIcon;
	private @FindBy(xpath = "//button[@id='ifhFaqControlOC2766']") WebElement clickOnFAQs_1_Que;
	private @FindBy(xpath = "//button[@title='Experiencing issues?']") WebElement clickOnSuerveyIcon;
	private @FindBy(xpath = "//textarea[@id='ifhTextArea_0']")WebElement enterText;
	private @FindBy(xpath="//input[@id='businessaccount-radio']") WebElement businessRadioButton;

	public AccRegistrationPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public  void personalAccRegPage() throws Throwable {

		loadConfigValues();
		Action.getUrl(REG_US_URL);
		Action.explicitWaitForElement(BaseTest.driver, clickOnFAQsIcon, 20);
		Action.click(clickOnFAQsIcon, "FAQs Icon");
		Action.click(clickOnFAQs_1_Que, "FAQs 1st");
		Action.click(clickOnSuerveyIcon, "Suervey Icon");
		Action.type(enterText, "Written text is for testing purposes");

	}
	
	public void businessAccRegPage() throws Throwable {

		loadConfigValues();
		Action.getUrl(REG_US_URL);
		Action.click(businessRadioButton, "Click on Bussines Radio Button");
		Action.explicitWaitForElement(BaseTest.driver, clickOnFAQsIcon, 20);
		Action.click(clickOnFAQsIcon, "FAQs Icon");
		Action.click(clickOnFAQs_1_Que, "FAQs 1st");
		Action.click(clickOnSuerveyIcon, "Suervey Icon");
		Action.type(enterText, "Written text is for testing purposes");

	}
}
