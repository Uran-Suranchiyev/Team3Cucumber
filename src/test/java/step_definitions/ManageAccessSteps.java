package step_definitions;

import io.cucumber.java.en.Then;
import pages.ManageAccessPage;
import utils.BrowserUtils;

import java.util.List;

public class ManageAccessSteps {
    ManageAccessPage page;
    public ManageAccessSteps(){
        page = new ManageAccessPage();
    }
    @Then("Verify form in Manage Access page is displayed with following fields:")
    public void verifyFormInManageAccessPageIsDisplayedWith(List<String> fields) {
        for (String each : fields) {
            switch (each) {
                case "First Name" -> BrowserUtils.isDisplayed(page.firstname);
                case "Last Name" -> BrowserUtils.isDisplayed(page.lastname);
                case "E-mail" -> BrowserUtils.isDisplayed(page.email);
                case "Role" -> BrowserUtils.isDisplayed(page.role);
                case "Batch" -> BrowserUtils.isDisplayed(page.batch);
            }
        }
    }
}
