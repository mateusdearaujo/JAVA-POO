package Exercicio04;

import javax.swing.*;

public class Exercicio04
{
    private double grau;

    public void setGrau()
    {
        String input = JOptionPane.showInputDialog("Digite o grau");
        this.grau = Double.parseDouble(input);;
    }

    private double getRadiano()
    {
        return this.grau * Math.PI / 180;
    }

    public void exibeRadiano()
    {
        String mensagem = "O grau convertido em radianos: " + this.getRadiano();
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
