package com.virgingames.cucumber.steps;

import com.virgingames.currencyinfo.BingoSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;

public class BingoSteps1 {
    static ValidatableResponse response;

    @Steps
    BingoSteps bingoSteps;

    @When("User sends a GET request to list endpoint")
    public void userSendsAGETRequestToListEndpoint() {
        response = bingoSteps.getAllJackPortCurrencyGBP();
    }

    @Then("User must get back a valid status code {int}")
    public void userMustGetBackAValidStatusCode(int statusCode) {
        response.statusCode(200);
    }
}
