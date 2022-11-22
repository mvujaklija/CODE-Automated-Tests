package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BuyOneThing  {

    /**Test steps
     * Login with using Login class
     * Steps:
     * 1. Click one thing from inventory to add to chart
     * 2. Verify that you have one thing in chart by see number of items
     * 3/ click on the chart
     *
     * Expected result:
     * 5. Verify that chart is not empty
     */

    @Test
    public void byOneItemAndVerifyShoppingCart() {

        ChromeDriver driver = new ChromeDriver();

        try{
       Login.loginUser(driver);

       //Looking for web elements

            WebElement SauceLabsBikeLight = driver.findElement ( By.xpath ("//button [@id = 'add-to-cart-sauce-labs-bike-light']" ) );
            SauceLabsBikeLight.click ();

       //Assertion

            WebElement numberInCartBadge = driver.findElement ( By.xpath ("//div [@id = 'shopping_cart_container'] " ) );
            String textInCartBadge = numberInCartBadge.getText( );
            assert textInCartBadge.equals("1") : "Wrong number. Expected: 1 Actual: " + textInCartBadge;

       //Looking for web elements

            WebElement chartBadge = driver.findElement ( By.xpath ("//div [@id = 'shopping_cart_container']" ) );
            chartBadge.click ();

            WebElement nameOf = driver.findElement ( By.xpath ( "//div [@class = 'inventory_item_name']" ) );
            String textName = nameOf.getText(  );
            assert textName.equals("Sauce Labs Bike Light") : "Wrong text. Expected: Something else. Actual: " + textName;


    }
    finally {

            //driver.quit ();

        }
        }
}
