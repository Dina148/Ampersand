package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='from0']")
    public WebElement from;

    @FindBy(xpath = "//input[@id='to0']")
    public WebElement to;

    @FindBy(xpath = "//input[@id='searchNow']")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@id='cal0']")
    public WebElement deport;



}
