package serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
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


    protected static WebDriver driver = new FirefoxDriver();
    //private String HomePage = "http://skillsup.ua/";
    private By AllNames = By.className("name");
    public By Header = By.className("greenHeader");
    public By Course = By.xpath("//div[@class='text']/p[1]");


/*    public PersonalCoachPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }*/

    public void goToPersonalCoachPage(String name) {
        List<WebElement> webElements = driver.findElements(AllNames);
        for (WebElement webElement : webElements) {
            if (webElement.getText().contains(name)) {
                webElement.click();
                break;
            }
        }
    }

    public String checkTeacherName(String name) {
        goToPersonalCoachPage(name);
        return driver.findElement(Header).getText();
    }

    public String checkTeacherCourse(String name) {
        goToPersonalCoachPage(name);
        return driver.findElement(Course).getText();

    }

}
