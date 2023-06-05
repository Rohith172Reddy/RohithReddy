package com.package_demo;

public class Static {
    private static int staticVariable;

    static {
        staticVariable = initializeStaticVariable();
    }

    public static int getStaticVariable() {
        return 23;
    }

    private static int initializeStaticVariable() {

        return 42;
    }
}