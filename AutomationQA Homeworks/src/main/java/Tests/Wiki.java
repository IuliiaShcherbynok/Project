package Tests;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/**
 * Created by Iuliia
 */
public class Wiki extends BaseTest {
    private By input = By.id("searchInput");
    private By heading = By.id("firstHeading");
    private String url = "https://en.wikipedia.org";
    private WebElement searchInput = driver.findElement(input);


    public void testSearchResultsAreDisplayed() throws Exception {
        driver.get(url);
        //  WebElement searchInput = driver.findElement(input);
        searchInput.sendKeys("Ballroom" + Keys.ENTER);
        //searchInput.submit();
        assertTrue("Wrong page", driver.getTitle().contains("Ballroom"));

        WebElement headingVerify = driver.findElement(heading);
        assertEquals("Wrong heading", "Ballroom", headingVerify.getText());
    }

    public void testSearchLondon() throws Exception {
        driver.get(url);
        //   WebElement searchInput = driver.findElement(input);
        searchInput.sendKeys("London \n");
        //   searchInput.submit();
        assertEquals("Wrong page", "London - Wikipedia, the free encyclopedia", driver.getTitle());
        WebElement headingVerify = driver.findElement(heading);
        assertTrue("Wrong heading", headingVerify.getText().contains("London"));
    }


}