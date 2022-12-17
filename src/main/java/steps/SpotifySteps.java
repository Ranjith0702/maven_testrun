package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SpotifySteps {

    @Then("I should hear a song")
    public void iShouldHearASong() {
        System.out.println("--- Then I should see Song name");
    }

    @Given("I open spotify")
    public void iOpenSpotify() {
        System.out.println("---> Given I am on spotyify App..");
    }
    @And("I play the song")
    public void iPlayTheSong() {
    }

    @When("I search for a {string}")
    public void iSearchForA(String song) {
        System.out.println("Search song " + song);
    }

    @Then("I should hear a {string}")
    public void iShouldHearA(String arg0) {
        System.out.println("______>"+arg0);
    }
}
