package com.software.designpattern.creational.builder.userDTO;

import java.time.LocalDate;

public class Client {
    public static void main(String ...args){
        User user=createUser();
        UserDTOBuilder builder=new UserWebDTOBuilder();
        UserDTO userDTO=directBuild(builder,user);
    }
    //Director
    private static UserDTO directBuild(UserDTOBuilder builder, User user){
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress()).build();
    }
    public static User createUser(){
        User user=new User();
        user.setFirstName("Shashank");
        user.setLastName("Sharan");
        user.setBirthday(LocalDate.of(1997,6,7));
        Address address =new Address();
        address.setHouseNumber("603");
        address.setCity("Dhanbad");
        address.setState("Jharkhand");
        address.setStreet("Saraidhela");
        address.setZipcode("828127");
        user.setAddress(address);
        return user;
    }
}
