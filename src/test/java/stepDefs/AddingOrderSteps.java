package stepDefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.OrdersHomePage;
import pages.OrdersPage;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class AddingOrderSteps {
    OrdersHomePage ordersHomePAge = new OrdersHomePage();
    OrdersPage ordersPage = new OrdersPage();
    int initialOrderCount;

    @Then("^User clicks on order$")
    public void user_clicks_on_order() throws Throwable {
        initialOrderCount = ordersHomePAge.orderRows.size();


        ordersHomePAge.OrderButton.click();

    }

    @Then("^User creates new order$")
    public void user_creates_new_order(DataTable dataTable) throws Throwable {
        List<Map<String, Object>> listOFMaps = dataTable.asMaps(String.class, Object.class);
        Select select = new Select(ordersPage.productDropDown);
        select.selectByVisibleText(listOFMaps.get(0).get("Product Name").toString());
        ordersPage.quantity.sendKeys(listOFMaps.get(0).get("Quantity").toString());
        ordersPage.customerName.sendKeys(listOFMaps.get(0).get("Customer Name").toString());
        ordersPage.streetInput.sendKeys(listOFMaps.get(0).get("Street").toString());
        ordersPage.cityInput.sendKeys(listOFMaps.get(0).get("City").toString());
        ordersPage.stateInput.sendKeys(listOFMaps.get(0).get("State").toString());
        ordersPage.zipCodeinput.sendKeys(listOFMaps.get(0).get("Zip").toString());
        ordersPage.visaCard.click();
        ordersPage.cardNum.sendKeys(listOFMaps.get(0).get("Card Number").toString());
        ordersPage.expirationDate.sendKeys(listOFMaps.get(0).get("Expired Date").toString());
        ordersPage.proccessButton.click();
        Thread.sleep(4000);


    }



    @Then("^User verifies Order \"([^\"]*)\" created$")
    public void user_verifies_Order_created(String isCondition) throws Throwable {
        ordersPage.ordersViewButton.click();
        int afterOrderCreatedRows = ordersHomePAge.orderRows.size();
       if (isCondition.equalsIgnoreCase("is")){  Assert.assertEquals(initialOrderCount + 1, afterOrderCreatedRows);


       }else{
           Assert.assertEquals(initialOrderCount, afterOrderCreatedRows);

       }


    }


}
