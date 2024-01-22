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
    public void EnterDinoUsernameAndThePassword() {
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("dino");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.GetClickOnTheSecondLoginButton();

        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("dino"));
    }

    @Test
    public void EnterBeetleUsernameAndThePassword() {
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("beetle");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.GetClickOnTheSecondLoginButton();

        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("beetle"));
    }

    @Test
    public void EnterTurtleUsernameAndThePassword() {
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("turtle");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.GetClickOnTheSecondLoginButton();

        String actualResult = driver.findElement(By.cssSelector("a[href='#/account']")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("turtle"));
    }


    @Test
    public void EnterAInvalidUsernameAndAValidPassword() {
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("vali");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.GetClickOnTheSecondLoginButton();

        String actualResult = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > p")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Incorrect username or password!"));

    }

    @Test
    public void EnterDinoUsernameAndAInvalidPassword() {
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("dino");
        LoginPage.EnterTextInPasswordField("password");
        LoginPage.GetClickOnTheSecondLoginButton();

        String actualResult = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > p")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Incorrect username or password!"));

    }

    @Test
    public void EnterAInvalidUsernameAndAInvalidPassword() {
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("vali");
        LoginPage.EnterTextInPasswordField("password");
        LoginPage.GetClickOnTheSecondLoginButton();

        String actualResult = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > p")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Incorrect username or password!"));

    }

    @Test
    public void EnterLockedUsernameAndAValidPassword() {
        LoginPage.GetClickOnLoginButton();
        LoginPage.EnterTextInUsernameField("locked");
        LoginPage.EnterTextInPasswordField("choochoo");
        LoginPage.GetClickOnTheSecondLoginButton();

        String actualResult = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > p")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("The user has been locked out."));
    }
}
