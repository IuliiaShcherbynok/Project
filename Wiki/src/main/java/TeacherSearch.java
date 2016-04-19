import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

/**
 * Created by Iuliia on 18.04.2016.
 */
public class TeacherSearch extends BaseTest {
    private String url = "http://skillsup.ua/about/our-team.aspx";
    //private By Chokan = By.xpath("//img[@src='/media/22166/Michael-Chokan_P.jpg']");
    private By Chokan = By.xpath("//span[contains(.,'Михаил Чокан')]");
    private By Bokhan = By.xpath("//span[contains(.,'Евгения Бохан')]");
    private By Karpov = By.xpath("//span[contains(.,'Артем Карпов')]");

    @Test
    public void testSearchChokan() throws Exception {
        driver.get(url);
        WebElement linkToChokan = driver.findElement(Chokan);
        assertEquals("No such teacher", "Михаил Чокан", linkToChokan.getText());
    }

    @Test
    public void testSearchBokhan() throws Exception {
        driver.get(url);
        WebElement linkToBokhan = driver.findElement(Bokhan);
        assertEquals("No such teacher", "Евгения Бохан", linkToBokhan.getText());
    }

    @Test
    public void testSearchKarpov() throws Exception {
        driver.get(url);
        try {
            WebElement linkToKarpov = driver.findElement(Karpov);
        } catch (NoSuchElementException e) {
            System.out.println("Artem Karpov is absent on the page");
        }
    }

}
