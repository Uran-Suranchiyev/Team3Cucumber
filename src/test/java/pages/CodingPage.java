package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class CodingPage {
    public CodingPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(xpath = "//textarea[@id='question']")
    public WebElement newQuestionField;
    @FindBy(xpath = "//button[text()='Enter']")
    public WebElement enterBtnP;
}
