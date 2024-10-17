package org.example;

import java.util.Random;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    // Empty constructor
    public Human() {}

    // Constructor with name, surname, and year
    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    // Constructor with name, surname, year, father, and mother
    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    // Constructor with all fields
    public Human(String name, String surname, int year, int iq, Pet pet, Human father, Human mother, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.father = father;
        this.mother = mother;
        this.schedule = schedule;
    }

    // Method for greeting the pet
    public void greetPet() {
        System.out.println("Hello, " + pet.nickname);
    }

    // Method to describe the pet
    public void describePet() {
        String slynessOfPet = pet.trickLevel > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.species + ", it is " + pet.age + " years old, it is " + slynessOfPet);
    }


    public boolean feedPet(boolean timeToFeed) {
        if (timeToFeed) {
            System.out.println("Hm... I will feed " + name + "'s " + pet.species);
            return true;
        } else {
            Random random = new Random();
            int randomValue = random.nextInt(101); // Generate a number between 0-100
            if (pet.trickLevel > randomValue) {
                System.out.println(" I have to feed " + name + "'s " + pet.species);
                return true;
            } else {
                System.out.println("I think " + name + "'s " + pet.species + " is not hungry.");
                return false;
            }
        }
    }
    // Overriding of the toString() method
    @Override
    public String toString() {

        return "Human{name='" + name +
                "', surname='" + surname +
                "', year=" + year +
                ", iq=" + iq +
                ", mother=" + mother.name + mother.surname +
                ", father=" + father.name + father.surname +
                ", pet=" + pet +
                "}";
    }
}
