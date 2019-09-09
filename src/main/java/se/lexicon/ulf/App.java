package se.lexicon.ulf;

import se.lexicon.ulf.models.Animal;

public class App 
{
    public static void main( String[] args )
    {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Zappy", 3.5);
        animals[1] = new Animal("Scoby", 12.5);
        animals[2] = new Animal("Findus", 2.3);

        for (int index = 0; index < animals.length; index++)
        {
            System.out.println(animals[index]);
        }
    }
}
