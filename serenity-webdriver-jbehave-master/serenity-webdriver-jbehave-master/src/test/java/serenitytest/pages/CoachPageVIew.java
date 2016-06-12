package serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.find;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.findAll;

/**
 * Created by Iuliia on 04.06.2016.
 */

@DefaultUrl("http://skillsup.ua/")

public class CoachPageView extends PageObject {
    private By OurTeam = By.linkText("Наша команда");
    private By AllNames = By.className("name");
    private List CoachList = new ArrayList();


    public void goToTeamPage() {
        find(OurTeam).click();
    }

    public List findAllCoaches() {
        List<WebElementFacade> element = findAll(AllNames);
        for (WebElement i : element) {
            CoachList.add(i.getText());
        }
        return CoachList;
    }
}
