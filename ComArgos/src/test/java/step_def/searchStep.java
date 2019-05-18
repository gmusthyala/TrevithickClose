package step_def;

import Pages.HeaderPage;
import Pages.ResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class searchStep {
    HeaderPage headerPage= new HeaderPage();
    ResultPage resultPage= new ResultPage();
    @Given("^I am on homepge$")
    public void i_am_on_homepge(){
   String actual= headerPage.getCurrentUrl();
        assertThat(actual,endsWith("https://www.argos.co.uk/"));
    }

    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String arg1){
        headerPage.doSearch(arg1); }

    @Then("^I shoud be able see the results$")
    public void i_shoud_be_able_see_the_results(){
      String actual1 = resultPage.headerTxt();
      assertThat(actual1,is(equalTo(HeaderPage.searchproduct)));
    }

}
