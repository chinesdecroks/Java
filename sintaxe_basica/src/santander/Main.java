package santander;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcao;
        float v; //variável temporária para receber da leitura

        //Conta 1
        Cliente c1 = new Cliente("Lucas", "Bairro Brasil", 1340);
        c1.contaCorrente.titular = c1;

        //Conta 2
        Cliente c2 = new Cliente("Carlos", "Bairro Umuarama", 5060);
        c2.contaCorrente.titular = c2;

        Scanner read = new Scanner(System.in);

        do
        {

            System.out.println("Digite dois numerais: 1° -> n° da conta (1|2) eo 2° -> funcionalidades abaixo");
            System.out.println("[0] - Sair\n[1] - Depositar\n[2] - Sacar\n[3] - Transferir para outra conta\n[4] - Imprimir Extrato");
            System.out.print("Escolha: ");

            opcao = read.nextInt();

            switch (opcao)
            {
                case 0:
                    System.out.println("Saindo");
                    break;
                case 11:
                    System.out.print("Deposito: R$");
                    v = read.nextFloat();
                    c1.contaCorrente.depositar(v);
                    break;
                case 12:
                    System.out.print("Saque: R$");
                    v = read.nextFloat();
                    c1.contaCorrente.sacar(v);
                    break;
                case 13:
                    System.out.print("Transferencia: R$");
                    v = read.nextFloat();
                    c1.contaCorrente.transferir(c2.contaCorrente, v);
                    break;
                case 14:
                    c1.contaCorrente.mostraExtrato();
                    break;
                case 21:
                    System.out.print("Deposito: R$");
                    v = read.nextFloat();
                    c2.contaCorrente.depositar(v);
                    break;
                case 22:
                    System.out.print("Saque: R$");
                    v = read.nextFloat();
                    c2.contaCorrente.sacar(v);
                    break;
                case 23:
                    System.out.print("Transferencia: R$");
                    v = read.nextFloat();
                    c2.contaCorrente.transferir(c1.contaCorrente, v);
                    break;
                case 24:
                    c2.contaCorrente.mostraExtrato();
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente!");

            }
        } while(opcao != 0);


    }

}
