package tests.unit_tests;

import configInterfaces.Environment;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Test;


public class ConfigTest {

    Environment testEnvironment = ConfigFactory.create(Environment.class);

    @Test
    public void ConfigEnvTest() {


        // prints http://qa.testautomationguru.com
        System.out.println(testEnvironment.getDBPassword());

        // prints qa.db.testautomationguru.com
        System.out.println(testEnvironment.getDBUsername());

    }


}