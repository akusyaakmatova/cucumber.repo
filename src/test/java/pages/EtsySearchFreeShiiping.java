package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EtsySearchFreeShiiping {
    WebDriver driver;
    public EtsySearchFreeShiiping(){
        this.driver= Driver.driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@href='https://www.etsy.com/search?q=wireless+phone+charger&explicit=1&free_shipping=true']")
    public WebElement clickFreeShipBtn;
   @FindBy(xpath = "//span[@class='text-body-smaller no-wrap']")
    public List<WebElement> freeShippingLabels;
   @FindBy(xpath = "//a[@data-path='Over $1,000']")
    public WebElement over1000CheckBox;
   @FindBy(xpath = "//ul[@class='responsive-listing-grid wt-grid wt-grid--block justify-content-flex-start pl-xs-0']")
    public List<WebElement> resultPrices;




}
