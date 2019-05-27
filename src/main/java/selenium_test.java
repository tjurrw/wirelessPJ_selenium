import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class selenium_test {
    public static void seleniumTest(){
        try {
            System.setProperty("webdriver.gecko.driver", "./geckodriver");
            WebDriver driver = new FirefoxDriver();

            driver.get("http://www.google.com");

            Thread.sleep(5000);

            driver.close();

        } catch(Exception e){

        }
    }
}