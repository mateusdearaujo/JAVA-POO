package Exercicio02;

import javax.swing.*;
import java.util.ArrayList;

public class Exercicio02
{
    private ArrayList<Integer> notas = new ArrayList<Integer>();
    private int quantidadeNotas;
    private int contador = 1;

    public Exercicio02(int quantidadeNotas)
    {
        this.quantidadeNotas = quantidadeNotas;
        this.setNotas();
    }

    private void setNotas()
    {
        while(this.quantidadeNotas > 0) {
            this.notas.add(this.getNota());
            this.quantidadeNotas--;
        }
    }

    private Integer getNota()
    {
        String input = JOptionPane.showInputDialog("Digite a nota " + this.contador);
        this.contador++;
        return Integer.parseInt(input);
    }

    public void exibeMedia()
    {
        double somaNotas = this.getSomasNotas();
        Number media = somaNotas / this.notas.size();
        String mensagem = "A media das notas: " + media;
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private double getSomasNotas()
    {
        double sum = 0;
        for(int i = 0; i < this.notas.size(); i++)
            sum += this.notas.get(i);
        return sum;
    }
}
