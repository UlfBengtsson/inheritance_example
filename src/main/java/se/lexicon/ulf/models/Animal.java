package se.lexicon.ulf.models;

public class Animal {
    //Static fields
    private static int animalCounter = 0;
    //Fields
    private int id;
    private String name;
    private double whigt;
    //Constructors
    public Animal(String name, double whigt)
    {
        id = ++animalCounter;
        this.name = name;
        this.whigt = whigt;
    }
    //Behaviors
    public void eat()
    {
        System.out.println(name + " eats");
    }

    @Override
    public String toString()
    {
        return "Id: " + getId() +
                "\nName: " + getName() +
                "\nWhigt: " + getWhigt();
    }

    //Getters & Setters
    public static int getAnimalCounter()
    {
        return animalCounter;
    }

    public int getId()
    {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWhigt() {
        return whigt;
    }

    public void setWhigt(double whigt) {
        this.whigt = whigt;
    }
}
