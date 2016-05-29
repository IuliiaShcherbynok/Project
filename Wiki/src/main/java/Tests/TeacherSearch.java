package Tests;

import Pages.CoachPageView;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iuliia on 18.04.2016.
 */
public class TeacherSearch extends BaseTest {
//    private String url = "http://skillsup.ua/about/our-team.aspx";
//    private By Chokan = By.xpath("//span[contains(.,'Михаил Чокан')]");
//    private By Bokhan = By.xpath("//span[contains(.,'Евгения Бохан')]");
//    private By Karpov = By.xpath("//span[contains(.,'Артем Карпов')]");

    private CoachPageView CoachPageView;
    private String Chokan = "Михаил Чокан";
    private String Bokhan = "Евгения Бохан";
    private String Karpov = "Артем Карпов";

    @Test
    public void testSearchChokan() {
        CoachPageView = new CoachPageView(driver);
        CoachPageView.goToTeamPage();
        assertTrue("No such teacher", CoachPageView.findAllCoaches().contains(Chokan));
    }

    @Test
    public void testSearchBokhan() {
        CoachPageView = new CoachPageView(driver);
        CoachPageView.goToTeamPage();
        assertTrue("No such teacher", CoachPageView.findAllCoaches().contains(Bokhan));
    }

    @Test
    public void testSearchKarpov() {
        CoachPageView = new CoachPageView(driver);
        CoachPageView.goToTeamPage();
        assertFalse("No such teacher", CoachPageView.findAllCoaches().contains(Karpov));
    }
}
/*

    private String findCoaches () {
        List<WebElement> element = driver.findElements(path);
        String name="";
        for (WebElement i: element)
            name= name+i.getText()+" ";
        return name;
    }

    @Test
    public void testSearchChokan() throws Exception {
        CoachPageView.goToTeamPage();

        assertEquals("No such teacher", "Михаил Чокан", CoachPageView.linkToChokan.getText());
    }

    @Test
    public void testSearchBokhan() throws Exception {
      //  driver.get(coachPageView.url);
        CoachPageView.goToTeamPage();
        assertEquals("No such teacher", "Евгения Бохан", CoachPageView.getBokhanName());
    }

    public void test1() {
        CoachPageView.goToTeamPage();
        System.out.println(CoachPageView.getBokhanName());
    }

    @Test
    public void testSearchKarpov() throws Exception {
        driver.get(coachPageView.url);
        try {
            coachPageView.linkToKarpov.getText();
        } catch (NoSuchElementException e) {
            System.out.println("Artem Karpov is absent on the page");
        }
    }

}
*/