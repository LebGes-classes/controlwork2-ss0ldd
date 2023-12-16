package com.task;

import java.util.Random;

abstract class Animal {
    int hunger;
    public Animal() {
        this.hunger = new Random().nextInt(100) + 1;
    }

    abstract void eat();
}