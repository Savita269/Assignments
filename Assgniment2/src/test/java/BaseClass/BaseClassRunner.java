package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import PageObject.PageObjectClass;


public class BaseClassRunner {

public static WebDriver driver = null;
public static PageObjectClass trip = null;

public static void initialization() throws InterruptedException
{
System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Library\\Drivers\\geckodriver.exe");
driver = new FirefoxDriver();
trip = new PageObjectClass(driver);

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();

}
}