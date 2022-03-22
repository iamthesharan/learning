package com.software.designpattern.creational.builder.userDTO;

import java.time.LocalDate;
/**
 * This is the Entity Class used to Construct DTO.
 * **/
public class User {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;
    public User(){}
    public User(String firstName, String lastName, LocalDate birthday, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
