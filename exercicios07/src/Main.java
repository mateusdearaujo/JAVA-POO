import javax.swing.JOptionPane;

class Main
{
    public static void main(String[]args)
    {
        try {
            executeSuperior();
            executeTecnico();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private static void executeSuperior()
    {
        Superior superior = new Superior();
        superior.setN1();
        superior.setN2();
        superior.setN3();
        superior.calculaMedia();
        superior.imprimirMedia();
    }

    private static void executeTecnico()
    {
        Tecnico tecnico = new Tecnico();
        tecnico.setN1();
        tecnico.setN2();
        tecnico.setN3();
        tecnico.calculaMedia();
        tecnico.imprimirMedia();
    }
}
