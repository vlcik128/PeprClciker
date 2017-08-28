package vlcik128.pepr.clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class AiroListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int precl = PeprClicker.airos;
		if (PeprClicker.clicks >= 5000){
			precl++;
			PeprClicker.clicks -= 5000;
			System.out.println("Bol zakupeny 1 Airo!");
			PeprClicker.airos = precl;
			Main.pc.setTitle(PeprClicker.title);
		}else{
			JOptionPane.showMessageDialog(null, "Nemáš 5 kg (5000 g) pepøe", "Málo pepøe", JOptionPane.ERROR_MESSAGE); 
		}
		
	}

}
