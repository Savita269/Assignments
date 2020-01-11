package TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClassRunner;

public class TestRunnerClass extends BaseClassRunner{

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@Test
	public void takeiPhonePricefromAmzn()
	{
		try {
			trip.obj_searchClick.click();
			trip.obj_scndSearch.sendKeys("Club Mahindra");
			trip.obj_clkOnSearch.click();
			trip.obj_selectFirstList.click();
			trip.obj_clckWriteReview.click();
			driver.switchTo().window("0");

			Actions action = new Actions(driver);
			WebElement we = trip.obj_clkRatings;
			action.moveToElement(we).moveToElement(driver.findElement(By.xpath("ui_bubble_rating fl bubble_50"))).click().build().perform();

			trip.obj_writeInFirstText.sendKeys("Good resort");
			trip.obj_writeInsecondText.sendKeys("enter minimum 200 charactores");
			trip.obj_clkOnSolo.click();

			Select select = new Select(trip.obj_selectYear);
			select.getOptions().get(1).click();
			trip.obj_checkBox.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
