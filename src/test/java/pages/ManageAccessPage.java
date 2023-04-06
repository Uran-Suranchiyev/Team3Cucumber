package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ManageAccessPage {
    public ManageAccessPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(id = "Firstname")
    public WebElement firstname;
    @FindBy(id = "Lastname")
    public WebElement lastname;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "Role")
    public WebElement role;
    @FindBy(id = "Batch")
    public WebElement batch;
}
