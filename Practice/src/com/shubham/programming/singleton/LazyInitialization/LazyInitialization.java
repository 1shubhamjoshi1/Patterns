package com.shubham.programming.singleton.LazyInitialization;

public class LazyInitialization {
    private static LazyInitialization instance;

    private LazyInitialization() {
    }

    public static final LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }

    public void getDbConnection() {
        System.out.println("Getting the db connection from " + this.getClass().getSimpleName());
    }
}
