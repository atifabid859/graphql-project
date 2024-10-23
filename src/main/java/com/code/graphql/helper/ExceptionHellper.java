package com.code.graphql.helper;

public class ExceptionHellper {

    public static RuntimeException throughResourceException(){
        return new RuntimeException("Resource Not Found");
    }
}
