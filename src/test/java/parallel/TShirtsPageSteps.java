package parallel;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.pages.TshirtsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TShirtsPageSteps {
	
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private TshirtsPage tshirtpage;
	
	

    @Given("^user is on Tshirt page$")
    public void user_is_on_tshirt_page() throws Throwable {
    	tshirtpage.getTshirtsPagetitle();
    	System.out.println("test");
    }

 
    @Then("^user add the item to the cart$")
    public void user_add_the_item_to_the_cart() throws Throwable {
    
    }

	
    }
	
	
	

