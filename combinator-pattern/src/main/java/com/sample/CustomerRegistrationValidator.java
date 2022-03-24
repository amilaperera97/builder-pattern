package com.sample;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static com.sample.CustomerRegistrationValidator.ValidationResult.*;

public interface CustomerRegistrationValidator extends Function<Customer, CustomerRegistrationValidator.ValidationResult> {

    static CustomerRegistrationValidator isValidEmail() {
        return customer -> customer.getEmail().contains("@") ? SUCCESS : INVALID_EMAIL;
    }

    static CustomerRegistrationValidator isValidPhoneNumber() {
        return customer -> customer.getPhoneNumber().startsWith("+44") ? SUCCESS : INVALID_PHONE_NUMBER;
    }

    static CustomerRegistrationValidator isAnAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 18 ? SUCCESS : IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return SUCCESS.equals(result) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        INVALID_EMAIL,
        INVALID_PHONE_NUMBER,
        IS_NOT_AN_ADULT
    }
}
