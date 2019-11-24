package stepDefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.it.Ma;
import gherkin.lexer.Th;
import org.openqa.selenium.support.ui.Select;
import pages.AuthenticationPage;
import utilities.Configuration;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class AuthenticationSteps {
    AuthenticationPage authenticationPage=new AuthenticationPage();
    @Given("^Navigate to Webpage$")
    public void navigate_to_Webpage() throws Throwable {
        Driver.driver.get(Configuration.getProperties("browserURL2"));


    }

    @Then("^Sign in with valid credentials$")
    public void sign_in_with_valid_credentials() throws Throwable {
        authenticationPage.signInBtn.click();
        Thread.sleep(2000);


    }

    @Then("^User logs in with valid email \"([^\"]*)\" and creates account$")
    public void user_logs_in_with_valid_email_and_creates_account(String email) throws Throwable {
        authenticationPage.emailInput.sendKeys(email);

        Thread.sleep(2000);


    }
    @Then("^After inputing email user click on Create an account button$")
    public void after_inputing_email_user_click_on_Create_an_account_button() throws Throwable {
      authenticationPage.createAccBtn.click();

    }
    @Then("^User enters personal information$")
    public void user_enters_personal_information(DataTable dataTable) throws Throwable {
        List<Map<String,Object>> listOfMaps = dataTable.asMaps(String.class, Object.class);
        authenticationPage.genderBtn.click();
        Thread.sleep(2000);
        authenticationPage.firstName.sendKeys(listOfMaps.get(0).get("First name").toString());
        Thread.sleep(2000);
        authenticationPage.lastName.sendKeys(listOfMaps.get(0).get("Last name").toString());

        Thread.sleep(2000);
        authenticationPage.password.sendKeys(listOfMaps.get(0).get("Password").toString());

        Thread.sleep(2000);
        authenticationPage.compnayInput.sendKeys(listOfMaps.get(0).get("Company").toString());

        Thread.sleep(2000);
        authenticationPage.addressInput1.sendKeys(listOfMaps.get(0).get("Address").toString());
        Thread.sleep(2000);
        authenticationPage.city.sendKeys(listOfMaps.get(0).get("City").toString());
        Thread.sleep(2000);
        Select selectState1=new Select(authenticationPage.selectState);
        selectState1.selectByVisibleText(listOfMaps.get(0).get("State").toString());

       // authenticationPage.selectState.sendKeys(listOfMaps.get(0).get("State").toString());

        Thread.sleep(2000);
        authenticationPage.zipCode.sendKeys(listOfMaps.get(0).get("Zip").toString());
        Thread.sleep(2000);
        authenticationPage.selectCountry.isSelected();

       authenticationPage.mobilePhone.sendKeys(listOfMaps.get(0).get("Mobile phone").toString());
        Thread.sleep(2000);
        authenticationPage.futureReferences.sendKeys(listOfMaps.get(0).get("Assign Reference").toString());
        Thread.sleep(2000);





    }

    @Then("^Verify if the account created by signing in$")
    public void verify_if_the_account_created_by_signing_in() throws Throwable {
        authenticationPage.registerBtn.click();
        Thread.sleep(5000);

    }
    @Then("^User logs in with valid credentials username email address \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_logs_in_with_valid_credentials_username_email_address_and_password(String email, String password) throws Throwable {
        authenticationPage.submitEmailAlready.sendKeys(email);
        Thread.sleep(2000);
        authenticationPage.submitPasswordAlready.sendKeys(password);
        Thread.sleep(2000);
       authenticationPage.submitButtonAlready.click();
       Thread.sleep(6000);
    }
    @Then("^User logs  with invalid credentials username \"([^\"]*)\" password \"([^\"]*)\"$")
    public void user_logs_with_invalid_credentials_username_password(String email, String password) throws Throwable {
        authenticationPage.submitEmailAlready.sendKeys(email);
        authenticationPage.submitPasswordAlready.sendKeys(password);
        authenticationPage.submitButtonAlready.click();

    }

    @Then("^User goes to My Addresses, updates address and verifies address$")
    public void user_goes_to_My_Addresses_updates_address_and_verifies_address() throws Throwable {
       authenticationPage.myAddresses.click();
       Thread.sleep(6000);
    }
    @Then("^User clicks on update address and updates address with new one$")
    public void user_clicks_on_update_address_and_updates_address_with_new_one(DataTable dataTable1) throws Throwable {
        List<Map<String,Object>> listOfMaps = dataTable1.asMaps(String.class, Object.class);
       // authenticationPage.firstName.sendKeys(listOfMaps.get(0).get("First name").toString());
        authenticationPage.updateAddressButton.click();
        authenticationPage.updateAddress.clear();
        Thread.sleep(2000);
        authenticationPage.updateAddress.sendKeys(listOfMaps.get(0).get("Address").toString());
        Thread.sleep(3000);
        authenticationPage.updateCity.clear();
        Thread.sleep(1000);
        authenticationPage.updateCity.sendKeys(listOfMaps.get(0).get("City").toString());
        Thread.sleep(1000);

                Select selectState2=new Select(authenticationPage.updateState);
        selectState2.selectByVisibleText(listOfMaps.get(0).get("State").toString());
        Thread.sleep(1000);
        authenticationPage.updateZip.clear();
        authenticationPage.updateZip.sendKeys(listOfMaps.get(0).get("Zip").toString());
        Thread.sleep(2000);
        authenticationPage.submitUpdateAddress.click();
        Thread.sleep(5000);

    }
    @Then("^Validate if new address is added$")
    public void validate_if_new_address_is_added() throws Throwable {

    }
    @Then("^User goes to Main page and picks (\\d+) items$")
    public void user_goes_to_Main_page_and_picks_items(int arg1) throws Throwable {
        authenticationPage.goBackHomePage.click();

    }

    @Then("^User calculates items total$")
    public void user_calculates_items_total() throws Throwable {

    }

    @And("^Verifies total price of items calculated correct$")
    public void verifies_total_price_of_items_calculated_correct() throws Throwable {

    }


}
