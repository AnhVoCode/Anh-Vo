import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntegerSetTest {
    IntegerSet testSet;

    @Before
    public void setup(){
        testSet = new IntegerSet();
    }

    @Test
    public void testInsertNotThere(){
        //Check if the number not there
        assertEquals(testSet.size(),0);
        assertFalse(testSet.contain(2));
        //Insert the number
        testSet.insert(2);
        //Check if the number is in the set
        assertEquals(testSet.size(),1);
        assertTrue(testSet.contain(2));
    }

    @Test
    public void testInsertAlreadyThere(){
        //Check if the number is there
        assertEquals(1,testSet.size());
        assertTrue(testSet.contain(2));
        //The size of the set remains the same, number not insert
        assertEquals("The number is not there",testSet.size(),1);
    }

    @Test
    public void testRemoveNum(){
        //Check if the number is there
        assertEquals(testSet.size(),1);
        assertTrue(testSet.contain(2));
        //Remove the number
        testSet.remove(2);
        //Check if the number is removed
        assertEquals(testSet.size(),0);
        assertFalse(testSet.contain(2));
    }
    @Test
    public void testRemoveNumNotThere(){
        //Check if the number not there
        assertEquals(testSet.size(),0);
        assertFalse(testSet.contain(2));
        //The size remain the same, no removing
        assertEquals("The number is not there",testSet.size(),0);
    }

}
