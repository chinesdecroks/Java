package Main;
import ex.Expression.*;
import ex.Expressions.*;


public class Main {

    public static void main(String[] args) {
        C c1 = new C(3);
        C c2 = new C(8);
        Add a1 = new Add(c1, c2);

        C c3 = new C(7);
        C c4 = new C(4);
        Mul m1 = new Mul(c3, c4);
        Negate n1 = new Negate(m1);

        Sub s1 = new Sub(a1, n1);

        System.out.print(a1.toString());
        System.out.println(" = " + a1.evaluate() + "\n");

        System.out.print(n1.toString());
        System.out.println(" = " + n1.evaluate() + "\n");

        System.out.print(s1.toString());
        System.out.println(" = " + s1.evaluate() + "\n");

    }
}
