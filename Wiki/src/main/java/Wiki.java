import junit.framework.TestCase;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Iuliia
 */
public class Wiki extends TestCase {
    private static WebDriver driver = new FirefoxDriver();
    private By input = By.id("searchInput");
    private By heading = By.id("firstHeading");

    @BeforeClass
    public void openBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void setUp() throws Exception {
        driver.get("https://en.wikipedia.org");
    }

  @Test

    public void testSearchResultsAreDisplayed() throws Exception {
        WebElement searchInput = driver.findElement(input);
        searchInput.sendKeys("Ballroom");
        searchInput.submit();
        assertTrue("Wrong page", driver.getTitle().contains("Ballroom"));

        WebElement headingVerify = driver.findElement(heading);
        assertEquals("Wrong heading", "Ballroom", headingVerify.getText());
         }
    @Test

    public void testSearchLondon() throws Exception {
        WebElement searchInput = driver.findElement(input);
        searchInput.sendKeys("London");
        searchInput.submit();
     //   WebDriverWait wait = new WebDriverWait(driver,15);
        assertEquals("Wrong page", "London - Wikipedia, the free encyclopedia", driver.getTitle());
        WebElement headingVerify = driver.findElement(heading);
        assertTrue("Wrong heading", headingVerify.getText().contains("London"));
    }


    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
    }