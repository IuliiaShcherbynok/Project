package serenitytest.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


/**
 * Created by Iuliia on 11.06.2016.
 */
public class TrainingPage extends PageObject {

    private By Education = By.id("menu1078");
    private By Text = By.className("text");

    public void goToTrainingPage() {
        Actions mouse = new Actions(getDriver());

        mouse.moveToElement(find(Education)).moveToElement(find(By.xpath("//a[contains(.,'Тренинги')]"))).moveToElement(find(By.xpath("//a[contains(.,'Путь лидера')]"))).click().build().perform();
    }

    public String getDescription(){
        return find(Text).getText();

    }

}
