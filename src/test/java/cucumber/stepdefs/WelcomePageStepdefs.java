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
            getDriver().get(url("/welcome"));
        });

        Then("^I must see a welcome message$", () -> {
            
        });

        // Help Button
        Then("^I must see the Help Button$", () -> {
            List<WebElement> rows = getDriver().findElements(By.cssSelector("#helpButton"));
            assertThat(rows.size(), is(1));
        });
    }
}
