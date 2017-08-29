package vlcik128.pepr.clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.swing.JOptionPane;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class AiroListener implements ActionListener{
	
	private void soundInit(){
		System.out.println("Zvuky sa inicializuju");
		
		   
		try {
			String pepr = "airo.wav";
			InputStream in;
			AudioStream audioStream;
			in = new FileInputStream(pepr);
			audioStream = new AudioStream(in);
			System.out.println("Inicializacia dokoncena, spustam zvuky!");
			AudioPlayer.player.start(audioStream);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		int precl = PeprClicker.airos;
		if (PeprClicker.clicks >= 5000){
			precl++;
			PeprClicker.clicks -= 5000;
			System.out.println("Bol zakupeny 1 Airo!");
			soundInit();
			PeprClicker.airos = precl;
			Main.pc.setTitle(PeprClicker.title);
		}else{
			JOptionPane.showMessageDialog(null, "Nemáš 5 kg (5000 g) pepøe", "Málo pepøe", JOptionPane.ERROR_MESSAGE); 
		}
		
	}

}
