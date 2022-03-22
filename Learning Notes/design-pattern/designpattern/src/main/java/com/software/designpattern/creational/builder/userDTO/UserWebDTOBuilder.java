package com.software.designpattern.creational.builder.userDTO;

import java.time.LocalDate;
import java.time.Period;

//This is the Concrete Builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO userWebDTO;
    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        /**
         * Here we are going to get the First Name of the User as a parameter in this method.
         * But in our Product Class UserWebDTO, We need Complete Name.
         * So Whenever you have situation where you cannot directly build the part, We store this info that is given
         * and inside our build methods we will create our name with fname and lname
         **/
        this.firstName=firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName=lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate birthday) {
        Period ageInYears=Period.between(birthday, LocalDate.now());
        this.age=Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address=address.getHouseNumber()+", "+address.getStreet()+"\n"+address.getCity()+"\n"+address.getState()+
                " "+address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        userWebDTO=new UserWebDTO(this.firstName+" "+this.lastName, this.age, this.address);
        return userWebDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return userWebDTO;
    }
}
