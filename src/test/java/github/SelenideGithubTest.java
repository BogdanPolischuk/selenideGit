package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SelenideGithubTest {


    @Test
    void shouldFindRepositoryInTop() {
        Selenide.open("https://github.com/");
        $("[data-hotkey=\"s,/\"]").setValue("selenide").pressEnter();
        $("[href=\"/selenide/selenide\"]").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }


    @Test
    void bestContributorSelenide() {
        Selenide.open("https://github.com/");
        $("[data-hotkey=\"s,/\"]").setValue("selenide").pressEnter();
        $("[href=\"/selenide/selenide\"]").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        $(".BorderGrid").$(byText("Contributors")).ancestor(".BorderGripRow").$$("ul li").first().hover();
    }
}
