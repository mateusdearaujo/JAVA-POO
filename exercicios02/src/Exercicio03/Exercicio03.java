package Exercicio03;

import javax.swing.JOptionPane;

public class Exercicio03
{
    private float valorProduto;
    private float valorProdutoComDesconto;

    public Exercicio03()
    {
        this.setValorProduto();
        this.calculaDesconto();
        this.exibeResultado();
    }

    private void setValorProduto()
    {
        String input = JOptionPane.showInputDialog("Insira o valor do produto");
        this.valorProduto = Float.parseFloat(input);
    }

    private void calculaDesconto()
    {
        if (this.valorProduto < 20) {
            this.valorProdutoComDesconto = (float) (this.valorProduto + this.valorProduto * 0.45);
        } else {
            this.valorProdutoComDesconto = (float) (this.valorProduto + this.valorProduto * 0.35);
        }
    }

    private void exibeResultado()
    {
        JOptionPane.showMessageDialog(null, "O valor final final do produto é de " + this.valorProdutoComDesconto);
    }
}
