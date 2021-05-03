import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest{

    public WebDriver driver;

    @BeforeClass
    public void setUpTest() {
        //setting FF driver from Maven
        WebDriverManager.firefoxdriver().setup();
        //Create a FF driver. All test classes use this.
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown () {
        //setting FF driver to quit after finishing all tests
        driver.quit();
        System.out.println("Test Completed");
    }
}