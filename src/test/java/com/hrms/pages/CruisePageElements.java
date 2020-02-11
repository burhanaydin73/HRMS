package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CruisePageElements {

	@FindBy(id="CRGH")
	public WebElement cruiseLnk;
	
	@FindBy(id="IbuM-origin-display-status")
	public WebElement anyPort;
	
	@FindBy(id="IbuM-destination-display-status")
	public WebElement allDestination;
	
	@FindBy(id="IbuM-cruiseline-display-status")
	public WebElement allCruiseLine;
	
	
	
	
}
