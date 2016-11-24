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
            getDriver().get(url("/welcome"));
        });

        When("^I try to view the Welcome Page", () -> {
            getDriver().get(url("/welcome"));
        });

        Then("^I must see a welcome message$", () -> {
            List<WebElement> welcomeMsg = getDriver().findElements(By.cssSelector("#message"));
            assertThat(welcomeMsg.size(), is(1));
        });

        Then("^I must see a start game button$", () -> {
            List<WebElement> startBtn = getDriver().findElements(By.cssSelector("#startBtn"));
            assertThat(startBtn.size(), is(1));
        });


        // Help Button
        Then("^I must see the Help Button$", () -> {
            List<WebElement> rows = getDriver().findElements(By.cssSelector("#helpBtn"));
            assertThat(rows.size(), is(1));
        });
    }
}
