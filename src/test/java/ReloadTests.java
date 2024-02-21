import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.ReloadPage;

import java.time.Duration;

public class ReloadTests extends BasePage {
    private ReloadPage ReloadPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        ReloadPage = new ReloadPage(driver);

    }
    @Test //The user should be dino after reloading page but actual result is Hello Guest
    public void LoginUserDinoClickOnReloadPageAndCheckIfTheUserIsStillLogged()
    {
        ReloadPage.GetClickOnLoginButton();
        ReloadPage.EnterTextInUsernameField("dino");
        ReloadPage.EnterTextInPasswordField("choochoo");
        ReloadPage.GetClickOnTheSecondLoginButton();
        Duration timeout = Duration.ofSeconds(10);
        WebDriverWait wait= new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions. elementToBeClickable (By.xpath("/html/body/div/div/div[3]/nav/div/div/div[2]/button")));
        ReloadPage.ClickOnReloadButton();
        String actualResult = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Hello guest!"));
    }

    @Test  // The Product should be still added after reloading page but the test fails
    public void AddAProductToCartAndThenClickOnReloadPageAndCheckIfTheProductIsStillAdded() {
        ReloadPage.ClickOnAwesomeGraniteChipsCart();
        ReloadPage.ClickOnReloadButton();
        ReloadPage.ClickOnShoppingCart();
        String actualResult = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div.text-center.container")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("How about adding some products in your cart?"));
    }
}
