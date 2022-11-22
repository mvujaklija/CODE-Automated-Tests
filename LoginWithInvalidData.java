package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginWithInvalidData {

    /**Test steps
     * Login with valid credentials
     * Steps:
     * 1. Navigate to sauce-demo site
     * 2. On login page enter valid username standard_user
     * 3. On login page enter valid password 1234
     * 4. Click Login button
     *
     * Expected result:
     * 5. Verify that user is logged in by checking the url or that inventory page is loaded
     */

    @Test
    public void loginWithInvalidData ( ) {

        //Calling the driver

        ChromeDriver driver = new ChromeDriver ( );

        try {

            //Way to get URL

            driver.get ( "https://www.saucedemo.com/" );

            //Looking for web elements

            //Searching for Web element username

            System.out.println ( "Input user name" );

            WebElement userNameField = driver.findElement ( By.xpath ( "//input [@id = 'user-name']" ) );
            userNameField.sendKeys ( "standard_user" );

            //Searching for Web element password

            System.out.println ( "Input password" );

            WebElement passwordField = driver.findElement ( By.xpath ( "//input [@id = 'password']" ) );
            passwordField.sendKeys ( "1234" );

            //Searching for Web element login button

            System.out.println ( "Click on log in button" );

            WebElement loginButton = driver.findElement ( By.xpath ( "//input [@id = 'login-button']" ) ) ;
            loginButton.click ( );

            //Expected result

            String curentURL = driver.getCurrentUrl ( );
            assert curentURL.equals ( "https://www.saucedemo.com/inventory.html" ) : "User is on the wrong page. https://www.saucedemo.com/" +
                                                                                     "Actual: " + curentURL;


        }
        finally {

            driver.quit ();

        }

    }

}






