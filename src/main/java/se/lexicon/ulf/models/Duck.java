package se.lexicon.ulf.models;

public class Duck extends Animal
{
    private String color;

    public Duck(String name, double weight, String fetherColor) {
        super(name, weight);

        color = fetherColor;
    }

    public void makeNoise()
    {
        System.out.println("Qqquuuuuaaaaacccccckkkkkkk!!!!!!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat()
    {
        System.out.println(getName() + " the " + color + " duck is picking at the breadcrumb");
    }
}
