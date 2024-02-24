import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.OrderPage;

public class OrderTests extends BasePage {
    private OrderPage OrderPage;

    private final By AwesomeGraniteChipsLink = By.linkText("Awesome Granite Chips");

    private final By AwesomeMetalChairLink = By.linkText("Awesome Metal Chair");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        OrderPage = new OrderPage(driver);

    }
    @Test
    public void AddAProductAndCompleteTheOrder(){
        OrderPage.ClickOnAwesomeGraniteChipsCart();
        OrderPage.ClickOnShoppingCart();
        OrderPage.ClickOnCheckoutButton();
        OrderPage.EnterNameInFirstNameField("Oaida");
        OrderPage.EnterNameInLastNameField("Valentin Nicolae");
        OrderPage.EnterAddressInAddressField("Street Vai nr 7");
        OrderPage.ClickOnContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddAProductInDinoUserAndCompleteTheOrder() {
        OrderPage.GetClickOnLoginButton();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.GetClickOnTheSecondLoginButton();
        OrderPage.ClickOnAwesomeGraniteChipsCart();
        OrderPage.ClickOnShoppingCart();
        OrderPage.ClickOnCheckoutButton();
        OrderPage.EnterNameInFirstNameField("Valentin");
        OrderPage.EnterNameInLastNameField("Nicolae");
        OrderPage.EnterAddressInAddressField("Lupsa");
        OrderPage.ClickOnCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }

    @Test
    public void AddAProductTheCartInDinoUserThenGoToTheShoppingCartAndAddAnotherProductAfterPressTheButtonContinueShoppingAndCompleteTheOrder(){
        OrderPage.GetClickOnLoginButton();
        OrderPage.EnterTextInUsernameField("dino");
        OrderPage.EnterTextInPasswordField("choochoo");
        OrderPage.GetClickOnTheSecondLoginButton();
        OrderPage.ClickOnAwesomeGraniteChipsCart();
        OrderPage.ClickOnShoppingCart();
        OrderPage.GetClickOnContinueShoppingButton();
        OrderPage.ClickOnPracticalMetalMouseCart();
        OrderPage.ClickOnShoppingCart();
        OrderPage.ClickOnCheckoutButton();
        OrderPage.EnterNameInFirstNameField("Oaida");
        OrderPage.EnterNameInLastNameField("Valentin");
        OrderPage.EnterAddressInAddressField("Strada Vai nr 7");
        OrderPage.ClickOnContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));

    }

    @Test
    public void AddTwoProductsEnteringOnTheirPageAndCompleteTheOrder() {
        driver.findElement(AwesomeGraniteChipsLink).click();
        OrderPage.GetClickOnAwesomeGraniteChipsCartInTheProductPage();
        OrderPage.ClickOnShoppingCart();
        OrderPage.ClickOnThePlusButton();
        OrderPage.GetClickOnContinueShoppingButton();
        driver.findElement(AwesomeMetalChairLink).click();
        OrderPage.GetClickOnAwesomeMetalChairCartInTheProductPage();
        OrderPage.ClickOnShoppingCart();
        OrderPage.ClickOnCheckoutButtonForNewTests();
        OrderPage.EnterNameInFirstNameField("Oaida");
        OrderPage.EnterNameInLastNameField("Valentin Nicolae");
        OrderPage.EnterAddressInAddressField("Strada Vai,nr. 7");
        OrderPage.ClickOnContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));


    }
}
