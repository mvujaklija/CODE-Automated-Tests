package FirstSwagLabsTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginWithInvalidCreds {

    /**
     * Test steps
     * Login with invalid credentials
     * Steps:
     * 1. Navigate to sauce-demo site
     * 2. On login page enter valid username
     * 3. Enter password
     * 4. click Login button
     * <p>
     * Expected result:
     * 5. Verify that user getting some error massage
     */

    @Test
    public void loginWithInvalidCreds ( ) {

        //Calling the driver

        ChromeDriver driver = new ChromeDriver ( );

        try {

            //Way to get URL

            driver.get ( "https://www.saucedemo.com/" );

            //Looking for web elements

            WebElement usernameField = driver.findElementById ( "user-name" );
            usernameField.sendKeys ( "locked_out_user" );

            WebElement passwordField = driver.findElementById ( "password" );
            passwordField.sendKeys ( "secret_sauce" );

            WebElement loginButton = driver.findElementById ( "login-button" );
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






