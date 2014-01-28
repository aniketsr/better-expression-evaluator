package aniketsr;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {
    @Test
    public void testOperate() throws Exception {
        Operator subject = new Addition();
        double result = subject.operate(new Expression(2d), new Expression(3d));

        assertEquals(5d, result,0);
    }
}
