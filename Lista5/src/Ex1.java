import javax.swing.JOptionPane;

public class Ex1 {

    public static void main(String[] args) {
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite um nome ");
        }

        System.out.println("Os nomes digitados foram:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
