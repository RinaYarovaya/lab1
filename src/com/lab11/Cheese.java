package com.lab11;

public class Cheese extends Food {
    public Cheese() {
        super("Cheese");
    }
    public void consume() {
        System.out.println(this + " was eaten");
    }
}
