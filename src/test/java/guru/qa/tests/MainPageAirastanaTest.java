package guru.qa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.xpath;


@Owner("KenyTae")
@DisplayName("QA vacancy in AirAstana")
public class MainPageAirastanaTest extends TestBase {

    public String URL = "https://airastana.com/global/en-us/";

    // Вакансия  https://hh.kz/employer/31453

    // region SelenideElement
    private final SelenideElement
            IARASTANA_LOGO = $("a.brand.logo-big"),
            BOOK_AND_MANAGE = $("a.dropdown-toggle"),
            SPECIAN_OFFERS = $(new ByText("Special Offers")),
            FLIGHTS_FORE_KYEV = $(new ByText("Flights from Kyiv to Almaty")),
            INFORMATION = $(new ByText("Information")),
            ECONOMYCLASS = $(new ByText("Economy Class")),
            TITLE_ECONOMYCLASS = $("h2.TitleH2"),
            TRAVEL_INFORMATIOM = $("a.sidenodetop"),
            BAGGAGE = $(linkText("Baggage")),
            BAGGAGE_ALLOWANCE = $(linkText("Baggage Allowance")),
            NOMAD_CLUB = $(new ByText("Nomad Club")),
            ABOUT_NOMAD_CLUB = $(linkText("About Nomad Club")),
            MANAGE_MY_ACCOUNT = $(linkText("Manage My Account")),
            BUSINESS = $(linkText("Business")),
            JOIN_NOMAD_CLUB = $(linkText("Join Nomad Club")),
            SPECIAL_OFFERS = $(linkText("Special Offers")),
            TRANSLATE_SPECIAL_OFFERS = $("#translate"),
            ABOUT_AS = $(xpath("//a[contains(text(),'About Us')]")),
            OVERVIEW = $(linkText("Overview")),
            CORPORATE_PROFILE = $(linkText("Corporate Profile")),
            CORPORATE_GOVERNANCE = $(linkText("Corporate Governance")),
            CONTACT_AS = $(linkText("Contact us")),
            CONTACT_AS_HIGH_REGISTER = $(linkText("Contact Us")),
            CALL_CENTRE = $(linkText("Call Centre")),
            TITLE_CALL_CENTRE = $(".TitleH2"),
            FLIGHTS = $(linkText("Flights")),
            FLIGHTS_FROM = $(".filter-option.pull-left"),
            FLIGHTS_FROM_SELECT_CITY = $(".input-block-level.form-control"),
            FLIGHTS_TO = $("[title=\"To\"]"),
            FLIGHTS_TO_SELECT_CITY = $("div.btn-group.bootstrap-select.form-control.input-lg.show-tick.destinationsDropdown.dest-arrival.open")
                    .$(".input-block-level.form-control"),
            DEPARTURE = $(".input-wrapper.desktop"),
            DEPARTURE_SELECT_DAY = $(".day.toMonth.valid.real-today"),
            SEARCH_BUTTON = $(".magnifier"),
            PASSENGER_TITLE = $(".passengerTitle");
    //endregion

    private void openMainPageAirastana(String url) {
        open(url);
        IARASTANA_LOGO.shouldBe(Condition.visible, Duration.ofSeconds(20));
    }

    private String getDay() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d");
        return simpleDateFormat.format(date);
    }

    private String dayIncrement(String someday) {
        int day = Integer.parseInt(someday);
        day = day + 2;
        return String.valueOf(day);
    }

    @Tag("Book and Manage")
    @Test
    void mainPageAirastanaBookAndManage() {
        step("Заходим на главную страницу AirAstana: " + URL + " ", () -> {
            openMainPageAirastana(URL);
        });
        step("Переходим на стриницу Book and Manage " , () -> {
            step("Прокликиваем Book and Manage " , () -> {
                BOOK_AND_MANAGE.click();
                $("div.third-level-content").shouldBe(Condition.visible).click();
                SPECIAN_OFFERS.shouldBe(Condition.visible).click();
                FLIGHTS_FORE_KYEV.shouldBe(Condition.visible);
            });
        });
    }

    @Tag("Information")
    @Test
    void mainPageAirastanaInformation() {
        step("Заходим на главную страницу AirAstana: " + URL + " ", () -> {
            openMainPageAirastana(URL);
        });
        step("Переходим на стриницу Information " , () -> {
            step("Прокликиваем Information " , () -> {
                INFORMATION.click();
                ECONOMYCLASS.shouldBe(Condition.visible).click();
                TITLE_ECONOMYCLASS.shouldBe(Condition.text("Economy Class"));
                TRAVEL_INFORMATIOM.click();
                BAGGAGE.click();
                BAGGAGE_ALLOWANCE.shouldBe(Condition.visible);
            });
        });
    }

    @Tag("Nomad Club")
    @Test
    void mainPageAirastanaNomadClub() {
        step("Заходим на главную страницу AirAstana: " + URL + " ", () -> {
            openMainPageAirastana(URL);
        });
        step("Переходим на стриницу Nomad Club " , () -> {
            step("Прокликиваем Nomad Club " , () -> {
                NOMAD_CLUB.click();
                ABOUT_NOMAD_CLUB.shouldBe(Condition.visible);
                MANAGE_MY_ACCOUNT.shouldBe(Condition.visible);
                BUSINESS.shouldBe(Condition.visible);
                JOIN_NOMAD_CLUB.shouldBe(Condition.visible);
                SPECIAL_OFFERS.click();
                TRANSLATE_SPECIAL_OFFERS.shouldHave(Condition.text("Special Offers"));
            });
        });
    }

    @Tag("About Us")
    @Test
    void mainPageAirastanaAboutUs() {
        step("Заходим на главную страницу AirAstana: " + URL + " ", () -> {
            openMainPageAirastana(URL);
        });
        step("Переходим на стриницу About As ", () -> {
            step("Прокликиваем About As ", () -> {
                ABOUT_AS.click();
                OVERVIEW.shouldBe(Condition.visible);
                CORPORATE_PROFILE.shouldBe(Condition.visible);
                CORPORATE_GOVERNANCE.shouldBe(Condition.visible);
                CONTACT_AS.shouldBe(Condition.visible);
                CONTACT_AS_HIGH_REGISTER.click();
                CALL_CENTRE.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
                TITLE_CALL_CENTRE.shouldBe(Condition.text("Call Centre"));
            });
        });


    }

    @Tag("Flights")
    @Test
    void mainPageAirastanaFlights() {
        step("Заходим на главную страницу AirAstana: " + URL + " ", () -> {
            openMainPageAirastana(URL);
        });
        step("Заполняем форму ", () -> {
            step("Flights ", () -> {
                FLIGHTS.scrollTo();
                FLIGHTS_FROM.click();
                FLIGHTS_FROM_SELECT_CITY.setValue("Almaty").pressEnter();
                FLIGHTS_TO.click();
                FLIGHTS_TO_SELECT_CITY.setValue("Nur-Sultan").pressEnter();
                DEPARTURE.click();
                DEPARTURE_SELECT_DAY.shouldHave(text(getDay())).click();
                //$("#date2").click();
                //$("div.day.toMonth.valid.tmp.hovering").shouldHave(text(dayIncrement(getDay()))).click();
                SEARCH_BUTTON.click();
                PASSENGER_TITLE.shouldHave(Condition.text("Adult"));
                SEARCH_BUTTON.click();
            });
        });
    }
}
