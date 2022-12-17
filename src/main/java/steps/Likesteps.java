package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Likesteps {
    @Given(": I open spotify")
    public void i_open_spotify() {
        System.out.println("------>On Spotify");

    }
    @Given(": I play a song")
    public void i_play_a_song() {
        System.out.println("------>Playing a song");

    }
    @Then("Song should be in liked playlist")
    public void song_should_be_in_liked_playlist() {
        System.out.println("------>Song added to Liked Playlist");

    }

    @When("I click on like button on {string}")
    public void iClickOnLikeButtonOn(String arg0) {
        System.out.println("------> "+arg0);
    }
}
