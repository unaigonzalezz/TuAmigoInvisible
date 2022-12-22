import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AmigoInvisibleGUI extends JFrame {
    private JTextField nombre5;
    private JTextField nombre4;
    private JButton sortearButton;
    private JPanel Panel;
    private JTextField nombre1;
    private JTextField nombre2;
    private JTextField nombre3;
    private JButton AboutMe;


    public AmigoInvisibleGUI() {
        sortearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String persona1 = nombre1.getText();
                String persona2 = nombre2.getText();
                String persona3 = nombre3.getText();
                String persona4 = nombre4.getText();
                String persona5 = nombre5.getText();
                Random r = new Random();
                int numeros [] = {0,1,2,3,4};
                for (int i=0; i<numeros.length; i++) {
                    int posAleatoria = r.nextInt(numeros.length);
                    int temp = numeros[i];
                    numeros[i] = numeros[posAleatoria];
                    numeros[posAleatoria] = temp;
                }
                String personas [] = {persona1, persona2, persona3, persona4, persona5};
                JOptionPane.showMessageDialog(sortearButton, "A " + persona1 + " le ha tocado el número " + numeros[0] + " que es " + personas[numeros[0]] + ".");
                JOptionPane.showMessageDialog(sortearButton, "A " + persona2 + " le ha tocado el número " + numeros[1] + " que es " + personas[numeros[1]] + ".");
                JOptionPane.showMessageDialog(sortearButton, "A " + persona3 + " le ha tocado el número " + numeros[2] + " que es " + personas[numeros[2]] + ".");
                JOptionPane.showMessageDialog(sortearButton, "A " + persona4 + " le ha tocado el número " + numeros[3] + " que es " + personas[numeros[3]] + ".");
                JOptionPane.showMessageDialog(sortearButton, "A " + persona5 + " le ha tocado el número " + numeros[4] + " que es " + personas[numeros[4]] + ".");

            }
        });
        AboutMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sortearButton, "Unai González© 2022\nhttps://unaigonzalez.es");
            }
        });
    }

    public static void main(String[] args) {
        AmigoInvisibleGUI h = new AmigoInvisibleGUI();
        h.setContentPane(h.Panel);
        h.setTitle("TuAmigoInvisible");
        h.setSize(800, 350);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}





