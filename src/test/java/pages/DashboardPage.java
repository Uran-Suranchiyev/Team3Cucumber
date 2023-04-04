package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class DashboardPage {

        public DashboardPage(){
            PageFactory.initElements(BrowserUtils.getDriver(), this);
        }
    @FindBy(xpath = "//button[@class='btn btn-warning badge-pill newbtn']")
    public WebElement enterNewQuestionBtn;
    @FindBy(xpath = "//textarea[@id='question']")
    public WebElement newQuestionField;
    @FindBy(xpath = "//button[text()='Enter new question ']")
    public WebElement enterQuestionBtn;
    @FindBy(xpath = "//input[@name='question']")
    public WebElement newQuestionSoftSkillField;
    @FindBy(xpath = "//button[text()='Enter']")
    public WebElement enterBtnP;
    @FindBy(xpath = "//a//p")
    public List<WebElement> questions;
}
