package sintaxe_basica;

public class Imc
{
    //Properties of the class
    String nome;
    float altura;
    float peso;

    //Functions or methods of the class
    float calcularIMC ()
    {
        return peso / (altura*altura);
    }

    String avaliaIMC ()
    {
        float imc = calcularIMC();
        String avalia;

        if (imc < 0)
            avalia = "IMC invalido";
        else if (imc < 18.5)
            avalia = "Abaixo do peso";
        else if (imc < 25)
            avalia = "Peso normal";
        else if (imc < 30)
            avalia = "Sobrepeso";
        else if (imc < 35)
            avalia = "Obesidade grau I";
        else if (imc < 40)
            avalia = "Obesidade grau II";
        else
            avalia = "Obesidade grau III";

        return avalia;
    }
}
