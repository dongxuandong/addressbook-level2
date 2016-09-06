package seedu.addressbook.common;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;


public class UtilsTest {
    
    /**
     * Test Utils isAnyNull method
     */
    
    @Test
    public void IsAnyNull_isTrue() {
        Object[] testData1_true = {null,null,null,null,null};
        assertTrue("Return true when all are nulls",Utils.isAnyNull(testData1_true));       
    }
    
    @Test
    public void IsAnyNull_isFalse(){
        Object[] testData2_false = {null,1,null};
        assertFalse("Return false as there exists an integer",Utils.isAnyNull(testData2_false));
    }
    
    /**
     * Test elementsAreUnique method
     */
    
    @Test
    public void elementsAreUnique_isTrue(){
        ArrayList<Integer> testData3_true = new ArrayList<Integer>();
        testData3_true.add(0);
        testData3_true.add(1);
        testData3_true.add(2);
        assertTrue("all elements are unique",Utils.elementsAreUnique(testData3_true));    
    }
    
    @Test
    public void elementsAreUnique_isFalse(){
        ArrayList<Integer> testData4_false = new ArrayList<Integer>();
        testData4_false.add(0);
        testData4_false.add(1);
        testData4_false.add(0);
        assertFalse("repeated elements",Utils.elementsAreUnique(testData4_false));
    }
      
    

}
