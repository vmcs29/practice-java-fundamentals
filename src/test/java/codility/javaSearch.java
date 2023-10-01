package codility;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class javaSearch {

    String url = "https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html";
    WebDriver driver ;
    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.get(url);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

   @Test
    public void verifyLoginPageTitle() {
        String title = driver.getTitle();
        assertEquals( "ARR", title);
    }


    @Test
    public void verifyElementsAreVisible(){
        String queryInput = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("id");
        String submitButton = driver.findElement(By.xpath("//button[@type='button']")).getAttribute("id");
        assertEquals("search-input",queryInput);
        assertEquals("search-button",submitButton);

    }

    @Test
    public void verifyEmptySearch(){
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        String errorMessage = driver.findElement(By.xpath("//div[@id='error-empty-query']")).getAttribute("id");
        assertEquals("error-empty-query",errorMessage);
    }

    @Test
    public void verifySearchResults(){
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("port");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        int resultsCount = driver.findElements(By.xpath("//li")).size();
        assertEquals(1,resultsCount);
    }

    @Test
    public void verifySearchMultipleResults(){
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("isla");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        int resultsCount = driver.findElements(By.xpath("//li")).size();
        //assertEquals(1,resultsCount);
        assertTrue(resultsCount > 1);
    }

    @Test
    public void verifySearchNoResults(){
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("castle");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        String errorEmptySearch = driver.findElement(By.xpath("//div[@id='error-no-results']")).getAttribute("id");
        assertEquals("error-no-results",errorEmptySearch);

        //int resultsCount = driver.findElements(By.xpath("//ul/li")).size();
        //assertEquals(1,resultsCount);
    }


}

/*
Write a list of test cases that should check whether given search form correctly. Write them as JUnit test methods (@Test) in Solution class. Before each test, your class is called with the WebDriver already pointing at the page being tested.
You can play with the reference, fully working page here.
Requirements:
1. Check if query input and submit button are on the main screen of the application:
• Search query input has id equal to search-input.
• Submit button has id equal to search-button.
2. Check if searching with empty query is forbidden:
• After trying to use an empty query, a div with id equal to error-empty-query.
3. Check if at least one island is returned after querying for isla:
• There should be at least one <li> result element.
4. Check if user gets feedback if there are no results:
• As there are no castles around, so querying for castle should return 0 results
• In this case, div with id equal to error-no-results.
5. Check if results match the query:
• There is only one port around, Port Royal.
• Querying for port should return only one result, Port Royal.
Assessment/Tools:
• WebDriver that is provided in the constructor is already pointing to the page being tested.
• If the page being tested is misbehaving at least one of your tests should fail.
• Make sure you annotate your test cases with @Test decorator.
• Search queries are case insensitive.
• Search API response time is always 100ms.
• Performance is not assessed, focus only on the correctness of the tests.
• Tests may take longer time due to the browser running in the background.
You can use the provided page for the reference.
 */