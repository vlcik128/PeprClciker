package vlcik128.pepr.clicker;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PeprClicker extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int clicks;
	
	private static final String prefix = "Pepø clicker BETA 0.1 | ";
	
	public PeprClicker(){
		super("Pepø clicker BETA 0.1 | Pepø: 0 g");
		
		clicks= 0;
		System.out.println("Inicializuje sa GUI...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("icon.jpg");
		setSize(800, 600);
		System.out.println("Zakladne operacie GUI hotove, pokracujem...");
		Container cont = getContentPane();
		BorderLayout bl = new BorderLayout();
		cont.setLayout(bl);
		ImageIcon peprIcon = new ImageIcon("pepr.jpg");
		JButton pepr = new JButton(peprIcon);	
		pepr.addActionListener(this);
		cont.add(pepr, BorderLayout.CENTER);
		setContentPane(cont);
		System.out.println("Pepr a zbytok GUI pripraveny! Zapinam viditelnost!");
		setVisible(true);
		setIconImage(icon.getImage());
	}


	public void actionPerformed(ActionEvent arg0) {
		int precl = clicks;
		precl++;
		clicks = precl;
		setTitle(prefix + "Pepø: " + clicks + " g");
		System.out.println("Pridan 1 gram pepøe | Aktualna hodnota: " + clicks);
	}
}
