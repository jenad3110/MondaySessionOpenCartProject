package com.opencart.qa.utils.dataprovider;
import com.github.javafaker.Faker;

public class TestDataGenerator {



        private static Faker faker = new Faker();

        public static String generateFirstName() {
            return faker.name().firstName();
        }

        public static String generateLastName() {
            return faker.name().lastName();
        }

        public static String generatePhoneNumber() {
            return faker.phoneNumber().cellPhone();
        }

        public static String generateEmail() {
            return faker.internet().emailAddress();
        }

        public static String generatePassword() {
            return faker.internet().password();
        }


        public static String generateConfirmPasswordDifferentFromPassword() {
            return generatePassword();
        }
    }


