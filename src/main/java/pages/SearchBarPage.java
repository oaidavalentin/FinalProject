package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBarPage extends BasePage{

    public SearchBarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (id = "input-search" )
    private WebElement searchField;
    public void enterTextInSearchField(String text) {
        searchField.sendKeys(text);
    }
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/form/div[1]/button")
    private WebElement clickOnSearchButton;
    public void GetClickOnSearchButton() {
        clickOnSearchButton.click();
    }


}
