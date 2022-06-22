package com.IFHTests;

import org.testng.annotations.Test;

import com.BaseClass.BaseTest;
import com.IFHPages.MySellinPage;

public class MySellingPageTest extends BaseTest{
	@Test
	public void mySellingOverview() throws Throwable {
		new MySellinPage().mySellingOverview();
	}
	
	@Test
	public void mySellingActive() throws Throwable {
		new MySellinPage().mySellingActive();
	}
	
	@Test
	public void mySellingUnsold() throws Throwable {
		new MySellinPage().mySellingUnslod();
	}
	
	@Test
	public void mySellingSold() throws Throwable {
		new MySellinPage().mySellingSold();
	}
	

}
