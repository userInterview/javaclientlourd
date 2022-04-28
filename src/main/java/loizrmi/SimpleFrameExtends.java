package loizrmi;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;


public class SimpleFrameExtends extends JFrame {  

private static final long serialVersionUID = -2099992968735472316L;

public SimpleFrameExtends() {
	
    JButton button = new JButton("Select Me");       
    JLabel objJlabel = new JLabel();        
    objJlabel.setText("libellé de loiz: SimpleFrameExtends") ; 
    JPanel panel = new JPanel(new BorderLayout()) ;            
    panel.add(objJlabel, BorderLayout.CENTER)     ; 
    panel.add(button, BorderLayout.SOUTH) ; 
    add(panel) ;  
    setSize(800, 600);
    setVisible(true);
}



}