package org.example;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;
    private Family family;

    static {
        System.out.println("Class Human is being loaded");
    }

    {
        System.out.println("A new Human object is created");
    }

    //Empty constructor
    public Human() {}

    //Constructor with name, surname, and year
    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    //Constructor with name, surname, year, father, and mother
    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    //Constructor with all fields
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
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }


    //Method for greeting the pet
    public void greetPet() {
        System.out.println("Hello, " + pet.getNickname());
    }

    //Method to describe the pet
    public void describePet() {
        String slynessOfPet = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.getSpecies() + ", it is " + pet.getAge() + " years old, it is " + slynessOfPet);
    }


    public boolean feedPet(boolean timeToFeed) {
        if (timeToFeed) {
            System.out.println("Hm... I will feed " + name + "'s " + pet.getSpecies());
            return true;
        } else {
            Random random = new Random();
            int randomValue = random.nextInt(101); // Generate a number between 0-100
            if (pet.getTrickLevel() > randomValue) {
                System.out.println(" I have to feed " + name + "'s " + pet.getSpecies());
                return true;
            } else {
                System.out.println("I think " + name + "'s " + pet.getSpecies() + " is not hungry.");
                return false;
            }
        }
    }
    //Overriding of the toString(), hashcode() and equals() methods
    @Override
    public String toString() {
        return "Human{name='" + name +
                "', surname='" + surname +
                "', year=" + year +
                ", iq=" + iq +
                ", schedule="
                + Arrays.deepToString(schedule) + "}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq);
    }
}
