package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps {
    HomePage page;

    public HomeSteps() {
        page = new HomePage();
    }

    @Given("I logIn as user {string} with password {string}")
    public void iLogInAsUserWithPassword(String username, String password) {
        BrowserUtils.sendKeys(page.userNameField, username);
        BrowserUtils.sendKeys(page.passwordField, password);
        BrowserUtils.click(page.loginBtn);
    }

    @When("I click on {string} button")
    public void iClickOnButton(String textButton) {
        switch (textButton.toLowerCase()) {
            case "soft skills":
                BrowserUtils.click(page.softSkillsBtn);
                break;
            case "coding":
                BrowserUtils.click(page.codingBtn);
                break;
            case "all topics":
                BrowserUtils.click(page.allTopicsBtn);
                break;
            case "show all btn":
                BrowserUtils.click(page.showAllBtn);
                break;
            case "search icon":
                BrowserUtils.click(page.searchBtn);
                break;
            case "show all":
                BrowserUtils.click(page.showAllBtn);
                break;
            case "sign out":
                BrowserUtils.click(page.signOutBtn);
            default:
                System.out.println("Failed to be displayed");


        }
    }

    @Then("Verify {string} button is enabled")
    public void verifyButtonIsEnabled(String editDeleteBtn) {

        switch (editDeleteBtn.toLowerCase()) {
            case "edit":
                BrowserUtils.isEnabled(page.editBtn);
                break;
            case "delete":
                BrowserUtils.isEnabled(page.deleteBtn);
                break;
            default:
                System.out.println("Button isn't enabled");
        }
    }


    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String questionsList) {
        switch (questionsList) {
            case "all questions":
                BrowserUtils.isDisplayed(page.allQuestionsList);
                break;
            case "sorted questions":
                BrowserUtils.isDisplayed(page.dashboardContent);
                break;
            case "What is java 8?":
                BrowserUtils.isDisplayed(page.dashBrCont);
                break;
            case "log in":
                BrowserUtils.isDisplayed(page.loginBtn);
                break;
            default:
                System.out.println("Failed to be displayed");
        }

    }

    @And("I enter {string} word criteria into the the search field")
    public void iEnterWordCriteriaIntoTheTheSearchField(String searchField) {
        switch (searchField) {
            case "What is java 8?":
                BrowserUtils.sendKeys(page.searchField2, "What is java 8?");
                break;
            default:
                System.out.println("Not valid input");
        }
    }

}



























