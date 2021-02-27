package Exercicio04;

import javax.swing.JOptionPane;

public class Exercicio04
{
    public Exercicio04()
    {
        String valorS = JOptionPane.showInputDialog("Insira a sua idade:");
        float valorN = Integer.parseInt(valorS);

        if (valorN < 16) {
            this.showMessageDialog("Não-eleitor");
        }
        if (valorN >= 18 && valorN <= 65){
            this.showMessageDialog("Eleitor Obrigatório");
        }
        if (valorN >= 16 && valorN < 18 || valorN > 65){
            this.showMessageDialog("Eleitor Facultativo");
        }
    }

    private void showMessageDialog(String mensagem)
    {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
