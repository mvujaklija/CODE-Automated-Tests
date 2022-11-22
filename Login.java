package SauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {



    public static void loginUser (ChromeDriver driver) {



        driver.get ( "https://www.saucedemo.com/" );

        WebElement userNameField = driver.findElementById ( "user-name");
        userNameField.sendKeys ( "standard_user" );

        WebElement passwordField = driver.findElementById ( "password" );
        passwordField.sendKeys ( "secret_sauce" );

        WebElement loginButton = driver.findElementById ( "login-button" );
        loginButton.click ( );
    }


}
