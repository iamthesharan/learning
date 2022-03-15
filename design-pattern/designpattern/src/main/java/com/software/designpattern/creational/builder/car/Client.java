package com.software.designpattern.creational.builder.car;

public class Client {
    public static void main(String ...args){
        HondaCity hondaCity=directBuild(HondaCity.getCarBuilder(),createCarDetails());
        System.out.println(hondaCity.getCarName());
        System.out.println(hondaCity.getCarSpeed());
        System.out.println(hondaCity.getCarType());
        System.out.println(hondaCity.getMillage());
        System.out.println(hondaCity.getEngine());
    }
    public static HondaCity directBuild(HondaCity.CarBuilder carBuilder,CarDetails carDetails){
        return carBuilder.withCarCompany(carDetails.getCarCompany()).withCarEngine(carDetails.getEngine()).
                withCarMillage(carDetails.getCarMillage()).withCarModel(carDetails.getCarModel()).
                withCarName(carDetails.getCarName()).withCarSpeed(carDetails.getCarSpeed()).
                withCarType(carDetails.getCarType()).build();
    }
    public static CarDetails createCarDetails(){
        CarDetails carDetails=new CarDetails();
        carDetails.setCarCompany("Honda");
        carDetails.setCarName("City");
        carDetails.setCarModel("ZX");
        carDetails.setCarType("Sedan");
        carDetails.setCarSpeed("220 Kmp/h");
        carDetails.setCarMillage("18.5 Km/l");
        carDetails.setEngine(Client.createEngine());
        return carDetails;
    }
    public static Engine createEngine(){
        Engine engine=new Engine();
        engine.setEngineName("CVT");
        engine.setEnginePower("97.89 bhp");
        return engine;
    }
}
