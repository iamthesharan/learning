package com.software.designpattern.creational.factorymethod.branch;

public abstract class BranchCreator {

    public Branch getBranch(){
        return createBranch();
    }

    public abstract Branch createBranch();
}
