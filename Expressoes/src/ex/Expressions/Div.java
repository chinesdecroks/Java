package ex.Expressions;

import ex.Expression.*;

public class Div implements Expression
{
    private final Expression right;
    private final Expression left;

    public Div(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate()
    {
        return this.left.evaluate() / this.right.evaluate();
    }

    public String toString()
    {
        return String.format("(%s / %s)", this.left.evaluate(), this.right.toString());
    }
}
