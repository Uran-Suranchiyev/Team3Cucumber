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
    @FindBy(linkText="All Topics")
    public WebElement allTopicsBtn;
    @FindBy(xpath = "//button[text()='Coding']")
    public WebElement codingBtn;
    @FindBy(xpath = "//button[text()='Soft skills']")
    public WebElement softSkillsBtn;
    @FindBy(id ="inputArea1")
    public WebElement yourInputDo;
    @FindBy(id ="inputArea2")
    public WebElement yourInputDont;
    @FindBy(xpath = "//div[@class='dodont']//div[2]//form[1]//button[1]")
    public WebElement enterBtn;
    @FindBy(xpath = "//button[@class='btn btn-warning badge-pill newbtn']")
    public WebElement enterNewQuestionBtn;

    @FindBy(xpath = "//button[text()='Enter new question ']")
    public WebElement enterQuestionBtn;

    @FindBy(xpath = "//button[text()='Enter']")
    public WebElement enterBtnP;
    @FindBy(xpath = "//a//p")
    public List<WebElement> questions;
    @FindBy(xpath = "//u[text()='Manage Access']")
    public WebElement manageAccessBtn;
    @FindBy(xpath = "//input[@placeholder='New dashboard']")
    public WebElement newDashboardField;
    @FindBy(xpath = "//button[normalize-space()='+ Add']")
    public WebElement newDashboardAddBtn;
    @FindBy(xpath = "//u[normalize-space()='Sign out']")
    public WebElement signOutBtn;
    @FindBy(xpath = "//button[text()='Add do ']")
    public WebElement addDoBtn;
    @FindBy(xpath = "//div[@class='col-md-3 dont']//button")
    public WebElement addDontBtn;
    @FindBy(id = "inputArea1")
    public WebElement doInputField;
    @FindBy(id = "inputArea2")
    public WebElement dontInputField;
    @FindBy(xpath = "//div[@class='dodont']//div[2]//form[1]//button[1]")
    public WebElement dontEnterBtn;
    @FindBy(xpath = "//button[normalize-space()='Enter']")
    public WebElement doEnterBtn;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]//button[@class='btn btn-outline-danger ml-1']")
    public WebElement firstDoDeleteBtn;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]//button[@class='btn btn-sm-outline-warning']")
    public WebElement firstDoEditBtn;
    @FindBy(xpath = "//textarea[@name='newText']")
    public WebElement firstDoEditField;
    @FindBy(xpath = "//button[@class='btn btn-sm-outline-success']//*[name()='svg']")
    public WebElement editDoAcceptBtn;
    @FindBy(xpath = "//body/div[@id='root']/div/div[@class='content']/div[@class='dodont']/div[@class='row DoAndDontsContent']/div[2]//button[@class='btn btn-outline-danger ml-1']")
    public WebElement firstDontDeleteBtn;
    @FindBy(xpath = "//body/div[@id='root']/div/div[@class='content']/div[@class='dodont']/div[@class='row DoAndDontsContent']/div[2]//button[@class='btn btn-sm-outline-warning']")
    public WebElement firstDontEditBtn;
    @FindBy(xpath = "//textarea[@name='newText']")
    public WebElement firstDontEditField;
    @FindBy(xpath = "//button[@class='btn btn-sm-outline-success']")
    public WebElement editDontAcceptBtn;
