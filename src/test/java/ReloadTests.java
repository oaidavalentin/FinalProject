import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.ReloadPage;

public class ReloadTests extends BasePage {

    private ReloadPage ReloadPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        ReloadPage = new ReloadPage(driver);

    }
    @Test
    public void ClickOnReloadPageAfterLoginDinoUserAndCheckTheResult(){
        ReloadPage.GetClickOnLoginButton();
        ReloadPage.EnterTextInUsernameField("dino");
        ReloadPage.EnterTextInPasswordField("choochoo");
        ReloadPage.GetClickOnTheSecondLoginButton();
        ReloadPage.ClickOnReloadButton();
        String actualResult = driver.findElement(By.xpath("//*[@id=\"responsive-navbar-nav\"]/div[2]/span/span/span/text()")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("dino"));
    }
}
