package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CodingPage;
import pages.HomePage;
import pages.SoftSkillPage;
import utils.BrowserUtils;

import java.util.List;

public class HomeSteps {
    CodingPage codingPage;
    SoftSkillPage softSkillPage;
    HomePage page;

    public HomeSteps() {
        softSkillPage = new SoftSkillPage();
        codingPage = new CodingPage();
        page = new HomePage();
    }

    @Given("I logIn as {string} with password {string}")
    public void iLogInAsWithPassword(String username, String password) {
        BrowserUtils.sendKeys(page.userNameField, username);
        BrowserUtils.sendKeys(page.passwordField, password);
        BrowserUtils.click(page.loginBtn);
    }

    @Then("I should be able to see only {string} button")
    public void i_should_be_able_to_see_only_button(String string) {
        System.out.println("Verify Sign out button is displayed");
        BrowserUtils.isDisplayed(page.signOutBtn);
    }


    @Then("Verify text {string} is displayed")
    public void verifyTextStringIsDisplayed(String txt) {
        switch (txt.toLowerCase()) {
            case "all topics":
                BrowserUtils.isDisplayed(page.allTopicsBtn);
                break;
            case "coding":
                BrowserUtils.isDisplayed(page.codingBtn);
                break;
            case "soft skills":
                BrowserUtils.isDisplayed(page.softSkillsBtn);
                break;
            default:
                System.out.println("text not displayed");
                Assert.fail();
        }
    }


    @Then("Verify I have an option add text {string} in do section")
    public boolean verifyIHaveAnOptionAddTextStringInDoSection(String s) {
        if (s == null)
            return false;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if ((!Character.isLetterOrDigit(s.charAt(i)))) {
                return false;
            }
            page.yourInputDo.sendKeys(s);

        }
        return true;
    }


    @Then("Verify I  have an option add text {string} in dont's section")
    public boolean verify_i_have_an_option_add_text_in_dont_s_section(String s) {
        if (s == null)
            return false;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if ((Character.isLetterOrDigit(s.charAt(i)) == false)) {
                return false;
            }
            page.yourInputDont.sendKeys(s);
        }
        return true;
    }

    @When("I click a button Coding")
    public void iClickAButtonCoding() {
        BrowserUtils.click(page.codingBtn);
    }

    @And("I click a button Enter new question")
    public void iClickAButtonEnterNewQuestion() {
        BrowserUtils.click(page.enterQuestionBtn);
    }


    @When("I click a button Soft Skills")
    public void iClickAButtonSoftSkills() {
        BrowserUtils.click(page.softSkillsBtn);
    }

    @Then("Verify following dashboards are displayed:")
    public void verifyFollowingDashboardsAreDisplayed(List<String> dash) {
        for (String each : dash) {
            switch (each.toLowerCase()) {
                case "all topics":
                    BrowserUtils.isDisplayed(page.allTopicsBtn);
                    break;
                case "coding":
                    BrowserUtils.isDisplayed(page.codingBtn);
                    break;
                case "soft skills":
                    BrowserUtils.isDisplayed(page.softSkillsBtn);
                    break;
                default:
                    System.out.println("text not displayed");
                    Assert.fail();
            }
        }

    }

    @When("I click a button {string}")
    public void iClickAButtonString(String homeBtn) {
        switch (homeBtn) {
            case "Sign out":
                BrowserUtils.click(page.signOutBtn);
                break;
            case "Manage Access":
                BrowserUtils.click(page.manageAccessBtn);
                break;
            case "addDoBtn":
                BrowserUtils.click(page.addDoBtn);
                break;
            case "addDontBtn":
                BrowserUtils.click(page.addDontBtn);
                break;
            case "enterBtn":
                BrowserUtils.click(page.enterBtn);
                break;
            case "enterNewQuestion":
                BrowserUtils.click(page.enterNewQuestionBtn);
                break;
            case "enterQuestionBtn":
                BrowserUtils.click(page.enterQuestionBtn);
                break;
            case "Coding":
                BrowserUtils.click(page.codingBtn);
                break;
            case "Soft Skill":
                BrowserUtils.click(page.softSkillsBtn);
                break;
            case "enter":
                BrowserUtils.click(codingPage.enterBtnP);
                break;
            default:

                System.out.println("Invalid button");

        }
    }

    @When("I click a dashboard button {string}")
    public void iClickADashboardButton(String btn) {
        switch (btn) {
            case "Coding" -> BrowserUtils.click(page.codingBtn);
            case "Soft Skill" -> BrowserUtils.click(page.softSkillsBtn);
            default -> System.out.println("Invalid button");
        }
    }


    @And("I fill out new question {string} in page {string}")
    public void iFillOutNewQuestionInPage(String question, String dashboard) {
        switch (dashboard) {
            case "Coding" -> BrowserUtils.sendKeys(codingPage.newQuestionField, question);
            case "Soft Skill" -> BrowserUtils.sendKeys(softSkillPage.newQuestionSoftSkillField, question);
            default -> System.out.println("Invalid button");
        }
    }


    @Then("Verify new question {string} is displayd")
    public void verifyNewQuestionInPageIsDisplayd(String question) {
        WebElement result= BrowserUtils.getDriver().findElement(By.xpath("//a//p[contains(text(), '"+ question + "')]"));
        BrowserUtils.isDisplayed(result);

    }

    @Then("Verify title is displayed {string}")
    public void verifyTitleIsDisplayed(String title) {
    String actual = page.headerTitle.getText();
    BrowserUtils.assertEquals(actual,title);
    }

    @Then("Verify {string} button is visible")
    public void verifyButtonIsVisible(String btn) {
        BrowserUtils.isEnabled(page.manageAccessBtn);
    }

    @When("I add new dashboard {string}")
    public void i_add_new_dashboard(String newDashboardText) {
        BrowserUtils.sendKeys(page.newDashboardField, newDashboardText);
        BrowserUtils.click(page.newDashboardAddBtn);
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



























