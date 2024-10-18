package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    static {
        System.out.println("Class Pet is being loaded");
    }

    {
        System.out.println("A new Pet object is created");
    }

    //Emoty constructor
    public Pet() {}

    //Constructor with species and nickname
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

    //getters and setters
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }


    //Method displays a message 'I am eating'
    public void eat() {
        System.out.println("I am eating");
    }

    //method displays a message 'Hello, owner. I am - [the name of the pet]. I miss you!'
    public void respond() {
        System.out.println("Hello, owner. I am - " + nickname + ". I miss you!");
    }

    //method displays a message 'I need to cover it up'
    public void foul() {
        System.out.println("I need to cover it up");
    }

    //Overriding of the toString(), equals() and hashcode methods
    @Override
    public String toString() {
        return species + "{nickname='" + nickname +
                "', age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                "}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel);
    }
}
