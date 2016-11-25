package cucumber.stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class CreateRaceStepdefs implements En {
    public CreateRaceStepdefs() {
        When("^I try to create a new race$", () -> {
            throw new PendingException();
        });

        Then("^I must see the new race$", () -> {
           throw new PendingException();
        });

        Given("^I choose (\\w) speed$", (String speed) ->{
            
        });

        And("^Damage is (\\d)$", (Integer damage) -> {
            
        });

        When("^Dice roll is (\\d)$", (Integer roll) -> {
            
        });

        Then("^I take (\\d) steps$", (Integer steps) -> {
            
        });
        But("^Damage is now (\\d)$", (Integer newDamage) -> {
            
        });
    }
}
