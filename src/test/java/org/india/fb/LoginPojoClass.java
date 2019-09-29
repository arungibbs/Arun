package org.india.fb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoClass extends BaseClass {
	
	
	public LoginPojoClass () {
	PageFactory.initElements (driver, this);
	}

	@FindBy(id="email")
	private WebElement Username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="loginbutton")
	private WebElement button;
	
	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getButton() {
		return button;
	}

}

