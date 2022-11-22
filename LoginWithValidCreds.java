package FirstSwagLabsTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginWithValidCreds {

    /**Test steps
     * Login with valid credentials
     * Steps:
     * 1. Navigate to sauce-demo site
     * 2. On login page enter valid username
     * 3. Enter password
     * 4. click Login button
     *
     * Expected result:
     * 5. Verify that user is logged in by checking the url or that inventory page is loaded
     */

    @Test
    public void loginWithValidCreeds ( ) {

            //Invoking driver

                System.out.println ( "Way to start browser" );

            ChromeDriver driver = new ChromeDriver ( );

            try {

                 //This is a way to get url

                    System.out.println ( "Driver gets requested URL" );

                    driver.get ( "https://www.saucedemo.com/" );

                //This is the way to find elements on the web page


                //Searching for Web element username

                    System.out.println ( "Input user name" );

                    WebElement userNameField = driver.findElementById ( "user-name" );
                    userNameField.sendKeys ( "standard_user" );

                //Searching for Web element password

                    System.out.println ( "Input password" );

                    WebElement passwordField = driver.findElementById ( "password" );
                    passwordField.sendKeys ( "secret_sauce" );

                //Searching for Web element login button

                    System.out.println ( "Click on log in button" );

                    WebElement loginButton = driver.findElementById ( "login-button" );
                    loginButton.click ( );

                //Checking for expected result

                    System.out.println ( "Checking for expected results by assertions" );

                    String currentURL = driver.getCurrentUrl ( );
                    assert currentURL.equals ( "https://www.saucedemo.com/inventory.html" ) : "User is on the wrong page.  https://www.saucedemo.com/inventory.html" +
                                                                                              "Actual: " + currentURL;

                //Another checking for expected results

                    System.out.println ( "Is there any specific text on loaded web page?" );

                    WebElement title = driver.findElementByClassName ( "title" );
                    String titleName = title.getText ( );
                    assert titleName.equals ( "PRODUCTS" ) : "Bad title. Expected : Products " +
                                                             "Actual: " + titleName;

            }
            finally {

                driver.quit ();

            }

    }

}
