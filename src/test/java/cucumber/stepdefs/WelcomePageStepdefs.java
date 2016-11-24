package cucumber.stepdefs;

import cucumber.api.java8.En;
import org.dbunit.IDatabaseTester;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.odde.emersonsgame.data.support.Databases.getDataSet;
import static com.odde.emersonsgame.data.support.Databases.getDatabaseTester;
import static cucumber.stepdefs.support.Url.url;
import static cucumber.stepdefs.support.WebDrivers.getDriver;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WelcomePageStepdefs implements En {
    public WelcomePageStepdefs() {
        Given("^I am in the Welcome Page$", () -> {
            
        });

        When("^I try to view the Welcome Page$", () -> {
            
        });

        Then("^I must see a welcome message$", () -> {
            
        });
    }
}
