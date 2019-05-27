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

/*

        driver.get("http://admin:admin@192.168.2.180");
        Thread.sleep(5000);

        WebElement changeSsid = driver.findElement(By.name("ssid0"));
        changeSsid.clear();
        changeSsid.sendKeys(a[].ssid);

        WebElement getPw = driver.findElement(By.name("pskValue0_show"));
        getPw.click(); //비밀번호 획득

        WebElement adminId = driver.findElement(By.name("username"));
        adminId.clear();
        adminId.sendKeys("admin");
        WebElement adminPw = driver.findElement(By.name("newpass"));
        adminPw.clear();
        adminPw.sendKeys("pwd");
        WebElement adminCpw = driver.findElement(By.name("confpass"));
        adminCpw.clear();
        adminCpw.sendKeys("pwd");
        WebElement changeIp = driver.findElement(By.name("lan_ip"));
        changeIp.click();

        Thread.sleep(2000);
        WebElement passWord = driver.findElement(By.name("user_pw"));
        passWord.sendKeys("test");

 */