package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage extends BasePage {

    public WishListPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg")
    private WebElement WishListAwesomeGraniteChips;

    public void AddAwesomeGraniteChipsToWishList() {
        WishListAwesomeGraniteChips.click();
    }

    @FindBy(css = "#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(2) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg")
    private WebElement WishListAwesomeMetalChair;

    public void AddAwesomeMetalChairToWishList() {
        WishListAwesomeMetalChair.click();
    }
    @FindBy (css = "#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > span")
    private WebElement WishListCartNumber;

}


