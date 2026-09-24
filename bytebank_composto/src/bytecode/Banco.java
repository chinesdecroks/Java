package bytecode;
import java.util.ArrayList;
import java.util.Random;

public class Banco {
    String bankName;
    ArrayList<Conta> contas;
    private Random random = new Random();
    private int rand = random.nextInt(100);

    public Banco()
    {
        this.bankName = "Bank@" + rand;
        this.contas = new ArrayList<Conta>();
    }

    public Banco(String name)
    {
        this.bankName = name;
        this.contas = new ArrayList<Conta>();
    }

    public Banco(String name, ArrayList<Conta> contas)
    {
        this.bankName = name;
        if (contas == null)
            this.contas = new ArrayList<Conta>();
        else
            this.contas = contas;
    }

    public void addConta(Conta fulano) { this.contas.add(fulano); }

}
