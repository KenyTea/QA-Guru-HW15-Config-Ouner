package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/token.properties")

public interface ApiConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com/KenyTea")
    String baseUrl();

    @Key("token")
    String token();
}