package serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Iuliia on 31.05.2016.
 */

@DefaultUrl("http://skillsup.ua/about/our-team.aspx")

public class PersonalCoachPage extends PageObject {

    private By AllNames = By.className("name");
    public By Header = By.className("greenHeader");
    public By Course = By.xpath("//div[@class='text']/p[1]");


    public void goToPersonalCoachPage(String name) {
        List<WebElementFacade> webElements = findAll(AllNames);
        for (WebElement webElement : webElements) {
            if (webElement.getText().contains(name)) {
                webElement.click();
                break;
            }
        }
    }

    public String checkTeacherName(String name) {
        goToPersonalCoachPage(name);
        return find(Header).getText();
    }

    public String checkTeacherCourse(String name) {
        goToPersonalCoachPage(name);
        return find(Course).getText();

    }

}
