package se.lexicon.ulf.models;

public class Cat extends Animal
{
    private String breed;
    private String fur;

    public Cat(String name, double weight, String breed, String fur) {
        super(name, weight);//Call parent class constructor (must be done on the first line in a constructor)

        this.breed = breed;
        this.fur = fur;
    }

    public String Information()
    {
        StringBuilder infoString = new StringBuilder();

        infoString.append("-- Info --").append('\n');
        infoString.append("Name: ").append(getName()).append('\n');
        infoString.append("Breed: ").append(breed).append('\n');
        infoString.append("Weight: ").append(getWeight()).append('\n');
        infoString.append("Fur type: ").append(fur).append('\n');
        infoString.append("----------").append('\n');

        return infoString.toString();
    }

    @Override
    public void eat()
    {
        System.out.println( getName() + " the cat eats a fish.");
    }
}
