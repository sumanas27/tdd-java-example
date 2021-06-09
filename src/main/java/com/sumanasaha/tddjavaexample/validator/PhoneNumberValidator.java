package com.sumanasaha.tddjavaexample.validator;


public class PhoneNumberValidator {

    public boolean validate( final String phoneNumberTestData ) {

        if( phoneNumberTestData.length() > 10
            && phoneNumberTestData.startsWith( "+49" ) ) {
            return true;
        }

        return false;
    }
}
