package com.IFHPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

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
	private @FindBy(id = "ifhFaqControlOC2964") WebElement FAQs_1st_Ques_Ovw;
	private @FindBy(id = "ifhFaqControlOC2965") WebElement FAQs_2nd_Ques_Ovw;
	private @FindBy(id = "ifhFaqControlOC2966") WebElement FAQs_3rd_Ques_Ovw;
	private @FindBy(id = "ifhFaqControlOC2968") WebElement FAQs_4th_Ques_Ovw;
	private @FindBy(xpath = "//button[@title='Give us feedback']") WebElement clickOnSuerveyIcon;
	private @FindBy(xpath ="//button[@id='ifhRatingSelect_0_5']") WebElement click_5th_Star;
	private @FindBy(xpath = "//textarea[@id='ifhTextArea_2']")WebElement textArea_Ovw;
	
	private @FindBy(id = "ifhFaqContentOC3290")WebElement FAQs_1st_Ques_Active;
	private @FindBy(id = "ifhFaqItemOC3291")WebElement FAQs_2nd_Ques_Active;
	private @FindBy(id = "ifhFaqItemOC3292")WebElement FAQs_3rd_Ques_Active;
	private @FindBy(id = "ifhFaqItemOC3293")WebElement FAQs_4th_Ques_Active;
	private @FindBy(id = "ifhFaqItemOC3294")WebElement FAQs_5th_Ques_Active;
	private @FindBy(xpath = "//textarea[@id='ifhTextArea_3']")WebElement textArea_Active;
	
	private @FindBy(id = "ifhFaqItemOC2834")WebElement FAQs_1st_Ques_Unsold;
	private @FindBy(id = "ifhFaqItemOC2835")WebElement FAQs_2nd_Ques_Unsold;
	private @FindBy(id = "ifhFaqItemOC2836")WebElement FAQs_3rd_Ques_Unsold;
	private @FindBy(id = "ifhFaqItemOC2837")WebElement FAQs_4th_Ques_Unsold;
	private @FindBy(id = "ifhFaqItemOC2838")WebElement FAQs_5th_Ques_Unsold;
	private @FindBy(xpath = "//textarea[@id='ifhTextArea_2']")WebElement textArea_Unsold;
	
	private @FindBy(xpath = "//button[@title='Technical issues?']") WebElement clickOnSuerveyIconSold;
	private @FindBy(id = "ifhFaqItemOC2897")WebElement FAQs_1st_Ques_Sold;
	private @FindBy(id = "ifhFaqItemOC2898")WebElement FAQs_2nd_Ques_Sold;
	private @FindBy(id = "ifhFaqItemOC2899")WebElement FAQs_3rd_Ques_Sold;
	private @FindBy(id = "ifhFaqItemOC3380")WebElement FAQs_4th_Ques_Sold;
	private @FindBy(id = "ifhFaqItemOC3381")WebElement FAQs_5th_Ques_Sold;
	private @FindBy(xpath = "//textarea[@id='ifhTextArea_3']")WebElement textArea_Sold_01;
	private @FindBy(xpath = "//textarea[@id='ifhTextArea_6']")WebElement textArea_Sold_02;
	
	
	
	
	
	public MySellinPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void mySellingSold() throws Throwable {
		login();
//		Action.implicitWait(BaseTest.driver, 10);
		Action.getUrl(MYS_SOLD);
		Action.explicitWaitForElement(BaseTest.driver, clickOnFAQsIcon, 20);
		Action.click(clickOnFAQsIcon, "FAQs Icon");
		Action.click(FAQs_1st_Ques_Sold, " 1st FAQs Question");
		Action.click(FAQs_2nd_Ques_Sold, " 2nd FAQs Question");
		Action.click(FAQs_3rd_Ques_Sold, " 3rd FAQs Question");
		Action.click(FAQs_4th_Ques_Ovw, " 3rd FAQs Question");
		Action.click(FAQs_5th_Ques_Sold, " 3rd FAQs Question");
		Action.click(clickOnSuerveyIconSold, " Survey Icon");
		Action.click(click_5th_Star," 5th star");
		Action.type(textArea_Sold_01, "Text is entered for Testing Purpose");
		Action.type(textArea_Sold_02, "Text is entered for Testing Purpose");
	}
	
	public void login() throws Throwable {
		loadConfigValues();
		Action.getUrl(US_URL);
		Action.click(signInButton, "Singin Button");
		Action.click(giveUserId, "Userd Id Text Area");
		Action.type(giveUserId, USER_ID);
		Action.click(signIn_Continue_Btn, "SingIn Continue Button");
		Action.click(givePassword, "Password Text Area");
		Action.type(givePassword,PASSWORD);
		Action.click(singIn_Btn, "SingIn Button");
		
	}
	
	public void mySellingOverview() throws Throwable {
		login();
//		Action.implicitWait(BaseTest.driver, 10);
		Action.getUrl(MYS_OVERVEW);
		Action.explicitWaitForElement(BaseTest.driver, clickOnFAQsIcon, 20);
		Action.click(clickOnFAQsIcon, "FAQs Icon");
		Action.click(FAQs_1st_Ques_Ovw, " 1st FAQs Question");
		Action.click(FAQs_2nd_Ques_Ovw, " 2nd FAQs Question");
		Action.click(FAQs_3rd_Ques_Ovw, " 3rd FAQs Question");
		Action.click(FAQs_4th_Ques_Ovw, " 4th FAQs Question");
		Action.click(clickOnSuerveyIcon, " Survey Icon");
		Action.click(click_5th_Star," 5th star");
		Action.type(textArea_Ovw, "Text is entered for Testing Purpose");
	}

	public void mySellingActive() throws Throwable {
		login();
//		Action.implicitWait(BaseTest.driver, 10);
		Action.getUrl(MYS_ACTIVE);
		Action.explicitWaitForElement(BaseTest.driver, clickOnFAQsIcon, 20);
		Action.click(clickOnFAQsIcon, "FAQs Icon");
		Action.click(FAQs_1st_Ques_Active, " 1st FAQs Question");
		Action.click(FAQs_2nd_Ques_Active, " 2nd FAQs Question");
		Action.click(FAQs_3rd_Ques_Active, " 3rd FAQs Question");
		Action.click(FAQs_4th_Ques_Active, " 4th FAQs Question");
		Action.click(FAQs_5th_Ques_Active, " 5th FAQs Question");
		Action.click(clickOnSuerveyIcon, " Survey Icon");
		Action.click(click_5th_Star," 5th star");
		Action.type(textArea_Active, "Text is entered for Testing Purpose");
		
	}
	
	public void mySellingUnslod() throws Throwable {
		login();
//		Action.implicitWait(BaseTest.driver, 10);
		Action.getUrl(MYS_UNSOLD);
		Action.explicitWaitForElement(BaseTest.driver, clickOnFAQsIcon, 20);
		Action.click(clickOnFAQsIcon, "FAQs Icon");
		Action.click(FAQs_1st_Ques_Unsold, " 1st FAQs Question");
		Action.click(FAQs_2nd_Ques_Unsold, " 2nd FAQs Question");
		Action.click(FAQs_3rd_Ques_Unsold, " 3rd FAQs Question");
		Action.click(FAQs_4th_Ques_Unsold, " 4th FAQs Question");
		Action.click(FAQs_5th_Ques_Unsold, " 5th FAQs Question");
		Action.click(clickOnSuerveyIcon, " Survey Icon");
		Action.click(click_5th_Star," 5th star");
		Action.type(textArea_Unsold, "Text is entered for Testing Purpose");
		
	}
}
