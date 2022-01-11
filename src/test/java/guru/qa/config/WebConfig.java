package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/${environment}.properties")

public interface WebConfig extends Config {

    @Key("browserName")
    String browserName();

    @Key("browserVersion")
    String browserVersion();

    @Key("remoteDriverUrl")
    String remoteDriverUrl();
}
