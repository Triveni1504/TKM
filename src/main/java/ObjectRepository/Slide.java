package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Slide {

	@FindBy(xpath= "//div[@class='iToJ4v Kaqq1s']")private WebElement left;
	
	@FindBy(xpath= "//div[@class='iToJ4v D0puJn']")private WebElement Right;
	
	public Slide(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeft() {
		return left;
	}

	public WebElement getRight() {
		return Right;
	}
	
}

//setter and getter method frameclass
