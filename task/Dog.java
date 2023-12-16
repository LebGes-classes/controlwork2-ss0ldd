package com.task;

public class Dog extends Animal{
    public void eat() {
        System.out.println("Гав!");
        this.hunger += 25;
        if (this.hunger > 100) {
            this.hunger = 100;
        }
    }
}
