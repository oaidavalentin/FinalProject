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
    public void enterAMessageAndClickOnSearchButton(){
        driver.get("https://fasttrackit-test.netlify.app/#/");
        SearchBarPage.enterTextInSearchField("practical");
        SearchBarPage.GetClickOnSearchButton();
        String actualResult = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Practical"));


    }

}
