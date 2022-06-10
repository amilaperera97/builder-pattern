package com.designpattern.builder.contact;

public class Contact {
    private String firstName;
    private String lastName;
    private String email;
    private String address;

    public Contact(String firstName, String lastName, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }
}
