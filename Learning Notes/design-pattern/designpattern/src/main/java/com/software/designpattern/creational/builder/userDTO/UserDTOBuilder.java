package com.software.designpattern.creational.builder.userDTO;

import java.time.LocalDate;
//Abstract Builder
public interface UserDTOBuilder {
    // Methods to build Parts of the product at a time.
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthday(LocalDate birthday);
    UserDTOBuilder withAddress(Address address);
    UserDTO build();
    UserDTO getUserDTO(); // This method will return the already built DTO Object.
}
