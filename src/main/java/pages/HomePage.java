package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
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
        UserNameField.sendKeys(text);

    }
    @FindBy(id = "password")
    private WebElement PasswordField;

    public void EnterTextInPasswordField(String text) {

        PasswordField.sendKeys(text);
    }

    @FindBy(css = ".btn-primary")
    private WebElement LoginSecondButton;

    public void GetClickOnTheSecondLoginButton() {
        LoginSecondButton.click();
    }

    @FindBy(id = "responsive-navbar-nav")
    private WebElement CheckTheNameOfTheUser;

    @FindBy(css = ".fa-shopping-bag")
    private WebElement HomeButton;

    public void ClickOnHomeButton(){
        HomeButton.click();
   }
}
