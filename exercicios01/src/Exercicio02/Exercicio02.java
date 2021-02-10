package Exercicio02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio02
{
    private double salarioMinimo;
    private double salarioPessoa;
    private double resultado;
    final Scanner scanner;

    public Exercicio02()
    {
        this.scanner = new Scanner(System.in);

        setSalarioMinimo();
        setSalarioPessoa();
        calcularQtdSalarioMinimo();
        exibeResultado();
    }

    private void setSalarioMinimo()
    {
        System.out.print("Digite o valor do salário mínimo: ");
        this.salarioMinimo = this.scanner.nextDouble();
    }

    private void setSalarioPessoa()
    {
        System.out.print("Digite o seu salário atual: ");
        this.salarioPessoa = this.scanner.nextDouble();
    }

    private void calcularQtdSalarioMinimo()
    {
        this.resultado = this.salarioPessoa / this.salarioMinimo;
    }

    private void exibeResultado()
    {
        if ( this.resultado > 1 ) {
            System.out.print("Você ganha " + formatarNumero(this.resultado) + " salários mínimos!");
        } else {
            System.out.print("Você ganha " + formatarNumero(this.resultado) + " salário mínimo!");
        }
    }

    private String formatarNumero(double resultado)
    {
        DecimalFormat formatador = new DecimalFormat("0.00");

        return formatador.format(resultado);
    }

}
