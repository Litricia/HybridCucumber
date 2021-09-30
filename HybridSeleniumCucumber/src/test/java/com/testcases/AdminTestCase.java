package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClass.Library;
import com.pages.AdminPage;
import com.seleniumReusableFunctions.SeleniumUtilities;

public class AdminTestCase extends Library {
	@BeforeTest
    public void startUp() {
        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");

    }
	    
	    @Test
	    public void login() {
	        AdminPage admin=new AdminPage(driver);
	        admin.Initiate();

	    }
	    @AfterClass
	    public void close() throws IOException {
	        SeleniumUtilities sUti = new SeleniumUtilities(driver);
	        sUti.to_take_screenshot("src\\test\\resources\\screenshots\\orangeHRMAdminUser.png");

	        quit();

	    }
}
