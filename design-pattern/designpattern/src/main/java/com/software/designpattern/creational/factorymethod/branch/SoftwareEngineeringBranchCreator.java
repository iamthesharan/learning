package com.software.designpattern.creational.factorymethod.branch;

public class SoftwareEngineeringBranchCreator extends BranchCreator{
    public Branch createBranch(){
        return new SoftwareEngineeringBranch();
    }
}
