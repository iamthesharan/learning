package com.software.designpattern.creational.singleton.lazy;

// This implementation of singleton is with Double Check Locking.

public class LazyRegistry {
    private LazyRegistry(){

    }
    private static volatile LazyRegistry INSTANCE; // Volatile force value read/write from main memory instead of cache.
    public static LazyRegistry getInstance(){
        if(INSTANCE==null){
            synchronized (LazyRegistry.class){
                if(INSTANCE==null){
                    // This is called Double check locking.
                    INSTANCE=new LazyRegistry();
                }
            }
        }
        return INSTANCE;
    }
}
