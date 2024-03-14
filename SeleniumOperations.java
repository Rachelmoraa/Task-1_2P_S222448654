import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class ChromeHandler {
    
    public static void main(String[] args) {
        open_chrome_loadpage_resize_close();
    }

    public static void open_chrome_loadpage_resize_close() {
        // Fill your personal information.
        System.out.println("Hello from <s222448654>, <Rachel Moraa Nyantika>");
        
        // Step 1: Locate chrome driver folder in the local drive.
        System.setProperty("webdriver.chrome.driver", "/home/mahabib/java_lib/chromedriver-linux64/chromedriver");
        
        // Step 2: Use above chrome driver to open up a chromium browser.
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver info: " + driver);
        
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        /*
         * Load google page.
         */
        driver.get("https://www.google.com");
        
        /*
         * Set window size manually to 640x480 and wait 2 second.
         * Hint: Explore Selenium window functions to select one which allows to pass
         * window size in WxH.
         */
        driver.manage().window().setSize(new org.openqa.selenium.Dimension(640, 480));
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        /*
         * Double window size manually to 1280x960 and wait 2 second.
         */
        driver.manage().window().setSize(new org.openqa.selenium.Dimension(1280, 960));
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // close chrome driver
        driver.quit();
    }
}
