package StepDefinitionFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static Support.World.supportobj;
import static Support.World.test1obj;
public class Gobibobo {


    @Given("I am on site")
    public void i_am_on_site() {
      System.out.println("step1");
      test1obj.closePopup();
      supportobj.implicitwaitfun();
      System.out.println("Implicit wait done");
    }
    @Given("perform some function")
    public void perform_some_function() {
        System.out.println("step2");

    }
    @Then("Site works fine")
    public void site_works_fine() {
        System.out.println("step3");

    }
}
