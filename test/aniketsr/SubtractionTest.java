package aniketsr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionTest {
    @Test
    public void testOperate() throws Exception {
        Operator op = new Subtraction();
        double result = op.operate(new Expression(2d), new Expression(3d));

        assertEquals(-1d, result, 0);
    }
}
