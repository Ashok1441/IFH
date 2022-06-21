package com.IFHPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseActionClass.Action;
import com.BaseClass.BaseTest;
import com.BaseClass.Config_Properties;

public class MySellinPage extends Config_Properties{

	private @FindBy(xpath="//span[@id='gh-ug']//a[contains(text(),'Sign in')]") WebElement signInButton;
	private @FindBy(xpath = "//input[@id='userid']") WebElement giveUserId; 
	private @FindBy(xpath="//button[@id='signin-continue-btn']") WebElement signIn_Continue_Btn;
	private @FindBy(xpath = "//input[@id='pass']") WebElement givePassword;
	private @FindBy(xpath="//button[@id='sgnBt']") WebElement singIn_Btn;
	private @FindBy(xpath = "//button[@id='ifhItem0']") WebElement clickOnFAQsIcon;
	private @FindBy(id = "ifhFaqControlOC2964") WebElement FAQs_1st_Ques;
	private @FindBy(id = "ifhFaqControlOC2965") WebElement FAQs_2nd_Ques;
	private @FindBy(id = "ifhFaqControlOC2966") WebElement FAQs_3rd_Ques;
	private @FindBy(id = "ifhFaqControlOC2968") WebElement FAQs_4th_Ques;
	private @FindBy(xpath = "//button[@title='Give us feedback']") WebElement clickOnSuerveyIcon;
	private @FindBy(xpath ="//button[@id='ifhRatingSelect_0_5']") WebElement click_5th_Star;
	private @FindBy(xpath = "//textarea[@id='ifhTextArea_2']")WebElement textArea;
	
	
	public MySellinPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void mySellingOverview() throws Throwable {
		loadConfigValues();
		Action.getUrl(US_URL);
		Action.click(signInButton, "Singin Button");
		Action.click(giveUserId, "Userd Id Text Area");
		Action.type(giveUserId, USER_ID);
		Action.click(signIn_Continue_Btn, "SingIn Continue Button");
		Action.click(givePassword, "Password Text Area");
		Action.type(givePassword,PASSWORD);
		Action.click(singIn_Btn, "SingIn Button");
		Action.implicitWait(BaseTest.driver, 10);
		Action.getUrl(MYS_OVERVEW);
		Action.explicitWaitForElement(BaseTest.driver, clickOnFAQsIcon, 20);
		Action.click(clickOnFAQsIcon, "FAQs Icon");
		Action.click(FAQs_1st_Ques, " 1st FAQs Question");
		Action.click(FAQs_2nd_Ques, " 2nd FAQs Question");
		Action.click(FAQs_3rd_Ques, " 3rd FAQs Question");
		Action.click(FAQs_4th_Ques, " 3rd FAQs Question");
		Action.click(clickOnSuerveyIcon, " Survey Icon");
		Action.click(click_5th_Star," 5th Icon");
		Action.type(textArea, "Text is entered for Testing Purpose");
	}
}
