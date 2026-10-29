package ex.Expressions;

import ex.Expression.*;

public class C implements Expression {
    private int valor;

    public C(int v)
    {
        this.valor = v;
    }

    @Override
    public int evaluate() { return this.valor; }

    public String toString() { return String.format("%d", this.valor); }
}
