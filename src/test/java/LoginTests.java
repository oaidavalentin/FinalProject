import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.SearchBarPage;

public class LoginTests extends BasePage {

    private LoginPage LoginPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        LoginPage = new LoginPage(driver);

    }
    @Test
    public void EnterAUsernameAndAPassword(){
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("dino");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.GetClickOnTheSecondLoginButton();

        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("dino"));
    }
    @Test
    public void EnterASecondUsernameAndAPassword(){
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("beetle");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.GetClickOnTheSecondLoginButton();

        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("beetle"));
    }

    @Test
    public void EnterAThirdUsernameAndAPassword(){
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("turtle");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.GetClickOnTheSecondLoginButton();

        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("turtle"));
    }


}
