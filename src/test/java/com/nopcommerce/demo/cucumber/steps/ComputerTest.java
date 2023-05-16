import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComputerTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on \"([^\"]*)\" Menu$")
    public void iClickOnMenu(String menu) {
        new HomePage().selectMenu(menu);
        new HomePage().clickOnComputerMenu();
    }


    @And("^I click on Desktop$")
    public void iClickOnDesktop() {
        new HomePage().clickOnDesktopFromComputerMenuTab();
    }

    @And("^I select Sort By position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String sortBy) {
        new DesktopPage().selectSortByPositionNameZToA();
    }

    @Then("^verify the product will arrange in Descending order$")
    public void verifyTheProductWillArrangeInDescendingOrder() {
    new DesktopPage().verifyTheProductWillArrangeInDescendingOrder();
    }


}
