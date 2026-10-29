package ex.Expressions;
import ex.Expression.*;

public class Negate implements Expression
{
    private final Expression e;

    public Negate(Expression e)
    {
        this.e = e;
    }

    @Override
    public int evaluate()
    {
        return (-this.e.evaluate());
    }

    public String toString()
    {
        return String.format("(- %s)", this.e.toString());
    }
}
