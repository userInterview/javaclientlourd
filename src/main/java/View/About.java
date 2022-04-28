package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Vector;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class About extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public Timer timer;
	private int y = 1000,x=0;
	private Vector<String> text;
	private Vector<Image> img;
	
	public About() {
		
		img = new Vector<>();
		
		img.add(Manager.getImg("/img/background10.jpg"));
		img.add(Manager.getImg("/img/fsdm.png"));
		img.add(Manager.getImg("/img/usmba.png"));
		img.add(Manager.getImg("/img/contact_us.png"));
		img.add(Manager.getImg("/img/el_khou1.png"));
		
		text = new Vector<>();

		text.add("               ** About Us **");
		text.add(" ");
		text.add("Le travail pr�sent� dans cette application a �t� effectu� dans le cadre");
		text.add("de Projet de Module POO avanc�e (JEE) de Master WISD Semestre 1, 2019)");
		text.add("� la facult� des sciences Dhar El  Mehraz FSDM, Fes.");
		text.add("");
		text.add("Nous sommes des �tudiants en FSDM,"); //
		text.add("1 er ann�es Master WISD ");
		text.add("");
		text.add("Mohammed EL KHOU   ,  CIN :  1513784799");
		text.add("Email : m.elkhou@hotmail.com");
		text.add("            mohammed.elkhou1@usmba.ac.ma");
		text.add("T�l   :   0614585293");
		text.add("");
		text.add("");
		text.add("Encadrant   :   M. Ali YAHYAOUY");
		text.add("");
		text.add("                                                 - - - -");
		text.add("");
		text.add("         ** Remerciement **");
		text.add("");
		text.add("Au terme de ce projet, Nous tenons � exprimer notre profonde ");
		text.add("gratitude et notre immense respect � notre Professeur Monsieur");
		text.add("Ali YAHYAOUY, Professeur  en informatique � la facult�");
		text.add("des sciences Dhar El Mehraz pour sa disponibilit�, ses avis  ");
		text.add("�clair�s, et ses conseils judicieux. Nos vifs remerciements");
		text.add("accompagn�s de toute notre gratitude s'adressent �galement � ");
		text.add("tous nos professeurs qui ont gard� un �il attentif sur, ");
		text.add("donnant toujours des remarques ");
		text.add("le d�roulement tr�s constructives ainsi pour la confiance qu�ils");
		text.add("nous ont fait .Nous  tenons � exprimer notre plaisir de travailler");
		text.add("sous leurs directives.");
		text.add("");
		text.add("    A Nos Tr�s Chers Parents");
		text.add("Tous les mots du monde ne sauraient exprimer l�immense amour ");
		text.add("que nous portons pour vous, ni la profonde gratitude que nous");//
		text.add("vous t�moignons pour vous pour tous les efforts et les ");
		text.add("sacrifices que vous avez fournis � fin de nous garantir une ");
		text.add("bonne  instruction. C�est � travers vos encouragements et vos ");//
		text.add("critiques que nous nous sommes r�alis�s. Nous esp�rons avoir ");//
		text.add("r�pondu aux espoirs que vous avez fond�s en nous. Nous vous ");//
		text.add("rendons hommage par ce modeste travail en guise de notre  ");
		text.add("reconnaissance �ternelle et de notre amour infini . ");
		text.add("Que Dieu tout puissant vous garde et vous procure la sant�, ");
		text.add("le bonheur et la longue vie pour que vous demeuriez le flambeau ");
		text.add("illuminant notre chemin.");
		text.add("       Nous d�dions aussi ce travail � nos familles");
		text.add("et � tous nos professeurs de la FSDM");
		text.add("       A tous nos coll�gues, et nous  leurs souhaitons le succ�s ");
		text.add("et l�atteinte de leurs ambitions pour leurs encouragements ");
		text.add("incessants�");
		text.add("                                             ...");
		text.add("");

		timer = new Timer(7, null);
		timer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				action();
			}
		});
		timer.start();

		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				x=(getRootPane().getWidth()-940)/2-70;
				repaint();
			}
			@Override
			public void componentHidden(ComponentEvent e) {
				timer.stop();
				y=880;
			}

			@Override
			public void componentShown(ComponentEvent e) {
				timer.start();
			}
		});
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);// clear and repaint
		x=(getRootPane().getWidth()-940)/2-70;
		g.drawImage(img.get(0), 0, 0,getRootPane().getWidth(), getRootPane().getHeight(), this);
		g.drawImage(img.get(1), 780+x, y - 300, 164, 164, this);											
		g.drawImage(img.get(2), 50+x, y - 300, 138, 170, this);
		g.drawImage(img.get(3), 320+x, y + 200 + 17 * 38, 186*2, 230*2, this);
		g.drawImage(img.get(4), 720+x, y + 174 + 4 * 38, 186, 230, this);
		
		g.setFont(new Font("Broadway", Font.ITALIC, 24));
		g.setColor(Color.black);
		g.drawString("Universit� Sidi Mohamed Ben Abdallah", 190 + 50+x, y - 230);
		g.drawString("Facult� des Sciences Dhar Mahraz � F�s", 190 + 50+x, y - 200);

		int l = 0;
		
		for (String t : text) {
			if (l == 0 || l == 19 * 38)
				g.setFont(new Font("Broadway", Font.ITALIC, 60)); 								
			else
				g.setFont(new Font("World of Water", Font.LAYOUT_NO_START_CONTEXT, 30)); // Font.HANGING_BASELINE
			if ((y + l) > 380 && (y + l) < 410) {
				g.setColor(Color.white);
			}
			g.drawString(t, 50+x, y + l); // g.drawString(text.get(0), 50, y);
			g.setColor(Color.black);
			l += 38;
		}	
	}


	private void action() {
		y--;
		repaint();
		if (y <= -2100)
			y = 1000;
		repaint();
	}
}
