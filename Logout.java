package SauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Logout {

    public static void logoutUser ( ChromeDriver driver ) {

        System.out.println("Logging out the user");
        WebElement burgerMenu = driver.findElementByXPath("//button[@id = 'react-burger-menu-btn']");
        burgerMenu.click();

        //Implicit  wait

        driver.manage().timeouts().implicitlyWait ( 10, TimeUnit.SECONDS );

        WebElement resetStateLink = driver.findElementByXPath("//a[@id = 'reset_sidebar_link']");
        resetStateLink.click();

        WebElement logoutLink = driver.findElementByXPath("//a[@id = 'logout_sidebar_link']");
        logoutLink.click();

        //ovako proveravamo da li je user izlogovan
        System.out.println("Provera da li je user izlogovan");
        String currentURL = driver.getCurrentUrl();
        assert currentURL.equals("https://www.saucedemo.com/") : "User je na pogresnoj stranici. Ocekivana: https://www.saucedemo.com/inventory.html" +
                                                                 " Aktuelna: " + currentURL;


    }


}
