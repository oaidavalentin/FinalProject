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
}
