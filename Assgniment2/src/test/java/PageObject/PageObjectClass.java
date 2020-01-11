package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectClass {
	public PageObjectClass(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@title='Search']")
	public WebElement obj_searchClick;

	@FindBy(xpath="//input[@id='mainSearch']")
	public WebElement obj_scndSearch;

	@FindBy(xpath="//button[@id='SEARCH_BUTTON']")
	public WebElement obj_clkOnSearch;

	@FindBy(xpath = "//div[@class='main-content']")
	public WebElement obj_selectFirstList;

	@FindBy(xpath = "//span[@id='bubble_rating']")
	public WebElement obj_clkRatings;

	@FindBy(xpath = "//a[text()='Write a review']")
	public WebElement obj_clckWriteReview;

	@FindBy(id = "ReviewTitle")
	public WebElement obj_writeInFirstText;

	@FindBy(id = "ReviewText")
	public WebElement obj_writeInsecondText;

	@FindBy(xpath = "//div[@data-category='soloTraveler']")
	public WebElement obj_clkOnSolo;

	@FindBy(id = "trip_date_month_year")
	public WebElement obj_selectYear;

	@FindBy(id = "noFraud")
	public WebElement obj_checkBox;

	@FindBy(id = "SUBMIT")
	public WebElement obj_clkSubmit;
}


