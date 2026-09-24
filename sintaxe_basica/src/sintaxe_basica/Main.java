package sintaxe_basica;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("################### IMC Calculator ####################");
        Imc calculator = new Imc();
        Scanner read = new Scanner(System.in);

        System.out.print("Nome: ");
        calculator.nome = read.nextLine();
        System.out.print("Peso: ");
        calculator.peso = read.nextFloat();
        System.out.print("Altura: ");
        calculator.altura = read.nextFloat();

        System.out.println("\n" + calculator.nome);
        System.out.println("O seu IMC eh " + calculator.calcularIMC());
        System.out.println("Voce esta com: " + calculator.avaliaIMC());
    }
}
