package aniketsr;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {
    @Test
    public void testEvaluate() throws Exception {
        Expression expression = new Expression(new Expression(10.0), new Expression(40.0), new Addition());

        assertEquals(50.0, expression.evaluate());
    }
}
