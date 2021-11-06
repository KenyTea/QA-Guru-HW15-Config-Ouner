package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import guru.qa.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    public RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void config() {
        Configuration.startMaximized = true;
        //Configuration.headless = true; не открывает страницу браузера
    }
}
