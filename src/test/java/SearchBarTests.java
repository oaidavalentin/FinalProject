import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SearchBarPage;

public class SearchBarTests extends BasePage {

    private SearchBarPage SearchBarPage;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        SearchBarPage = new SearchBarPage(driver);

    }
    @Test
    public void enterPracticalMessageAndClickOnSearchButton(){
        SearchBarPage.enterTextInSearchField("practical");
        SearchBarPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Practical Wooden Bacon"));


    }

    @Test
    public void enterAwesomeMessageAndClickOnSearchButton(){
        SearchBarPage.enterTextInSearchField("awesome");
        SearchBarPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Granite Chips"));


    }

    @Test
    public void enterSoftMessageAndClickOnSearchButton(){
        SearchBarPage.enterTextInSearchField("Soft");
        SearchBarPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.id("root")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Soft Shirt"));


    }

}
