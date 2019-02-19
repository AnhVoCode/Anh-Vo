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
        assertFalse(testSet.contain(1));
        //Insert the number
        testSet.insert(1);
        //Check if the number is in the set
        assertEquals(testSet.size(),1);
        assertTrue(testSet.contain(2));
    }

    public void testInsertAlreadyThere(){
        //Check if the number is there
        assertEquals(testSet.size(),1);
        assertTrue(testSet.contain(2));
        //
        //The size of the set remains the same
        assertEquals(testSet.size(),1);

    }


}
