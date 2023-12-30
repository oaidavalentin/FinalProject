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
}
