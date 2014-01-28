package aniketsr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {
    @Test
    public void testOperate() throws Exception {
        Operator op = new Division();
        double result = op.operate(new Expression(6d), new Expression(3d));

        assertEquals(2d, result, 0);
    }
}
