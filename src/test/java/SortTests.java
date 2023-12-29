import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SearchBarPage;
import pages.SortPage;

public class SortTests extends BasePage {

    private SortPage SortPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        SortPage = new SortPage(driver);

    }
    @Test
    public void SortFromAToZAndSeeTheResult(){
        driver.get("https://fasttrackit-test.netlify.app/#/");
        SortPage.selectFirstOptionFromTheList();
        String actualResult = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Granite Chips"));

    }
}
