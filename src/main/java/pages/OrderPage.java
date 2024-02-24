package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BasePage{
    public OrderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg")
    private WebElement AwesomeGraniteChipsCart;

    public void ClickOnAwesomeGraniteChipsCart(){
        AwesomeGraniteChipsCart.click();
    }

    @FindBy (css = ".fa-shopping-cart")
    private WebElement ShoppingCart;
    public void ClickOnShoppingCart() {
        ShoppingCart.click();
    }
    @FindBy(css = ".btn-success")
    private WebElement CheckoutButton;
    public void ClickOnCheckoutButton() {
        CheckoutButton.click();
    }

    @FindBy(id = "first-name")
    private WebElement FirstNameField;
    public void EnterNameInFirstNameField(String text) {
        FirstNameField.sendKeys(text);
    }
    @FindBy(id = "last-name")
    private WebElement LastNameField;
    public void EnterNameInLastNameField(String text) {
        LastNameField.sendKeys(text);
    }

    @FindBy(xpath = "//*[@id=\"address\"]")
    private WebElement AddressField;

    public void EnterAddressInAddressField(String text) {
        AddressField.sendKeys(text);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/form/div/div[2]/button")
    private WebElement ContinueCheckoutButton;

    public void ClickOnContinueCheckoutButton() {
        ContinueCheckoutButton.click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/a[2]")
    private WebElement CompleteYourOrderButton;

    public void ClickOnCompleteYourOrderButton() {
        CompleteYourOrderButton.click();
    }

    @FindBy(css = ".text-center")
    private WebElement MessageForCompletedOrder;

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

    @FindBy(css = ".btn-danger")
    private WebElement ContinueShoppingButton;

    public void GetClickOnContinueShoppingButton() {
        ContinueShoppingButton.click();
    }
    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(7) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement PracticalMetalMouseCart;
    public void ClickOnPracticalMetalMouseCart() {
        PracticalMetalMouseCart.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div > div.col.col-lg-2.text-center.col > button:nth-child(2) > svg")
    private WebElement AwesomeGraniteChipsCartInTheProductPage;

    public void GetClickOnAwesomeGraniteChipsCartInTheProductPage() {
        AwesomeGraniteChipsCartInTheProductPage.click();
    }
    @FindBy (css = ".fa-plus-circle")
    private WebElement PlusButton;

    public void ClickOnThePlusButton() {
        PlusButton.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div > div.col.col-lg-2.text-center.col > button:nth-child(2) > svg")
    private WebElement AwesomeMetalChairCartInTheProductPage;

    public void GetClickOnAwesomeMetalChairCartInTheProductPage() {
        AwesomeMetalChairCartInTheProductPage.click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/a[2]")
    private WebElement CheckoutButtonForNewTests;

    public void ClickOnCheckoutButtonForNewTests() {
        CheckoutButtonForNewTests.click();
    }

}