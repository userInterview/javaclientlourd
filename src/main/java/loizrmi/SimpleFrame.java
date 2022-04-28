package loizrmi;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;


public class SimpleFrame {
  public static void main(String args[]) {

        JFrame frame = new JFrame("Button Sample");
        JButton button = new JButton("Select Me");       
        JLabel objJlabel = new JLabel();        
        objJlabel.setText("libellé de loiz: SimpleFrame");       
        //frame.add(button, BorderLayout.SOUTH) ; 
        
        JPanel panel = new JPanel(new BorderLayout());            
        panel.add(objJlabel, BorderLayout.CENTER)     ; 
        panel.add(button, BorderLayout.SOUTH)     ; 
        frame.add(panel) ; 
        //frame.add(objJlabel, BorderLayout.CENTER) ; 
        frame.setSize(800, 600);
        frame.setVisible(true);
      
  }
}