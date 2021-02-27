package Exercicio05;

import javax.swing.JOptionPane;

public class Exercicio05
{
    private final String nome;

    public Exercicio05()
    {
        this.nome = JOptionPane.showInputDialog("Insira o seu nome:");
        String input = JOptionPane.showInputDialog("Insira a sua idade:");
        float idade = Integer.parseInt(input);

        if (idade <= 10) {
            this.showMessageDialog(" pagará 30,00");
        }
        if (idade > 10 && idade <= 29){
            this.showMessageDialog(" pagará 60,00");
        }
        if (idade > 29 && idade <= 45){
            this.showMessageDialog(" pagará 120,00");
        }
        if (idade > 45 && idade <= 59){
            this.showMessageDialog(" pagará 150,00");
        }
        if (idade > 59 && idade <= 65){
            this.showMessageDialog(" pagará 250,00");
        }
        if (idade > 65){
            this.showMessageDialog(" pagará 4000,00");
        }
    }

    private void showMessageDialog(String mensagem)
    {
        JOptionPane.showMessageDialog(null, this.nome + mensagem);
    }
}
