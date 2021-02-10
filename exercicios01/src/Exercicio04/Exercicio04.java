package Exercicio04;

import java.util.Scanner;

public class Exercicio04
{
    private double grausCentigrados;
    private double grausFahrenheit;
    final Scanner scanner;

    public Exercicio04()
    {
        this.scanner = new Scanner(System.in);

        getGrausCentigrados();
        converterTemperatura();
        exibirTemperaturaConvertida();
    }

    private void getGrausCentigrados()
    {
        System.out.print("Digite a temperatura em graus Centígrados: ");
        this.grausCentigrados = this.scanner.nextFloat();
    }

    private void converterTemperatura()
    {
        this.grausFahrenheit = (9 * this.grausCentigrados + 160) / 5;
    }

    private void exibirTemperaturaConvertida()
    {
        System.out.print("A temperatura convertida é: " + this.grausFahrenheit + " °F");
    }
}
