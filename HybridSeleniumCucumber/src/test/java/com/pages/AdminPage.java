package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.Library;

public class AdminPage extends Library {
	 @FindBy(xpath="//*[@id=\\\"menu_admin_viewAdminModule\\\"]")
	    WebElement Admin;
	 @FindBy(xpath="//*[@id=\"menu_admin_Job\"]")
	    WebElement Jobs;
	 @FindBy(xpath="//*[@id=\"menu_admin_jobCategory\"]")
	    WebElement Cat;
	    
	 

	    public AdminPage(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
}
	    public void Initiate() {
	    	Actions action = new Actions(driver);
	    	action.moveToElement(Admin).perform();
	    	action.moveToElement(Jobs).perform();
	    	action.moveToElement(Cat).click().build().perform();

	    }
}
