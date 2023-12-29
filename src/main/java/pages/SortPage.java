package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortPage extends BasePage{
    public SortPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (css = ".sort-products-select")
    private WebElement SortAToZ;

    public void SelectATypeOfSort() { SortAToZ.click();

    }
    @FindBy(css = "option[value=az]")
    private WebElement SelectFirstOption;
    public void selectFirstOptionFromTheList() {
        SelectFirstOption.click();
    }
}
