package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#responsive-navbar-nav > div:nth-child(2) > span > span > span > button > svg")
    private WebElement LoginButton;

    public void GetClickOnLoginButton() {
        LoginButton.click();
    }
    @FindBy(id = "user-name")
    private WebElement UserNameField;

    public void EnterTextInUsernameField(String text){
        UserNameField.sendKeys();

    }
    @FindBy(id = "password")
    private WebElement PasswordField;

    public void EnterTextInPasswordField(String text) {
        PasswordField.sendKeys();
    }

    @FindBy(css = "btn btn-primary")
    private WebElement LoginSecondButton;

    public void GetClickOnTheSecondLoginButton() {
        LoginSecondButton.click();
    }

    @FindBy(xpath = "//*[@id=\"responsive-navbar-nav\"]/div[2]/span/span/span/a")
    private WebElement VerifyUsername;


}