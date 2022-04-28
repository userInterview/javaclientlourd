package loizrmi;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;


public class ButtonSample {
  public static void main(String args[]) {
    Runnable runner = new Runnable() {
      public void run() {
        JFrame frame = new JFrame("Button Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Select Me");
        JLabel objJlabel = new JLabel();
        objJlabel.setText("libellé de loiz : ButtonSample");
        JLabel objJlabel2 = new JLabel();
        objJlabel2.setText("Sec libellé de loiz : ButtonSample");
        // Define ActionListener
        ActionListener actionListener = new ActionListener() {
          public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("I was selected");
          }
        };
        // Attach listeners
        button.addActionListener(actionListener);
        frame.add(button, BorderLayout.SOUTH) ; 
        frame.add(objJlabel, BorderLayout.WEST) ; 
        objJlabel2.setText("autre text") ;
        frame.add(objJlabel2 , BorderLayout.EAST) ; 
        frame.setSize(800, 600);
        frame.setVisible(true);
      }
    };
    EventQueue.invokeLater(runner);
  }
}