package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iuliia on 15.05.2016.
 */
public class GetPointsByName extends BaseTest {
    private String TestPage = "http://www.w3schools.com/html/html_tables.asp";
    public By Table = By.xpath(".//table[@class='w3-table-all']//tr[position()>1]");
    /*private By Rows = By.xpath(".//*[@id='main']/table[1]//tr");
    private By Id = By.xpath(".//*[@id='main']/table[1]//td[1]");
    */
    private By FirstName = By.xpath("td[2]");
    private By LastName = By.xpath("td[3]");
    private By Points = By.xpath("td[4]");

    public String name = "John";
    //private List RowContent = new ArrayList();


    @Test
    public void testGetPointsByName() {
        driver.get(TestPage);
        System.out.println("Points for " + name + " - " + RowContent(name).findElement(Points).getText());
    }

    private WebElement RowContent(String name) {
        List<WebElement> rows = driver.findElements(Table);
        WebElement Row = null;
        for (WebElement currentRow : rows) {
            if (currentRow.findElement(FirstName).getText().equals(name)) {
                Row = currentRow;
                break;
            }
        }
        return Row;
    }
}




    /*
    public void testResultsAreDisplayed() {
        driver.get(TestPage);
        System.out.println(getRowByPersonName("Adam"));

    }
    public void getRowByPersonName(String name){
        List <WebElement> rows = driver.findElements(Rows);
        System.out.println(rows.get(3).findElement(FirstName).getText().equals(name));
    }
*/


/*
    public List getString(){
        driver.get(TestPage);

    }
    /*
    public WebElement getRowsByPersonName(String name){
        String locator = ".//*[@id='main']/table[1]//tr[3]";
        int size = driver.findElements(Rows).size();
        for (int i=1; i<size; i++) {
            locator = ".//*[@id='main']/table[1]//tr["+i+"]";
            WebElement row = driver.findElement(By.xpath(locator));
            if (row.findElement(FirstName).getText().contains(name)){
                return row;
            }
        }

    }


    public List findAllRows() {
        List<WebElement> element = driver.findElements(Rows);
        String RowContent="";
        for (WebElement i : element) {
            RowContent= RowContent+i.getText()+" ";
            //RowContent.add(i.getText());
        }
        return RowContent;
    }


*/

