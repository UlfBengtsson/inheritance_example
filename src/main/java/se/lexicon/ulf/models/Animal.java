package se.lexicon.ulf.models;

public class Animal {
    //Static fields
    private static int animalCounter = 0;
    //Fields
    private int id;
    private String name;
    private double weight;
    //Constructors
    public Animal(String name, double weight)
    {
        id = ++animalCounter;
        this.name = name;
        this.weight = weight;
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
               "\nWeight: " + getWeight();
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
