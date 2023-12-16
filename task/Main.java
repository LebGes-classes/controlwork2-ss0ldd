package com.task;

public class Main {
    public static void main(String[] args) {
        Animal[] pets = new Animal[3];
        for (int i = 0; i < pets.length; i++) {
            if (i % 2 == 0) {
                pets[i] = new Kotik();
            } else {
                pets[i] = new Dog();
            }
        }

        System.out.println("Животные до того, как покормили:");
        for (Animal pet : pets) {
            System.out.println("Сытость: " + pet.hunger);
        }

        System.out.println("\nКормим питомцев:");
        for (Animal pet : pets) {
            pet.eat();
        }

        System.out.println("\nПокормили:");
        for (Animal pet : pets) {
            System.out.println("Сытость: " + pet.hunger);
        }
    }
}