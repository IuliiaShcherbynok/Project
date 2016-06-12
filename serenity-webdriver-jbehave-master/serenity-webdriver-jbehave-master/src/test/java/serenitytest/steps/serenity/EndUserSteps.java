package serenitytest.steps.serenity;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.name;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import serenitytest.pages.CoachPageView;
import serenitytest.pages.PersonalCoachPage;

public class EndUserSteps extends ScenarioSteps {

    serenitytest.pages.CoachPageView CoachPageView;
    serenitytest.pages.PersonalCoachPage PersonalCoachPage;
    serenitytest.pages.SearchResults SearchResults;
    serenitytest.pages.TrainingPage TrainingPage;

    @Step
    public void is_the_home_page() {
        CoachPageView.open();
    }

    @Step
    public void goToTeamPage() {
        CoachPageView.goToTeamPage();
    }

    @Step
    public void find_teacher(String name) {
        try {
            assertTrue("No such teacher", CoachPageView.findAllCoaches().contains(name));
        } catch (AssertionError error) {
            System.out.println("No such teacher");
        }
    }

    @Step
    public void is_on_our_team_page() {
        PersonalCoachPage.open();
    }

    @Step
    public void clickOnTeacher(String name) {
        PersonalCoachPage.goToPersonalCoachPage(name);
    }

    @Step
    public void checkNameAndCourse(String name, String course) {
        try {
            assertEquals("Incorrect name", name, PersonalCoachPage.checkTeacherName(name));
            assertTrue("Incorrect course", PersonalCoachPage.checkTeacherCourse(name).contains(course));
        } catch (AssertionError error) {
            System.out.println("Incorrect name or course");
        }
    }

    @Step
    public void putInput(String input) {
        SearchResults.putInput(input);
    }

    @Step
    public void checkNamePositionCourse(String name, String position, String course, String input) {
        if (SearchResults.findDescription(input) == null) {
            System.out.println("No search results found");

        } else if (SearchResults.findDescription(input) != null)
            try {
                assertTrue("Incorrect name", SearchResults.findDescription(input).getText().contains(name));
                assertTrue("Incorrect position", SearchResults.findDescription(input).getText().contains(position));
                assertTrue("Incorrect course", SearchResults.findDescription(input).getText().contains(course));
            } catch (AssertionError error) {
                System.out.println(error);
            }
    }

    @Step
    public void checkCertificate(String name, String certificate, String input) {
        if (SearchResults.findDescription(input) == null) {
            System.out.println("No search results found");

        } else if (SearchResults.findDescription(input) != null)
            try {
                assertTrue("Incorrect name", SearchResults.findDescription(input).getText().contains(name));
                assertTrue("Incorrect certificate", SearchResults.findDescription(input).getText().contains(certificate));

            } catch (AssertionError error) {
                System.out.println(error);
            }
    }

    @Step
    public void noResults(String input) {
        assertNull(SearchResults.findDescription(input));
    }

    @Step
    public void goToTrainingPage() {
        TrainingPage.goToTrainingPage();
    }

    @Step
    public void checkPriceAndSize(String price, String size) {
        try {
            assertTrue("Incorrect price", TrainingPage.getDescription().contains(price));
            assertTrue("Incorrect size", TrainingPage.getDescription().contains(size));

        } catch (AssertionError error) {
            System.out.println(error);
        }

    }


}

