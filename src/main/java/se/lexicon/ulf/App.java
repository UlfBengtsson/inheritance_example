package se.lexicon.ulf;

import se.lexicon.ulf.models.Animal;
import se.lexicon.ulf.models.Cat;
import se.lexicon.ulf.models.Duck;

public class App 
{
    public static void main( String[] args )
    {
        Animal[] animals = new Animal[3];
        animals[0] = new Duck("Zappy", 3.5, "White");
        animals[1] = new Animal("Scoby", 12.5);
        animals[2] = new Cat("Findus", 2.3, "Skogskatt","longhair");

        for (int index = 0; index < animals.length; index++)
        {
            if (animals[index] instanceof Cat)//ask animal one if it is a cat
            {
                System.out.println( ( (Cat)animals[index] ).Information() );//treat animal one as a cat with type cast
            }

            if (animals[index] instanceof Duck)
            {
                ((Duck)animals[index]).makeNoise();
            }
            animals[index].eat();
        }
        /*
        for (Animal one : animals)//Foreach
        {
            if (one instanceof Cat)//ask animal one if it is a cat
            {
                System.out.println( ( (Cat)one ).Information() );//treat animal one as a cat with type cast
            }
        }
        */
    }
}
