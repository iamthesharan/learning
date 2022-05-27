package com.software.designpattern.creational.singleton.lazy2;

public class Client {
    public static void main(String ...args){
        LazyRegistry lazyRegistry=LazyRegistry.getInstance();
        LazyRegistry lazyRegistry1=LazyRegistry.getInstance();
        System.out.println(lazyRegistry.hashCode()+" "+lazyRegistry1.hashCode());
    }
}
