import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.WishListAndCartPage;
import pages.WishListPage;

public class WishListAndCartPageTests extends BasePage {

    private WishListAndCartPage WishListAndCartPage;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        WishListAndCartPage = new WishListAndCartPage(driver);

    }
    @Test
    public void CheckIfSameProductIsAddedToCartAndWishListPage(){
        WishListAndCartPage.ClickOnAwesomeGraniteChipsToCart();
        WishListAndCartPage.AddAwesomeGraniteChipsToTheWishList();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
        String actualResult2 = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult2);
        Assert.assertTrue(actualResult2.contains("1"));
    }
}
