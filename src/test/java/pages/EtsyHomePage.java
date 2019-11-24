package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EtsyHomePage {
    WebDriver driver;
    public EtsyHomePage(){
        this.driver= Driver.driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='global-enhancements-search-query']")
    public WebElement searchBox;
    @FindBy(id="catnav-primary-link-10855")
    public  WebElement jewelAccess;
    @FindBy(id="catnav-primary-link-10923")
    public WebElement clothShoe;
    @FindBy(id="catnav-primary-link-891")
    public WebElement homeLiving;
    @FindBy(id="catnav-primary-link-10983")
    public WebElement wedParty;

}
