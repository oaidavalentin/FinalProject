import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.OrderPage;

public class OrderTests extends BasePage {
    private OrderPage OrderPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        OrderPage = new OrderPage(driver);

    }
    @Test
    public void AddAProductAndCompleteOrder(){
        OrderPage.ClickOnAwesomeGraniteChipsCart();
        OrderPage.ClickOnShoppingCart();
        OrderPage.ClickOnCheckoutButton();
        OrderPage.EnterNameInFirstNameField("Oaida");
        OrderPage.EnterNameInLastNameField("Valentin Nicolae");
        OrderPage.EnterAddressInAddressField("Street Vai nr 7");
        OrderPage.ClickOnContinueCheckoutButton();
        OrderPage.ClickOnCompleteYourOrderButton();
        String actualResult = driver.findElement(By.cssSelector(".text-center")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));
    }
}
