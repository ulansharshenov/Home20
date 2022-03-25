package com.company;

public class Car implements AutoCloseable{
    @Override
    public void close() throws RuntimeException {
        System.out.println("Машина жабылып жатат.");
    }

    public static void drive(){
        System.out.println("Машина журуп жатат.");
    }
}
