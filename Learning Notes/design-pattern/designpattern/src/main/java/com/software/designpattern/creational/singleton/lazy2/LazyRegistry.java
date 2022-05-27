package com.software.designpattern.creational.singleton.lazy2;

// This implementation is using initialization Holder class.

public class LazyRegistry {
    private LazyRegistry(){

    }
    private static class RegistryHolder{
        /**
         * since the initialization phase writes the static variable INSTANCE in a sequential operation,
         * all subsequent concurrent invocations of the getInstance will return the same correctly initialized INSTANCE
         * without incurring any additional synchronization overhead.
         * **/
        static LazyRegistry INSTANCE=new LazyRegistry();
    }
    public static  LazyRegistry getInstance(){
        return RegistryHolder.INSTANCE;
    }
}
