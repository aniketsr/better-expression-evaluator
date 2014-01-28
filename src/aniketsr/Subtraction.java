package aniketsr;

public class Subtraction implements Operator {
    @Override
    public double operate(Expression right, Expression left) {
        return right.evaluate() - left.evaluate();
    }
}