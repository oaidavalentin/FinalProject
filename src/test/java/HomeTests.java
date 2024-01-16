import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;

public class HomeTests extends BasePage {

    private HomePage HomePage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        HomePage = new HomePage(driver);

    }
    @Test
    public void ClickOnReloadPageAfterLoginDinoUserAndCheckTheResult(){
        HomePage.GetClickOnLoginButton();
        HomePage.EnterTextInUsernameField("dino");
        HomePage.EnterTextInPasswordField("choochoo");
        HomePage.GetClickOnTheSecondLoginButton();
        HomePage.ClickOnHomeButton();
        String actualResult = driver.findElement(By.id("responsive-navbar-nav")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("dino"));
    }
}
