import javax.swing.JOptionPane;

public class Superior
{
    protected double n1;
    protected double n2;
    protected double n3;
    protected double media;

    public void setN1()
    {
        this.n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota 1"));
    }

    public void setN2()
    {
        this.n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota 2"));
    }

    public void setN3()
    {
        this.n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a nota 3"));
    }

    public void calculaMedia()
    {
        this.media = (this.n1 * 0.35 + this.n2 * 0.5 + this.n3 * 0.15);
    }

    public void imprimirMedia()
    {
        JOptionPane.showMessageDialog(null, "Média final: " + this.media);
    }
}
