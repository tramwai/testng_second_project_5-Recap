package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.UnitedBasePage;
import pages.UnitedFlightResultsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class UnitedBase {
    public WebDriver driver;

    UnitedBasePage unitedBasePage;
    UnitedFlightResultsPage unitedFlighResultsPage;

    @BeforeMethod
    public void setup() {
        driver = Driver.getDriver();
        unitedBasePage = new UnitedBasePage();

        driver.get(ConfigReader.getProperty("appURL"));
    }

    @AfterMethod
    public void teardown() {
        Driver.quitDriver();
    }
}