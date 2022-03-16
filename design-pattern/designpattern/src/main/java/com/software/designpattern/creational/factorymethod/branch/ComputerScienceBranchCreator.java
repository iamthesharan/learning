package com.software.designpattern.creational.factorymethod.branch;

public class ComputerScienceBranchCreator extends BranchCreator{
    public Branch createBranch(){
        return new ComputerScienceBranch();
    }
}
