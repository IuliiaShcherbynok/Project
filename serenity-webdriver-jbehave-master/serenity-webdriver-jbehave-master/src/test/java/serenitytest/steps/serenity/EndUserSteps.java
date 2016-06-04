package serenitytest.steps.serenity;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.name;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenitytest.pages.CoachPageView;
import serenitytest.pages.PersonalCoachPage;

public class EndUserSteps extends ScenarioSteps {

    serenitytest.pages.CoachPageView CoachPageView;
    serenitytest.pages.PersonalCoachPage PersonalCoachPage;

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
        assertTrue("No such teacher", CoachPageView.findAllCoaches().contains(name));
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
        assertEquals("Incorrect name", name, PersonalCoachPage.checkTeacherName(name));
        assertTrue("Incorrect course", PersonalCoachPage.checkTeacherCourse(name).contains(course));

    }


    /*WikiDummyPage wikiDummyPage;

    @Step
    public void enters(String keyword) {
        wikiDummyPage.enterKeywords(keyword);
    }

    @Step
    public void starts_search() {
        wikiDummyPage.lookupTerms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(wikiDummyPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        wikiDummyPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }*/
}