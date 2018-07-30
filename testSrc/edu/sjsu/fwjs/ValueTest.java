package edu.sjsu.fwjs;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValueTest {

    @Test
    public void testBoolVal() {
        BoolVal tr = new BoolVal(true);
        BoolVal tr2 = new BoolVal(true);
        assertEquals(tr, tr2);
    }

    @Test
    public void testassignVal() {
        IntVal i = new IntVal(3);
        IntVal j = new IntVal(4);
        assertEquals(i, 3);
    }

}
