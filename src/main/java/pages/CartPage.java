package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg")
    private WebElement AwesomeGraniteChipsCart;

    public void ClickOnAwesomeGraniteChipsCart(){
        AwesomeGraniteChipsCart.click();
    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(2) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg")
    private WebElement AwesomeMetalChairCart;

    public void ClickOnAwesomeMetalChairCart(){
        AwesomeMetalChairCart.click();
    }

    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(5) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg")
    private WebElement IncredibleConcreteHatCart;

    public void ClickOnIncredibleConcreteHatCart() {
        IncredibleConcreteHatCart.click();
    }
    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(6) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement LicensedSteelGlovesCart;
    public void ClickOnLicenseSteelGlovesCart() {
        LicensedSteelGlovesCart.click();
    }
    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(7) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement PracticalMetalMouseCart;
    public void ClickOnPracticalMetalMouseCart() {
        PracticalMetalMouseCart.click();
    }
    @FindBy (css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(8) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement PracticalWoodenBaconCart;
    public void ClickOnPracticalWoodenBaconCart() {
        PracticalWoodenBaconCart.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(3) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement AwesomeSoftShirt;
    public void ClickOnAwesomeSoftShirtCart() {
        AwesomeSoftShirt.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(4) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement GorgeousSoftPizza;

    public void ClickOnGorgeousSoftPizzaCart() {
        GorgeousSoftPizza.click();
    }
    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(9) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement SecondPracticalWoodenBacon;

    public void ClickOnSecondPracticalWoodenBaconCart() {
        SecondPracticalWoodenBacon.click();
    }
    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(10) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")
    private WebElement RefinedFrozenMouse;

    public void ClickOnRefinedFrozenMouseCart() {
        RefinedFrozenMouse.click();
    }


    @FindBy (css = ".fa-shopping-cart")
    private WebElement ShoppingCart;
    public void ClickOnShoppingCart() {
        ShoppingCart.click();
    }



    @FindBy (css = ".shopping_cart_badge")
    private WebElement ShoppingCartNumber;

    public void ClickOnShoppingCartBadge() {
        ShoppingCartNumber.click();
    }
    @FindBy (css = ".fa-plus-circle")
    private WebElement PlusButton;

    public void ClickOnThePlusButton() {
        PlusButton.click();
    }
    @FindBy (css = ".fa-minus-circle")
    private WebElement MinusButton;

    public void ClickOnTheMinusButton() {
        MinusButton.click();
    }
    @FindBy (css = ".fa-trash")
    private WebElement DeleteButton;

    public void ClickOnDeleteButton() {
        DeleteButton.click();
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

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")

     private WebElement AwesomeGraniteChipsLinkText;

    public void GetClickOnAwesomeGraniteChipsLinkText() {
        AwesomeGraniteChipsLinkText.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div > div.col.col-lg-2.text-center.col > button:nth-child(2) > svg")

    private WebElement AwesomeGraniteChipsCartAfterClickOnLinkText;

    public void ClickOnAwesomeGraniteChipsCartInNewPage() {
        AwesomeGraniteChipsCartAfterClickOnLinkText.click();
    }



}
