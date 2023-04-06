package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utils.BrowserUtils;

import java.util.List;

public class HomeSteps {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();
    }

    @Given("I logIn as {string} with password {string}")
    public void iLogInAsWithPassword(String username, String password) {
        BrowserUtils.sendKeys(page.userNameField, username);
        BrowserUtils.sendKeys(page.passwordField, password);
        BrowserUtils.click(page.loginBtn);
    }

    @Then("Verify {string} button is visible")
    public void verifyButtonIsVisible(String btn) {
        BrowserUtils.isEnabled(page.manageAccessBtn);
    }


    @Then("Verify title is displayed {string}")
    public void verifyTitleIsDisplayed(String arg0) {
    }

    @When("I add new dashboard {string}")
    public void i_add_new_dashboard(String newDashboardText) {
        BrowserUtils.sendKeys(page.newDashboardField, newDashboardText);
        BrowserUtils.click(page.newDashboardAddBtn);
    }

    @And("I click a button {string}")
    public void iClickAButton(String btn) {
        switch (btn) {
            case "Sign out" -> BrowserUtils.click(page.signOutBtn);
            case "Manage Access" -> {
                BrowserUtils.click(page.manageAccessBtn);
            }
        }
    }

    @Then("Verify dashboard {string} is displayed")
    public void verifyDashboardIsDisplayed(String newDashboardtext) {
        WebElement newDashboard = BrowserUtils.getDriver().findElement(By.xpath("//button[text()='" + newDashboardtext + "']"));
        BrowserUtils.isDisplayed(newDashboard);
    }


    @When("I click a button {string} in section {string}")
    public void iClickAButtonInSection(String btn, String section) {
        switch (section) {
            case "Do" -> {
                if (btn.equals("edit")) {
                    BrowserUtils.click(page.firstDoEditBtn);
                } else if (btn.equals("delete")) {
                    BrowserUtils.click(page.firstDoDeleteBtn);
                }
            }
            case "Don't" -> {
                if (btn.equals("edit")) {
                    BrowserUtils.click(page.firstDontEditBtn);
                } else if (btn.equals("delete")) {
                    BrowserUtils.click(page.firstDontDeleteBtn);
                }
            }
        }
    }


    @And("add to item text {string} in section {string}")
    public void addToItemTextInSection(String text, String section) {
        switch (section) {
            case "Do" -> {
                BrowserUtils.sendKeys(page.firstDoEditField, text);
                BrowserUtils.click(page.editDoAcceptBtn);
            }
            case "Don't" -> {
                BrowserUtils.sendKeys(page.firstDontEditField, text);
                BrowserUtils.click(page.editDontAcceptBtn);
            }
        }
    }

    @Then("Verify item contain text {string} in section {string}")
    public void verifyItemIsDisplayed(String text, String section) {

        switch (section) {
            case "Do" -> {
                WebElement textResult = BrowserUtils.getDriver().findElement(
                        By.xpath("//div[@class='anyClass']//div[contains(text(), '" + text + "')]"));
                BrowserUtils.isDisplayed(textResult);
            }
            case "Don't" -> {
                WebElement textResult = BrowserUtils.getDriver().findElement(
                        By.xpath("//div[@class=' col-md-6']//div[contains(text(), '" + text + "')]"));
                BrowserUtils.isDisplayed(textResult);
            }
        }
    }

    @Then("Verify item which contain text {string} is deleted in section {string}")
    public void verifyItemWhichContainTextIsDeleted(String containText, String section) {

        switch (section) {
            case "Do" -> {
                WebElement textResult = BrowserUtils.getDriver().findElement(
                        By.xpath("//div[@class='anyClass']//div[contains(text(), '" + containText + "')]"));
                if (BrowserUtils.isDisabled(textResult)) {
                    Assert.fail();
                } else BrowserUtils.assertTrue(true);
            }
            case "Don't" -> {
                WebElement textResult = BrowserUtils.getDriver().findElement(
                        By.xpath("//div[@class=' col-md-6']//div[contains(text(), '" + containText + "')]"));
                if (BrowserUtils.isDisabled(textResult)) {
                    Assert.fail();
                } else BrowserUtils.assertTrue(true);
            }
        }

    }


}
