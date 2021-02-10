package Exercicio03;

import java.util.Scanner;

public class Exercicio03
{
    private float valor1;
    private float valor2;
    private float resultado;
    final Scanner scanner;

    public Exercicio03()
    {
        this.scanner = new Scanner(System.in);

        getPrimeiroValor();
        getSegundoValor();
        calculaMedia();
        exibeResultado();
    }

    private void getPrimeiroValor()
    {
        System.out.print("Digite o primeiro valor: ");
        setValor1(this.scanner.nextFloat());
    }

    private void getSegundoValor()
    {
        System.out.print("Digite o segundo valor: ");
        setValor2(this.scanner.nextFloat());
    }

    private void calculaMedia()
    {
        this.resultado = (this.valor1 + this.valor2) / 2;
    }

    private void exibeResultado()
    {
        System.out.print("A média entre os valores é: " + this.resultado);
    }

    private void setValor1(float valor1)
    {
        this.valor1 = valor1;
    }

    private void setValor2(float valor2)
    {
        this.valor2 = valor2;
    }
}
