import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SortPage;
import pages.UserPage;

public class UserTests extends BasePage {

    private UserPage UserPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        UserPage = new UserPage(driver);

    }
    @Test
    public void LoginDinoUserAndCheckIfAItemIsAddedToTheCart(){
    UserPage.GetClickOnLoginButton();
    UserPage.EnterTextInUsernameField("dino");
    UserPage.EnterTextInPasswordField("choochoo");
    UserPage.GetClickOnTheSecondLoginButton();
    UserPage.ClickOnAwesomeGraniteChipsCart();
        String actualResult = driver.findElement(By.cssSelector(".shopping_cart_badge")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("1"));
    }
}
