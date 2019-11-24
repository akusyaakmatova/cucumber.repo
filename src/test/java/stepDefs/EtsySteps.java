package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EtsyHomePage;
import pages.EtsyResultPage;
import pages.EtsySearchFreeShiiping;
import utilities.Configuration;
import utilities.Driver;
import org.openqa.selenium.Keys;

import java.beans.beancontext.BeanContextChild;


public class EtsySteps {


    EtsyHomePage etsyHomePage = new EtsyHomePage();
    EtsyResultPage etsyResultPage = new EtsyResultPage();
    EtsySearchFreeShiiping etsySearchFreeShiiping = new EtsySearchFreeShiiping();

    @Given("^Navigate to Etsy Homepage$")
    public void navigate_to_Etsy_Homepage() throws Throwable {
        Driver.driver.get(Configuration.getProperties("EtsyURL"));


    }

    @When("^User searches for \"([^\"]*)\"$")
    public void user_searches_for(String item) throws Throwable {
        etsyHomePage.searchBox.sendKeys(item + Keys.ENTER);

    }

    @Then("^Validate search message have  word \"([^\"]*)\"$")
    public void validate_search_message_have_word(String item) throws Throwable {
        String actualSearchMessage = etsyResultPage.searchMessage.getText();
        Assert.assertEquals(item, actualSearchMessage);


    }

    @When("^User clicks on \"([^\"]*)\"$")
    public void user_clicks_on(String department) throws Throwable {


        if (etsyHomePage.jewelAccess.getText().equalsIgnoreCase(department)) {
            etsyHomePage.jewelAccess.click();
        } else if (
                etsyHomePage.clothShoe.getText().equalsIgnoreCase(department)) {
            etsyHomePage.clothShoe.click();

        } else if (
                etsyHomePage.homeLiving.getText().equalsIgnoreCase(department)) {
            etsyHomePage.homeLiving.click();


        } else if (
                etsyHomePage.wedParty.getText().equalsIgnoreCase(department)) {
            etsyHomePage.wedParty.click();
        }
    }

    @Then("^User validate Title \"([^\"]*)\"$")
    public void user_validate_Title(String title) throws Throwable {
        String actualTitle = Driver.driver.getTitle();


        Assert.assertEquals(title, actualTitle);


    }

    @Then("^User clicks on Free Shipping$")
    public void user_clicks_on_Free_Shipping() throws Throwable {
        Thread.sleep(4000);
        etsySearchFreeShiiping.clickFreeShipBtn.click();
        Thread.sleep(4000);


    }

    @Then("^Verify all results have \"([^\"]*)\" label$")
    public void verify_all_results_have_label(String label) throws Throwable {
        for (WebElement element : etsySearchFreeShiiping.freeShippingLabels) {
            Assert.assertEquals(label, element.getText().trim());
        }

    }

    @When("^User clicks on Over Price checkbox$")
    public void user_clicks_on_Over_Price_checkbox() throws Throwable {

        Thread.sleep(2000);
        etsySearchFreeShiiping.over1000CheckBox.click();
        Thread.sleep(3000);

    }

    @Then("^User verifies all items prices are over that price$")
    public void user_verifies_all_items_prices_are_over_that_price() throws Throwable {
        for (WebElement element : etsySearchFreeShiiping.resultPrices) {
            String number = element.getText().replace(",", "");
            double price = Double.parseDouble(element.getText());
            if (!number.isEmpty()) {
                Assert.assertTrue(price >= 1000);
            }

        }


    }
}
