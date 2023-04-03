package pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(xpath = "//h2")
    public WebElement headerTitle;
    @FindBy(name = "email")
    public WebElement userNameField;
    @FindBy(name = "password")
    public WebElement passwordField;
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginBtn;
    @FindBy(xpath ="//u[normalize-space()='Sign out']" )
    public WebElement signOutBtn;
    @FindBy(linkText="All Topics")
    public WebElement allTopicsBtn;
    @FindBy(xpath = "//button[text()='Coding']")
    public WebElement codingBtn;
    @FindBy(xpath = "//button[text()='Soft skills']")
    public WebElement softSkillsBtn;
    @FindBy(xpath = "//button[normalize-space()='Add do']")
    public WebElement addDoBtn;
    @FindBy(xpath = "//div[@class='col-md-3 dont']//button[@class='btn btn-success badge-pill newbtn mb-3']")
    public WebElement addDontBtn;
    @FindBy(id ="inputArea1")
    public WebElement yourInputDo;
    @FindBy(id ="inputArea2")
    public WebElement yourInputDont;
    @FindBy(xpath = "//div[@class='dodont']//div[2]//form[1]//button[1]")
    public WebElement enterBtn;
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
