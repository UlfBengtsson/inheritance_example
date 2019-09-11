package se.lexicon.ulf;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.ulf.models.Animal;

import static org.junit.Assert.*;

public class AnimalTest {

    private Animal testAnimal;
    private final String testName = "testy";
    private final double testWeight = 12.3;

    @Before
    public void initAnimal()
    {
        testAnimal = new Animal(testName, testWeight);
    }

    @After
    public void clearTestObj()
    {
        testAnimal = null;
    }

    @Test
    public void testBeforeWorks()
    {
        //Arrange
        String expectedName = testName;
        double expectedWeight = testWeight;

        //Act
        // done by @Before

        //Assert
        assertTrue(testAnimal.getId() > 0);
        assertEquals(expectedName, testAnimal.getName());
        assertEquals(expectedWeight, testAnimal.getWeight(), 0);
    }

    @Test
    public void changeName() {
        //Arrange
        String name = "Rolf";

        //Act
        testAnimal.setName(name);

        //Assert
        assertEquals(name, testAnimal.getName());
    }

    @Test
    public void changeWeight() {
        //Arrange
        double weight = 9.8;

        //Act
        testAnimal.setWeight(weight);

        //Assert
        assertEquals(weight, testAnimal.getWeight(), 0);
    }

    @Test
    public void uniqueIdGiven() {
        //Arrange
        Animal anotherAnimal = new Animal(testName,testWeight);

        //Act
        int testId = testAnimal.getId();
        int anotherId = anotherAnimal.getId();

        //Assert
        assertNotEquals(testId, anotherId);
    }

    @Test
    public void animalCounterWorks() {
        //Arrange
        int startCount = Animal.getAnimalCounter();

        //Act
        Animal anotherAnimal = new Animal(testName,testWeight);
        int currentCount = Animal.getAnimalCounter();

        //Assert
        assertTrue(startCount < currentCount);
    }

    @Test
    public void toStringHasCorrectInfo() {
        //Arrange

        //Act
        String result = testAnimal.toString();

        //Assert
        Assert.assertTrue(result.contains(testName));
        Assert.assertTrue(result.contains(String.valueOf(testWeight)));
    }


}
