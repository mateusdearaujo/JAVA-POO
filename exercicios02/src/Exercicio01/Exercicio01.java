package Exercicio01;

import javax.swing.JOptionPane;

public class Exercicio01
{
    private int valor;

    public Exercicio01()
    {
        this.showMessageDialogInformation("Este código testará se um valor é múltiplo de 3", "Calculadora de 3");
        this.getValor();
        this.exibeResultado();
    }

    private void showMessageDialogInformation(String mensagem, String titulo)
    {
        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    private void getValor()
    {
        String input = JOptionPane.showInputDialog("Insira um valor:");
        this.valor = Integer.parseInt(input) % 3;
    }

    private void exibeResultado()
    {
        if (this.valor == 0) {
            this.showMessageDialogInformation("Este número é múltiplo de 3!", "Número múltiplo");
        } else {
            this.showMessageDialogInformation("Este número não é múltiplo de 3!", "Número não múltiplo");
        }
    }
}
