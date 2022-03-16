package com.software.designpattern.creational.factorymethod.branch;

public class Client {
    public static void main(String ...args){
        printMessage(new SoftwareEngineeringBranchCreator());
    }
    public static void printMessage(BranchCreator branchCreator){
        System.out.println(branchCreator.getBranch().getBranchName());
    }
}
