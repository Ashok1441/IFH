package com.IFHPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseActionClass.Action;
import com.BaseClass.BaseTest;
import com.BaseClass.FileLib;
import com.BaseClass.IAutoConsts;

public class PersonalAccRegistrationPage implements IAutoConsts {

	@FindBy(xpath="//button[@id='ifhItem0']") WebElement clickOnFAQsIcon;
	@FindBy(xpath="//*[@id=\"ifhFaqControlOC2766\"]") WebElement clickOnFAQs_1_Que;
	@FindBy(xpath="//button[@title='Experiencing issues?']") WebElement clickOnSuerveyIcon;
	@FindBy(xpath="//textarea[@id='ifhTextArea_0']") WebElement enterText;
	
	public PersonalAccRegistrationPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void PersonalAccRegPage() throws Throwable {
	      
		  Action.getUrl(FileLib.readProprertyData(Prop_Path, "reg_us_url"));
	      Action.explicitWaitForElement(BaseTest.driver, clickOnFAQsIcon, 20);
		  Action.click(clickOnFAQsIcon, "FAQs Icon");
		  Action.click(clickOnFAQs_1_Que, "FAQs 1st"); Action.click(clickOnSuerveyIcon,
		  "Suervey Icon"); Action.type(enterText,
		  "Written text is for testing purposes");
		 
		
		
		
		
		
	}
}
