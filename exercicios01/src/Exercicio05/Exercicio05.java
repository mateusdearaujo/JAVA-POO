package Exercicio05;

import java.util.Scanner;

public class Exercicio05
{
    private float altura;
    private float raio;
    private double volume;
    final Scanner scanner;

    public Exercicio05()
    {
        this.scanner = new Scanner(System.in);

        setAltura();
        setRaio();
        calcularVolume();
        exibirVolume();
    }

    private void setAltura()
    {
        System.out.print("Informe a altura da lata\n");
        this.altura = this.scanner.nextFloat();
    }

    private void setRaio()
    {
        System.out.print("Informe o raio da circunferência da lata\n");
        this.raio = this.scanner.nextFloat();
    }

    private void calcularVolume()
    {
        this.volume = 3.14159 * (this.raio * this.raio) * this.altura;
    }

    private void exibirVolume()
    {
        System.out.print("O volume da lata é: " + this.volume);
    }
}
