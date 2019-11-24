package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrdersPage {
    WebDriver driver;
    public OrdersPage() {
        this.driver = Driver.driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productDropDown;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']")
    public WebElement quantity;
    @FindBy(id="ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetInput;
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityInput;
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipCodeinput;
    @FindBy(id="ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaCard;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNum;
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expirationDate;
    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateInput;
    @FindBy(xpath = "//a[@href='Default.aspx']")
    public  WebElement ordersViewButton;
    @FindBy(id="ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement proccessButton;

}
