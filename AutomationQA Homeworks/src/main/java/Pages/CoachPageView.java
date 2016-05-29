package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iuliia on 19.04.2016.
 */
public class CoachPageView {
    protected static WebDriver driver = new FirefoxDriver();
    private String HomePage = "http://skillsup.ua/";
    private By OurTeam = By.linkText("Наша команда");
    private By AllNames = By.className("name");
    private List CoachList = new ArrayList();


    public CoachPageView(WebDriver driver) {
        this.driver = driver;
        driver.get(HomePage);
        PageFactory.initElements(driver, this);
    }

    public void goToTeamPage() {
        driver.findElement(OurTeam).click();
    }

    public List findAllCoaches() {
        List<WebElement> element = driver.findElements(AllNames);
        for (WebElement i : element) {
            CoachList.add(i.getText());
        }
        return CoachList;
    }
}
