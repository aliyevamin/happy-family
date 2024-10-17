package org.example;

public class Main {
    public static void main(String[] args) {
        // Creating of a Pet object
        String[] habits = {"eat", "drink", "sleep"};
        Pet pet = new Pet("dog", "Rock", 5, 75, habits);

        // Creating of parent Human objects
        Human father = new Human("Vito", "Karleone", 1950);
        Human mother = new Human("Jane", "Karleone", 1955);

        // Creating of a Human object with a pet and parents
        String[][] schedule = {{"Monday", "Gym"}, {"Tuesday", "Coding"}, {"Wednesday", "Meeting friends"}};
        Human human = new Human("Michael", "Karleone", 1977, 90, pet, father, mother, schedule);


        System.out.println(pet);
        System.out.println(human);

        pet.eat();
        pet.respond();
        pet.foul();


        human.greetPet();
        human.describePet();

        System.out.println(human.feedPet(false));
    }
}