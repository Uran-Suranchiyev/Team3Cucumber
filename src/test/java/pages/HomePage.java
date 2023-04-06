package pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(name = "email")
    public WebElement userNameField;
    @FindBy(name = "password")
    public WebElement passwordField;
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginBtn;

    @FindBy(xpath = "//button[text()='Coding']")
    public WebElement codingBtn;

    @FindBy(xpath = "//button[@class='btn btn-warning badge-pill newbtn']")
    public WebElement enterNewQuestionBtn;

    @FindBy(id= "question")
    public WebElement questionField;

    @FindBy(xpath = "//button[normalize-space()='Enter']")
    public WebElement enterBtn;

    @FindBy(xpath = "//button[@class='btn btn-sm-outline-warning']")
    public WebElement editBtn;

    @FindBy(xpath = "//textarea[@name='newQuestion']")
    public WebElement modifiedQuestionField;

    @FindBy(xpath = "//button[@class='btn btn-sm-outline-success']")
    public WebElement checkmrkBtn;

    @FindBy(xpath = "//p[normalize-space()='My question???']")
    public WebElement modifiedQuestion2;

    @FindBy(xpath = "//button[@class='btn btn-sm-outline-danger ml-1']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//button[text()='All Topics']")
    public WebElement allTopicsBtn;

    @FindBy(xpath = "//div[@class='dashboard-content ']")
    public WebElement allQuestionsList;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchArea;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement searchBtn;

    @FindBy(xpath = "//p[contains(text(),'Java')]")
    public WebElement dashboardContent;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement showAllBtn;

    @FindBy(xpath = "//div[@class='dashboard-content ']")
    public WebElement allQuestionsDashBrd;

    @FindBy(xpath = "//u[normalize-space()='Sign out']")
    public WebElement signOutBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInPage;



    //
    @FindBy(xpath = "//button[text()='Soft skills']")
    public WebElement softSkillsBtn;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchField2;

    @FindBy(xpath = "//div[@class='dashboard-content ']")
    public WebElement dashBrCont;



}
