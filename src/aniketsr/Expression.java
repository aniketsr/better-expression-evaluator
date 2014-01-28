package aniketsr;

public class Expression {
    Double value;
    Expression leftOperand, rightOperand;
    Operator operator;

    Expression(Double value){
        this.value = value;
    }

    Expression(Expression leftOperand, Expression rightOperand, Operator operator){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public double evaluate(){
        return (value!=null)? value: operator.operate(leftOperand, rightOperand);
    }
}