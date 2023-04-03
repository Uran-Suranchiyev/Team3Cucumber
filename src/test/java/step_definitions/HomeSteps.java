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

    @Given("I logIn as user {string} with password {string}")
    public void iLogInAsUserWithPassword(String username, String password) {
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
            if ((Character.isLetterOrDigit(s.charAt(i)) == false)) {
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
                BrowserUtils.click(page.enterBtnP);
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
            case "Coding" -> BrowserUtils.sendKeys(page.newQuestionField, question);
            case "Soft Skill" -> BrowserUtils.sendKeys(page.newQuestionSoftSkillField, question);
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
}
