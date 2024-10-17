package org.example;

import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;

    // Emoty constructor
    public Pet() {}

    // Constructor with species and nickname
    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    // Constructor with all fields
    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    // Method displays a message 'I am eating'
    public void eat() {
        System.out.println("I am eating");
    }

    // method displays a message 'Hello, owner. I am - [the name of the pet]. I miss you!'
    public void respond() {
        System.out.println("Hello, owner. I am - " + nickname + ". I miss you!");
    }

    // method displays a message 'I need to cover it up'
    public void foul() {
        System.out.println("I need to cover it up");
    }

    // Overriding of the toString() method
    @Override
    public String toString() {
        return species + "{nickname='" + nickname +
                "', age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                "}";
    }
}
