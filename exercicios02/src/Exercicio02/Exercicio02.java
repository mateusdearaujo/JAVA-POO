package Exercicio02;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Exercicio02
{
    private final ArrayList<Integer> valores = new ArrayList<>();
    private String valoresConcatenados;

    public Exercicio02()
    {
        this.getValores(3);
        this.concatenaValores();
        this.exibeResultado();
    }

    private void getValores(int limite)
    {
        for (int i = 0; i < limite; i++){
            String valor = JOptionPane.showInputDialog("Insira um valor:");
            this.valores.add(Integer.parseInt(valor));
        }
    }

    private void concatenaValores()
    {
        Collections.sort(this.valores);
        this.valoresConcatenados = this.valores.stream()
            .map(Object::toString)
            .collect(Collectors.joining(", "));
    }

    private void exibeResultado()
    {
        JOptionPane.showMessageDialog(null, "Os valores em ordem crescente são: " + this.valoresConcatenados);
    }
}
