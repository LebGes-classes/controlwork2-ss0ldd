package com.task;

public class Kotik extends Animal {
    public void eat() {
        System.out.println("Мяу!");
        this.hunger += 25;
        if (this.hunger > 100) {
            this.hunger = 100;

        }
    }
}
