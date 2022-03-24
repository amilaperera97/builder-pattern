package com.sample;

import java.time.LocalDate;

import static com.sample.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {

        Customer customerInfo =  new Customer("Amila",
                LocalDate.of(1995,06,26),
                "amilap@gmail.com",
                "+4478");


        ValidationResult result = isValidEmail()
                .and(isValidPhoneNumber())
                .and(isAnAdult())
                .apply(customerInfo);

        CustomerRegistrationValidator customerRegistrationValidator = isValidEmail()
                .and(isValidPhoneNumber())
                .and(isAnAdult());

        customerRegistrationValidator.apply(customerInfo);

        System.out.println(result);
    }
}
