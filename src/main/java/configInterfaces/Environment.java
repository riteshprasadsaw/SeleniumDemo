package configInterfaces;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:qa.properties" // mention the property file name
})

public interface Environment extends Config {

    String url();

    String username();

    String password();

    @Key("db.hostname")
    String getDBHostname();

    @Key("db.port")
    int getDBPort();

    @Key("db.username")
    String getDBUsername();

    @Key("db.password")
    String getDBPassword();

}
