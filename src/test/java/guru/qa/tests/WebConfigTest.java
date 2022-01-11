package guru.qa.tests;

import guru.qa.config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebConfigTest {

    @Test
    public void localWebTest() {

        System.setProperty("environment", "local");

        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

        assertThat(webConfig.browserName()).isEqualTo("chrome");
        assertThat(webConfig.browserVersion()).isEqualTo("91");
    }

    @Test
    public void remoteWebTest() {

        System.setProperty("environment", "remote");

        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

        assertThat(webConfig.browserName()).isEqualTo("chrome");
        assertThat(webConfig.browserVersion()).isEqualTo("91");
        assertThat(webConfig.remoteDriverUrl()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");
    }
}