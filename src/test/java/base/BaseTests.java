package base;

import data.DataModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class BaseTests {

    WebDriver driver;
    protected HomePage homePage;

    ReadDataFromJson readDataFromJson;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
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
