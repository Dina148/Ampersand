package utils;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;



public class Base {


    public WebDriver driver;
    protected Actions actions;

    @Test
    public void  setUp(){
        String browser=CommonUtils.readProperty( "browser");
        driver=DriverUtils.getDriver(browser);
        actions = new Actions(driver);

    }
}
