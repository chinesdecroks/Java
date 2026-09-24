package bank;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Cria uma array nula que comporta os endereços dos objetos do tipo conta
        Conta[] c = new Conta[2];

        Scanner read = new Scanner(System.in);
        String ans;
        boolean answer;

        for (int i = 0; i < 2; i++)
        {
            //declara objeto para cada espaço da array
            c[i] = new Conta();

            System.out.print("Nome: ");
            c[i].nome = read.nextLine();
            System.out.print("Saldo: R$ ");
            c[i].saldo = read.nextFloat();

            read.nextLine();
            do
            {
                System.out.print("A conta eh de cliente especial(Y/N): ");
                ans = read.next();
                answer = c[i].ehClienteEspecial(ans);

            } while(!answer);

            read.nextLine();
        }

        for(int i = 0; i < 2; i++)
            System.out.println("Nome: " + c[i].nome + "\nSaldo R$" + c[i].getSaldo() + "\nCliente Especial: " + (c[i].special_cliente ? "Sim" : "Nao") + "\n");


        c[1].depositar(1000);
        c[0].sacar(1500);

        for(int i = 0; i < 2; i++)
            System.out.println("Nome: " + c[i].nome + "\nSaldo R$" + c[i].getSaldo() +
                    "\nCliente Especial: " + (c[i].special_cliente ? "Sim" : "Nao") + "\n");

        c[1].transferir(c[0], 1000);

        for(int i = 0; i < 2; i++)
            System.out.println("Nome: " + c[i].nome + "\nSaldo R$" + c[i].getSaldo() +
                    "\nCliente Especial: " + (c[i].special_cliente ? "Sim" : "Nao") + "\n");

        c[1].sacar(2500);

        for(int i = 0; i < 2; i++)
            System.out.println("Nome: " + c[i].nome + "\nSaldo R$" + c[i].getSaldo() +
                    "\nCliente Especial: " + (c[i].special_cliente ? "Sim" : "Nao") + "\n");


    }
}
