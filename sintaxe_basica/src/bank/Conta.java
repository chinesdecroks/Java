package bank;
import java.util.Scanner;
/*Faça um programa que modele o conceito de conta corrente.
Uma conta corrente tem o nome do cliente, o saldo e se é cliente especial ou não.
Em uma conta corrente você pode depositar um valor, retirar um valor, transferir um valor para outra conta corrente, retornar o valor do saldo.
Faça um main de teste que crie duas contas correntes diferentes, e faça um depósito, uma retirada, e uma transferência.
Teste o fato de que clientes especiais podem ter saldo negativo. Clientes não especiais não podem ter uma retirada ou transferência maior que o saldo.

Em anexo segue um exemplo similar ao que terão que fazer. O exemplo trata sobre produtos e vendas de produtos, o que é similar ao conceito de contas de banco.

Entregue um PDF com o código escrito e print da tela de execução.*/

public class Conta
{
    String nome;
    float saldo;
    boolean special_cliente;

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
            return true;
        } else
        {
            System.out.println("Falha no saque");
            return false;
        }
    }

    void depositar(float valor) { this.saldo += valor; }

    boolean transferir(Conta dest, float valor)
    {
        if (this.sacar(valor))
        {
            dest.depositar(valor);
            return true;
        } else
            return false;

    }

    float getSaldo() { return this.saldo; }

}
