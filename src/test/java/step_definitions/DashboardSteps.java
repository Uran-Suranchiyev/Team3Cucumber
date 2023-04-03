package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.DashboardPage;
import pages.HomePage;
import utils.BrowserUtils;

public class DashboardSteps {
    DashboardPage page;
     HomePage homePage;
    public DashboardSteps() {
        page = new DashboardPage();
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
}
