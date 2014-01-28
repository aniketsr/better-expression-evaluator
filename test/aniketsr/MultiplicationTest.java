package aniketsr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {
    @Test
    public void testOperate() throws Exception {
        Operator subject = new Multiplication();
        double result = subject.operate(new Expression(2d), new Expression(3d));

        assertEquals(6d, result,0);
    }
}
