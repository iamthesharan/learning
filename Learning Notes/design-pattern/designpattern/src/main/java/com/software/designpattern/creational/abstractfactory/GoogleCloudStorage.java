package com.software.designpattern.creational.abstractfactory;

public class GoogleCloudStorage implements Storage{
    public GoogleCloudStorage(int capacityInMb) {
        System.out.println("Allocated "+capacityInMb+"on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }
}
