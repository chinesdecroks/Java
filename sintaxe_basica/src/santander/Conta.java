package santander;

public class Conta {

    Cliente titular;
    float saldo;
    boolean special_cliente;
    //O extrato só pode ser utilizado dentro da classe Conta
    private String extrato = "";

    public Conta(float saldo)
    {
        this.saldo = saldo;
        this.salvaNoExtrato("SALDO INICIAL            ___     " + getSaldo() + "\n");
    }

    boolean ehClienteEspecial(String ans) {


        if (ans.equals("Y") || ans.equals("y")) {
            this.special_cliente = true;
            return true;
        } else if (ans.equals("N") || ans.equals("n")) {
            this.special_cliente = false;
            return true;
        } else
        {
            System.out.println("Resposta invalida. Tente novamente");
            return false;
        }
    }

    boolean sacar(float valor)
    {
        if (this.saldo >= valor || this.special_cliente)
        {
            this.saldo -= valor;
            this.salvaNoExtrato("Saque da Conta      - " + valor + "     " + getSaldo() + "\n");
            return true;
        } else
        {
            System.out.println("Falha no saque");
            return false;
        }
    }

    void depositar(float valor)
    {
        this.saldo += valor;
        this.salvaNoExtrato("Deposito na Conta      + " + valor + "     " + getSaldo() + "\n");
    }

    boolean transferir(Conta dest, float valor)
    {
        if (this.sacar(valor))
        {
            dest.depositar(valor);
            this.salvaNoExtrato("Transferencia para " + dest.titular.getNome() + "     - " + valor + "     " + this.getSaldo() + "\n");
            dest.salvaNoExtrato("Transferencia de " + this.titular.getNome() + "     + " + valor + "     " + dest.getSaldo() + "\n");
            return true;
        } else
            return false;

    }

    float getSaldo() { return this.saldo; }

    void salvaNoExtrato(String log)
    {
        this.extrato += log;
    }

    void mostraExtrato()
    {
        System.out.println("\nNome: " + this.titular.getNome() + "\t Endereco: " + this.titular.getEndereco());
        System.out.println("===============================================================================");
        System.out.println(this.extrato);
    }
}
