package com.upday.assignment.steps;

import com.upday.assignment.pages.Homepage;
import com.upday.assignment.utils.Setup;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class HomeSteps {

    private AndroidDriver<?> driver;
    private Homepage homepage;

    @Before
    public void setupAndLaunchApplication() throws MalformedURLException {
        driver = new Setup().getDriver();
    }

    @Given("^I open upday application$")
    public void launchApp() {
        homepage = new Homepage(driver);
        homepage.dismissLandingModal();
    }

    @When("^I am on homepage$")
    public void landingPage() {
        assertTrue(homepage.getHomeNav().isSelected());
    }

    @Then("^I should see below navigation menu items$")
    public void navigationItems(List<List<String>> items) {
        for (int i = 0; i < items.size(); i++) {
            switch (items.get(i).get(0)) {
                case "homeNav":
                    assertTrue(homepage.getHomeNav().isDisplayed());
                    break;
                case "topNewsNav":
                    assertTrue(homepage.getTopNewsNav().isDisplayed());
                    break;
                case "myNewsNav":
                    assertTrue(homepage.getMyNewsNav().isDisplayed());
                    break;
                default:
                    // nothing to add here. (probably - add a Logger message.
                    break;
            }
        }
    }
}
