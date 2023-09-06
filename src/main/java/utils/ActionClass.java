package utils;

import org.openqa.selenium.WebElement;

public class ActionClass {
	
	public void ASendKeys(WebElement webElement, String DatatoSend) {
		webElement.clear();
		webElement.sendKeys(DatatoSend);
	}

}
