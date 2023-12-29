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
        SortPage.selectFirstOptionFromTheList();
        String actualResult = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Granite Chips"));

    }

    @Test
    public void SortFromZToAAndSeeTheResult(){
        SortPage.selectSecondOptionFromTheList();
        String actualResult = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Refined Frozen Mouse"));

    }

    @Test
    public void SortFromHighToLowAndSeeTheResult(){
        SortPage.selectFourthOptionFromTheList();
        String actualResult = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Awesome Soft Shirt"));

    }
    @Test
    public void SortFromLowToHighAndSeeTheResult(){
        SortPage.selectThirdOptionFromTheList();
        String actualResult = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Practical Wooden Bacon"));

    }

}
