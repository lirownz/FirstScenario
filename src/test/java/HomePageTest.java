import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    private HomePage homePage;

    @BeforeClass
    public void setup(){
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void setupMethod(){
        homePage.goToURL();
    }

    @Test (priority=1)
    public void checkPageTitle(){
        Assert.assertEquals(driver.getTitle(),"QA Automation Tools Trainings and Tutorials | QA Tech Hub");
    }

    @Test (priority=2)
    public void navigateBack() {
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
    }

    @Test (priority=3)
    public void printCurrentURL() {
       System.out.println("*** Current URL is: "+driver.getCurrentUrl());
    }

    @Test (priority=4)
    public void navigateForward() {
        driver.navigate().forward();
    }

    @Test (priority=5)
    public void reloadPage() {
        driver.navigate().refresh();
    }

    @Test (priority=6)
    public void closeBrowser() {
        teardown();
    }
}
