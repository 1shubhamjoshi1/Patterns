package com.shubham.programming;

import com.shubham.programming.singleton.EagerInitializedSingleton;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();
        eagerInitializedSingleton.getDbConnection();
    }
}
