package com.opencart.qa.utils.dataprovider;
import org.testng.annotations.DataProvider;

public class TestDataProviders {

    @DataProvider(name = "userData")
    public static Object[][] getUserData() {
        return new Object[][]{

                       {TestDataGenerator.generateFirstName(),
                        TestDataGenerator.generateLastName(),
                        TestDataGenerator.generatePhoneNumber(),
                        TestDataGenerator.generateEmail(),
                        TestDataGenerator.generatePassword(),
                        TestDataGenerator.generateConfirmPasswordDifferentFromPassword()},

        };
    }
}
