package pages;

import base.Base;
import base.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends Base {

    WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.ID,using="email")
    private WebElement username;

    // Locator for Password field
    @FindBy(how=How.ID,using="pass")
    private WebElement password;

    // Locator for SignIn Button
    @FindBy(how=How.ID,using="loginbutton")
    private WebElement signInButton;

    @FindBy(how=How.ID,using="loginbutton")
    private List<WebElement> carList;


    public HomePage login(){

        username.sendKeys("faruk");
        DriverContext.WaitForElementVisible(username);
        password.sendKeys("akyol");
        signInButton.click();

        return new HomePage();
    }

}
