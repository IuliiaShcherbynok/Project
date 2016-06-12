package serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Iuliia on 11.06.2016.
 */
public class SearchResults extends PageObject {

    private By field = By.id("u5016-2");
    private By Table = By.className("xsltsearch_result");
    private By NameList = By.className("xsltsearch_title");
    private By DescriptionList = By.className("xsltsearch_description");

    public void putInput(String input) {
        find(field).sendKeys(input + Keys.ENTER);
    }


    public WebElement findDescription(String input) {
        List<WebElementFacade> element = findAll(Table);
        WebElement Description = null;
        for (WebElement currentDescription : element) {
            if (currentDescription.findElement(NameList).getText().contains(input) || currentDescription.findElement(DescriptionList).getText().contains(input)) {
                Description = currentDescription;
                break;
            }
        }
        return Description;
    }


}
