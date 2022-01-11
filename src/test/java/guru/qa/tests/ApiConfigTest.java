package guru.qa.tests;

import guru.qa.config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiConfigTest {

    @Test
    public void apiConfigTest() {

        System.getProperty("token");

        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());

        assertThat(apiConfig.baseUrl()).isEqualTo("https://github.com/KenyTea");
        assertThat(apiConfig.token()).isEqualTo("testToken");
    }
}