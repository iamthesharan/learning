package com.software.designpattern.creational.singleton.lazy;

public class Client {
    public static void main(String ...args){
        LazyRegistry lazyRegistry=LazyRegistry.getInstance();
        LazyRegistry lazyRegistry1=LazyRegistry.getInstance();
        System.out.println(lazyRegistry.hashCode());
        System.out.println(lazyRegistry1.hashCode());
    }
}
