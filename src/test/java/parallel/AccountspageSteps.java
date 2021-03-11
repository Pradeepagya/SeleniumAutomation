package parallel;



import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountspageSteps {
	
	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountspage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {
		
		List<Map<String, String>> credlist = credTable.asMaps();
		String username = credlist.get(0).get("username");
		String password = credlist.get(0).get("password");
		
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		accountspage = loginPage.dologin(username, password);
	}

	@Given("user is on Accounts page")
	public void user_is_on_accounts_page() {
		accountspage.getAccountsPagetitle();
	
	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section(io.cucumber.datatable.DataTable sectionTable) {
		
		List<String> expectedSectionTable = sectionTable.asList();
		
		List<String> actualSectionTable = accountspage.getAccountSectionsList();
		Assert.assertTrue(expectedSectionTable.containsAll(actualSectionTable));

	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer expcectedSectionCount) {
	  Assert.assertTrue(accountspage.getAccountsSectionCount() == expcectedSectionCount);
	}
	
	@When("user clicks on T-SHIRTS tab")
	public void user_clicks_on_t_shirts_tab() {
		accountspage.clickonTshirts();
	}
	
	@And("^user gets the title of the Tshirt page$")
    public void user_gets_the_title_of_the_tshirt_page() throws Throwable {
		title = accountspage.getTshirtPagetitle();
		System.out.println("Page title is: " + title);
		
	}
	
        
	
	@Then("^page title should contain \"([^\"]*)\"$")
    public void page_title_should_be_something(String expectedTitleName) throws Throwable {
		Assert.assertTrue(title.contains(expectedTitleName));
	
	
	}
	

	

}
