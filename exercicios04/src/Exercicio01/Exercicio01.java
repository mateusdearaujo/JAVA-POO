package Exercicio01;

import javax.swing.*;

public class Exercicio01
{
    private int numero;

    public Exercicio01()
    {
        String input = JOptionPane.showInputDialog("Insira o numero:");
        this.numero = Integer.parseInt(input);
    }

    public void exibeDobro()
    {
        String mensagem = "O dobro do numero informado: " + (this.numero * 2);
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
