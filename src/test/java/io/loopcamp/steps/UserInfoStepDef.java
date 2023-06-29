package io.loopcamp.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loopcamp.jdbctests.utility.DB_util;
import io.loopcamp.jdbctests.utility.Driver;
import org.junit.Assert;

import java.util.List;

public class UserInfoStepDef {

    @Given("Establish the database connection")
    public void establish_the_database_connection() {
        System.out.println("===============");
    }
    @When("Execute query to get all column for {string}")
    public void execute_query_to_get_all_column_for(String string) {
        DB_util.runQuery("select * from identify." + string);
    }
    @Then("verify the below column sare listed in result for")
    public void verify_the_below_column_sare_listed_in_result_for(List<String> expected) {
        System.out.println("Expected: " + expected);
       // Assert.assertEquals(expected, );
    }
}
