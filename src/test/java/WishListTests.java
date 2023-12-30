import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SortPage;
import pages.WishListPage;

public class WishListTests extends BasePage {

    private WishListPage WishListPage;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        WishListPage = new WishListPage(driver);

    }
    @Test
    public void CheckIfTheFirstTwoItemsWereAddedToWishList(){
    WishListPage.AddAwesomeGraniteChipsToWishList();
    WishListPage.AddAwesomeMetalChairToWishList();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("2"));
    }
}
