package se.lexicon.ulf;

import se.lexicon.ulf.models.Animal;
import se.lexicon.ulf.models.Cat;

public class App 
{
    public static void main( String[] args )
    {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Zappy", 3.5);
        animals[1] = new Animal("Scoby", 12.5);
        animals[2] = new Cat("Findus", 2.3, "Skogskatt","longhair");

        for (int index = 0; index < animals.length; index++)
        {
            animals[index].eat();
        }

        for (Animal one : animals)//Foreach
        {
            if (one instanceof Cat)//ask animal one if it is a cat
            {
                System.out.println( ( (Cat)one ).Information() );//treat animal one as a cat with type cast
            }
        }

    }
}
