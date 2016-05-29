package serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iuliia on 17.05.2016.
 */

@DefaultUrl("http://skillsup.ua/")
public class SkillsUpPage extends PageObject{

    private By linkourteam = By.linkText("Наша команда");
    private By memberclass = By.className("name");

    public void goToCoachPage(){
        WebElement goToCoachPage = find(linkourteam);
        goToCoachPage.click();
    }

    public List<String> findCoachNmae (){
        List<WebElementFacade> listmembers = findAll(memberclass);
        List<String> stringsNames = new ArrayList<String>();
        for (WebElement i: listmembers){
            stringsNames.add (i.getText());
        }
       // stringsNames.stream().map(WebElement::getText).collect(toList());
        return stringsNames;
    }

}
