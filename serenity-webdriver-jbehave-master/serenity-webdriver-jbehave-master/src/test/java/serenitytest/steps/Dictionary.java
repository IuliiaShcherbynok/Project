package serenitytest.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.model.ExamplesTable;
import serenitytest.steps.serenity.EndUserSteps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Dictionary {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on Home page")
    public void givenTheUserIsOnHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user goes to Our Team Page")
    public void whenGoesToOurTeamPage() {
        endUser.goToTeamPage();
    }

    @Then("he should see the name <name>")
    public void thenShouldSeeTheName(String name) {
        endUser.find_teacher(name);
    }


    @Given("the user is on Our Team page")
    public void givenTheUserInOnOurTeamPage() {
        endUser.is_on_our_team_page();
    }

    @When("the user clicks on teacher <name>")
    public void whenUserClicksOnTeacher(String name) {
        endUser.clickOnTeacher(name);
    }

    /* @Then ("he should see the name and course $coachesTable")
      public void findAllCoaches (ExamplesTable coachesTable){
          for (Map<String,String> row : coachesTable.getRows()) {
              String name = row.get("name");
              String course = row.get("course");
              System.out.println(name + course);

      }*/
    @Then("he should see the name <name> and course <course>")
    public void thenSeeNameAndCourse(String name, String course) {
        endUser.checkNameAndCourse(name, course);
    }

    @When("the user puts input <input> in search field")
    public void whenPutInput(String input) {
        endUser.putInput(input);
    }

    @Then("he should see the name <name>, position <position> and course <course>")
    public void thenSeeNamePositionCourse(String name, String position, String course, String input) {
        endUser.checkNamePositionCourse(name, position, course, input);
    }


    @Then("he should see the name <name> and certificate <certificate>")
    public void thenSeeNameAndCertificate(String name, String certificate, String input) {
        endUser.checkCertificate(name, certificate, input);
    }

    @Then("he shouldn't see results for input <input>")
    public void thenNoResults(String input){
        endUser.noResults(input);
    }

    @When ("the users goes to training page")
    public void whenGoesToTrainingPage(){endUser.goToTrainingPage();}

    @Then ("should see price <price> of training and size <size> of group")
    public void thenSeePriceAndSize(String price, String size){endUser.checkPriceAndSize(price, size);}


}
