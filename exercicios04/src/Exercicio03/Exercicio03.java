package Exercicio03;

import javax.swing.*;

public class Exercicio03
{
    private int primeiroNumero;
    private int segundoNumero;

    public void setPrimeiroNumero()
    {
        String input = JOptionPane.showInputDialog("Digite o primeiro numero");
        this.primeiroNumero = Integer.parseInt(input);
    }

    public void setSegundoNumero()
    {
        String input = JOptionPane.showInputDialog("Digite o segundo numero");
        this.segundoNumero = Integer.parseInt(input);
    }

    public void exibeResultado()
    {
        String mensagem = "O produto dos numeros informados: " + (this.primeiroNumero * this.segundoNumero);
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
