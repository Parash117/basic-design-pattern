package com.pgrg.basicdesignpattern.service.adapter.v2;

public class Sparrow implements Bird {
    // a concrete implementation of bird
    public void fly()
    {
        System.out.println("Flying");
    }
    public void makeSound()
    {
        System.out.println("Chirp Chirp");
    }
}
