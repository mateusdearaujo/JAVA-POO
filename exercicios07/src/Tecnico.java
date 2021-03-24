import javax.swing.JOptionPane;

public class Tecnico extends Superior
{
    @Override
    public void calculaMedia()
    {
        this.media = (this.n1 + this.n2 * 2 + this.n3 * 2) / 5;
    }

    @Override
    public void setN1()
    {
        this.n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota do 1º trimestre do Tecnico"));
    }

    @Override
    public void setN2()
    {
        this.n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota do 2º trimestre do Tecnico"));
    }

    @Override
    public void setN3()
    {
        this.n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota do 3º trimestre do Tecnico"));
    }
}
