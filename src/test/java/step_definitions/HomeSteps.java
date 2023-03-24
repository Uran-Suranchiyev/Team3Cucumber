package step_definitions;

import io.cucumber.java.en.Given;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps {
    HomePage page;
    public HomeSteps(){
        page = new HomePage();
    }
    @Given("I logIn as user {string} with password {string}")
    public void iLogInAsUserWithPassword(String username, String password) {
        BrowserUtils.sendKeys(page.userNameField, username);
        BrowserUtils.sendKeys(page.passwordField, password);
        BrowserUtils.click(page.loginBtn);
    }
}
