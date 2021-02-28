package Exercicio01;

import javax.swing.JOptionPane;

public class Exercicio01
{
    private int primeiroNumero;
    private int segundoNumero;
    private String numerosParesConcatenados;

    public Exercicio01()
    {
        try {
            this.showMessageDialogInformation("Este programa ira mostrar os numeros pares entre os numeros informados.", "Programa");
            this.setPrimeiroNumero();
            this.setSegundoNumero();
            this.getNumerosParesConcatenados();
            this.exibeResultado();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void showMessageDialogInformation(String mensagem, String titulo)
    {
        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    private void setPrimeiroNumero()
    {
        String input = JOptionPane.showInputDialog("Insira o primeiro numero");
        this.primeiroNumero = Integer.parseInt(input);
    }

    private void setSegundoNumero()
    {
        String input = JOptionPane.showInputDialog("Insira o segundo numero");
        this.segundoNumero = Integer.parseInt(input);
    }

    private void getNumerosParesConcatenados()
    {
        String numerosPares = "";

        for (int x = this.primeiroNumero + 1; x < this.segundoNumero; x++) {
            if (x % 2 == 0) {
                numerosPares +=  x + ", ";
            }
        }

        this.numerosParesConcatenados = numerosPares.substring(0, numerosPares.length() - 2);
    }

    private void exibeResultado()
    {
        JOptionPane.showMessageDialog(null, "Os numeros pares sao: " + this.numerosParesConcatenados);
    }
}
