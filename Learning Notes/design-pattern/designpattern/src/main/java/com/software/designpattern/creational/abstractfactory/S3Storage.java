package com.software.designpattern.creational.abstractfactory;

public class S3Storage implements Storage{
    S3Storage(int capMb){
        System.out.println("Allocated "+capMb+"on S3 Storage");
    }
    @Override
    public String getId() {
        return "S31";
    }
}
