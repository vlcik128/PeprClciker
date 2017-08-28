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
	protected static final long serialVersionUID = 1L;
	protected static int clicks;
	protected static int airos;
	
	protected static final String prefix = "Pep¯ clicker BETA 0.2 | ";
	protected static final String suffix = " | ";
	
	protected static String title = prefix + "Pep¯: " + clicks + " g" + suffix + "AirovÈ: " + airos;
	
	
	
	public PeprClicker(){
		super("Pep¯ clicker BETA 0.2 | Pep¯: 0 g | AirovÈ: 0");
		
		clicks= 0;
		airos =0;
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
		JButton airo = new JButton("Dok˙più Airov. 1 Airo = 5 kg pep¯e.");
		airo.addActionListener(new AiroListener());
		cont.add(airo, BorderLayout.SOUTH);
		setContentPane(cont);
		System.out.println("Pepr a zbytok GUI pripraveny! Zapinam viditelnost!");
		setVisible(true);
		setIconImage(icon.getImage());
	}


	public void actionPerformed(ActionEvent arg0) {
		int precl = clicks;
		if (airos == 0){
			precl++;
		}else{
			precl += 1*(airos+1);
		}
		clicks = precl;
		setTitle(prefix + "Pep¯: " + clicks + " g" + suffix + "AirovÈ: " + airos);
		System.out.println("Pridan " + (1+airos) + "gram pep¯e | Aktualna hodnota: " + clicks);
	}
}
