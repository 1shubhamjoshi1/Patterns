package com.shubham.programming.singleton.StaticBlockinItialization;

public class Main {
    public static void main(String[] args) {
        StaticBlockInitialization staticBlockInitialization = StaticBlockInitialization.getInstance();
        staticBlockInitialization.getDbConnection();
    }
}
