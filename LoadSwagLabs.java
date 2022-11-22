package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoadSwagLabs {

    /**
     * Load test
     * Steps:
     * 1. Navigate to SwagLabs site using address  https://www.saucedemo.com

     *
     * Expected result:
     * 2. Verify that web page is loaded
     */

    @Test

    public void loadWebPage( ) {

            //This is the way that we start Chrome

            System.out.println ( "Start driver" );

            ChromeDriver driver = new ChromeDriver ( );

            try{

                //This is the way to load web page by asking driver to get URL

                driver.get ( "https://www.saucedemo.com/" );

                WebElement loginButton = driver.findElement( By.xpath ( "//input [@id = 'user-name']" ) );   //Checking for expected result

                System.out.println ( "Checking for expected results by assertions\n Is the current URL as expected?" );

                String currentURL = driver.getCurrentUrl ( );
                assert currentURL.equals ( "https://www.saucedemo.com/" ) :  "User is on the wrong page. Expected from inspector : https://www.saucedemo.com/inventory.html" +
                                                                             "Actual: " +currentURL;

                //Another checking by assertion

                System.out.println ( "Checking for expected results by assertions\n Is it LOGIN button displayed?" );
                assert loginButton.isDisplayed () : "LOGIN button is not displayed";

            }

            finally {

                driver.quit ();

            }

    }

}
