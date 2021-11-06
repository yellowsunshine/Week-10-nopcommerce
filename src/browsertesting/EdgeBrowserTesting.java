package browsertesting;

/*
Opening the nop website using Chrome Browser
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTesting {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";

        //Setting the driver path
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //Creating an object of the webdriver
        WebDriver driver = new EdgeDriver();

        //selenium method to launch the driver
        driver.get(baseUrl);

        //maximising browser window
        driver.manage().window().maximize();

        //getting the title of browser in console
        String getTitle = driver.getTitle();
        System.out.println(getTitle);

        //closing the driver
        driver.close();


    }
}
