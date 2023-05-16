import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ElectronicsTestRunner {
    @When("^mouse hover on Electronics tab$")
    public void mouseHoverOnElectronicsTab() {
    }

    @And("^mouse hover on CellPhones and click$")
    public void mouseHoverOnCellPhonesAndClick() {
    }

    @Then("^verify the CellPhones text \"([^\"]*)\"$")
    public void verifyTheCellPhonesText(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
