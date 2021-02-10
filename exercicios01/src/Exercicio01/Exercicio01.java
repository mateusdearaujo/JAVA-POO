package Exercicio01;

import java.util.Scanner;

public class Exercicio01
{
    private String nomeProduto;
    private int valorProduto;
    private double resultado;
    final Scanner scanner;

    public Exercicio01()
    {
        this.scanner = new Scanner(System.in);

        setNomeProduto();
        setValorProduto();
        calcularDesconto();
        exibeMensagem();
    }

    private void setNomeProduto()
    {
        System.out.print("Digite o nome do Produto: ");
        this.nomeProduto = this.scanner.nextLine();
    }

    private void setValorProduto()
    {
        System.out.print("Digite o valor do produto: ");
        this.valorProduto = this.scanner.nextInt();
    }

    private void calcularDesconto()
    {
        this.resultado = valorProduto - getDesconto();
    }

    private double getDesconto()
    {
        return this.valorProduto * 0.09;
    }

    private void exibeMensagem()
    {
        System.out.print("O valor do produto " + this.nomeProduto + " com 9% de desconto é " + this.resultado);
    }
}
