package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartObj {

	public FlipkartObj(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	public WebElement obj_flp_search;

	@FindBy(xpath = "//svg[@viewBox='0 0 17 18']")
	public WebElement obj_flp_clk_search;

	@FindBy(xpath = "//div[@class='_1vC4OE _2rQ-NK']")
	public WebElement obj_flp_price;
	
}
