import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CartPage;
import pages.SortPage;

public class CartTests extends BasePage {
    private CartPage CartPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        CartPage = new CartPage(driver);

    }
    @Test
    public void CheckIfTheFirstTwoItemsWereAdded(){
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeMetalChairCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("2"));

    }
    @Test
    public void CheckIfFourItemsWereAdded() {
        CartPage.ClickOnIncredibleConcreteHatCart();
        CartPage.ClickOnLicenseSteelGlovesCart();
        CartPage.ClickOnPracticalMetalMouseCart();
        CartPage.ClickOnPracticalWoodenBaconCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("4"));
    }

    @Test
    public void CheckIfProductWereAddedAfterWeClickOnPlusButton(){
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnShoppingCartBadge();
        CartPage.ClickOnThePlusButton();
        CartPage.ClickOnThePlusButton();
        CartPage.ClickOnThePlusButton();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("5"));
    }
    @Test
    public void CheckIfProductWereDeletedAfterWeClickOnMinusButton(){
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnShoppingCartBadge();
        CartPage.ClickOnTheMinusButton();
        CartPage.ClickOnTheMinusButton();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("2"));
    }
    @Test
    public void CheckIfProductWereDeletedAfterWeClickOnDeleteButton() {
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnShoppingCartBadge();
        CartPage.ClickOnDeleteButton();
        String actualResult = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div.text-center.container")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("How about adding some products in your cart?"));
    }

    @Test
    public void CheckIfTheMessageIsCorrectWhenIsNoProductAddedToTheCart() {
        CartPage.ClickOnShoppingCart();
        String actualResult = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div.text-center.container")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("How about adding some products in your cart?"));
    }
    @Test
    public void CheckIfAllItemsWereAdded() {
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeMetalChairCart();
        CartPage.ClickOnAwesomeSoftShirtCart();
        CartPage.ClickOnGorgeousSoftPizzaCart();
        CartPage.ClickOnIncredibleConcreteHatCart();
        CartPage.ClickOnLicenseSteelGlovesCart();
        CartPage.ClickOnPracticalMetalMouseCart();
        CartPage.ClickOnPracticalWoodenBaconCart();
        CartPage.ClickOnSecondPracticalWoodenBaconCart();
        CartPage.ClickOnRefinedFrozenMouseCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("10"));
    }

    @Test // The products are not added to the cart in beetle user (bug)
    public void LoginBeetleUserAndAddTwoItemsToTheCartAndCheckIfThereWereAdded() {
        CartPage.GetClickOnLoginButton();
        CartPage.EnterTextInUsernameField("beetle");
        CartPage.EnterTextInPasswordField("choochoo");
        CartPage.GetClickOnTheSecondLoginButton();
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeMetalChairCart();
        CartPage.ClickOnShoppingCart();
        String actualResult = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div.text-center.container")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("How about adding some products in your cart?"));
    }

    @Test
    public void LoginTurtleUserAndAddTwoItemsToTheCartAndCheckTheResult() {
        CartPage.GetClickOnLoginButton();
        CartPage.EnterTextInUsernameField("turtle");
        CartPage.EnterTextInPasswordField("choochoo");
        CartPage.GetClickOnTheSecondLoginButton();
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnAwesomeMetalChairCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("2"));

    }

    @Test
    public void ChickOnTheFirstProductInDinoUserAndAddToTheCartListAndCheckTheResult() {
        CartPage.GetClickOnLoginButton();
        CartPage.EnterTextInUsernameField("dino");
        CartPage.EnterTextInPasswordField("choochoo");
        CartPage.GetClickOnTheSecondLoginButton();
        CartPage.GetClickOnAwesomeGraniteChipsLinkText();
        CartPage.ClickOnAwesomeGraniteChipsCartInNewPage();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));

    }

    @Test
    public void AddTwoProductsAtTheCartAndLoginDinoUserAndCheckIfThereWereAddedAfterLogin() {
        CartPage.ClickOnAwesomeGraniteChipsCart();
        CartPage.ClickOnRefinedFrozenMouseCart();
        CartPage.GetClickOnLoginButton();
        CartPage.EnterTextInUsernameField("dino");
        CartPage.EnterTextInPasswordField("choochoo");
        CartPage.GetClickOnTheSecondLoginButton();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("2"));

    }

}
