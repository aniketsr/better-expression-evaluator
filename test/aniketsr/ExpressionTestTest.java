package aniketsr;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExpressionTestTest {
    @Test
    public void testTestEvaluate() throws Exception {
        Operator op = new Addition();
        double result = op.operate(new Expression(2.0), new Expression(3.0));

        assertEquals(5.0, result,0);
    }
}
