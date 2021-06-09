package com.sumanasaha.tddjavaexample.validator;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PhoneNumberValidatorTest {

    //GOAL : create a phone number validator function

    private PhoneNumberValidator phoneNumberValidator;

    @BeforeEach
    public void setUp()
    {
        phoneNumberValidator = new PhoneNumberValidator();
    }

    @Test
    public void test_phoneNumberValidatorFunction() {

       //GIVEN
        String phoneNumberTestData = "+49-15730845951";

        String phoneNumberInvalidTestData = "+49-157";

        String phoneNumberWithoutCountryCode = "157000";

        // WHEN
        boolean actual = phoneNumberValidator.validate(phoneNumberTestData);
        boolean actualForInvalidTestData = phoneNumberValidator.validate(phoneNumberInvalidTestData);
        boolean actualForWithoutCountryCode = phoneNumberValidator.validate(phoneNumberWithoutCountryCode);

        // THEN
        assertThat( actual ).isTrue();
        assertThat( actualForInvalidTestData ).isFalse();
        assertThat( actualForWithoutCountryCode ).isFalse();

    }


}
