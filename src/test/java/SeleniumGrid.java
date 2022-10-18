import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {

    public static void main(String[] args) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver","/Users/arif/Desktop/SeleniumGrid");
        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.181:4444"),new ChromeOptions());

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }

}
