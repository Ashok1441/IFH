package com.IFHTests;

import org.testng.annotations.Test;

import com.BaseClass.BaseTest;
import com.IFHPages.MySellinPage;

public class MySellingPageTest extends BaseTest{
	
	@Test
	public void mySellingOver() throws Throwable {
		new MySellinPage().mySellingOverview();
	}

}
