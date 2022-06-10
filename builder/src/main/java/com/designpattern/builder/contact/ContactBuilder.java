package com.designpattern.builder.contact;

public class ContactBuilder {
    private String firstName;
    private String lastName;
    private String email;
    private String address;

    public ContactBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Contact buildContact() {
        return new Contact(firstName, lastName, email, address);
    }
}
