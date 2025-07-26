package base;

import data.DataModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;
import pages.HomePage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class BaseTests {

    WebDriver driver;
    protected HomePage homePage;

    ReadDataFromJson readDataFromJson;
    ChromeOptions chromeOptions;

    FirefoxOptions firefoxOptions;

    @BeforeClass
    @Parameters("browser")
    public void setUp(@Optional("Chrome") String browser) {
        setUpBrowser(browser);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @Parameters("browser")
    public void setUpBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("headlessChrome")) {
            chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else if (browser.equalsIgnoreCase("headlessFirefox")) {
            firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--headless");
            driver = new FirefoxDriver(firefoxOptions);
        }
    }

    @BeforeMethod
    public void goHome() throws FileNotFoundException {

        driver.get(dataModel().URL);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    public DataModel dataModel() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        return readDataFromJson.readJsonFile();
    }
}
