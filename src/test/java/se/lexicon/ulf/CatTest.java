package se.lexicon.ulf;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.ulf.models.Cat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class CatTest
{
    private Cat testCat;
    private final String testName = "testy";
    private final double testWeight = 2.1;
    private final String testBreed = "testBreed";
    private final String testFur = "testFur";

    @Before
    public void initAnimal()
    {
        testCat = new Cat(testName, testWeight, testBreed, testFur);
    }

    @After
    public void clearTestObj()
    {
        testCat = null;
    }

    @Test
    public void testBeforeWorks()
    {
        //Arrange
        String expectedName = testName;
        double expectedWeight = testWeight;
        String expectedBreed = testBreed;
        String expectedFur = testFur;

        //Act
        // done by @Before

        //Assert
        assertTrue(testCat.getId() > 0);
        assertEquals(expectedName, testCat.getName());
        assertEquals(expectedWeight, testCat.getWeight(), 0);
        assertEquals(expectedBreed, testCat.getBreed());
        assertEquals(expectedFur, testCat.getFur());
    }

    @Test
    public void setTestBreed() {
        //Arrange
        String breed = "Mixed";

        //Act
        testCat.setBreed(breed);

        //Assert
        assertEquals(breed, testCat.getBreed());
    }

    @Test
    public void setTestFur() {
        //Arrange
        String fur = "short hair";

        //Act
        testCat.setFur(fur);

        //Assert
        assertEquals(fur, testCat.getFur());
    }

    @Test
    public void informationContainsData() {

        //Act
        String result = testCat.Information();

        //Assert
        assertTrue(result.contains(testBreed));
        assertTrue(result.contains(testFur));
        assertTrue(result.contains(String.valueOf(testWeight)));
        assertTrue(result.contains(testName));
    }
}
