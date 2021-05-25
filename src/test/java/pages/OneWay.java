package pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import utils.CommonUtils;
import utils.DriverUtils;

public class OneWay {

    WebDriver driver;
    HomePage homePage;


    @Test
    public void oneWay(){
        driver = DriverUtils.getDriver("chrome");
        String url= CommonUtils.readProperty( "url");
        driver.get(url);




    }
}
