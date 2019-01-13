package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Clock;
import java.time.Duration;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Vocab;

@SuppressWarnings("serial")
public class HomePanel extends JPanel {
	
	long long1 = 1;
	int streak = 1;
	ZoneId zone;
	Clock clock;
	Clock clock1 = Clock.systemDefaultZone();
	Date d = new Date();
	
	JTextArea time;
	
	public HomePanel(ArrayList<Vocab> vocab) {
		
		System.out.println(clock1.instant());
		try {
			BufferedImage img = ImageIO.read(new File("test.png"));
			ImageIcon icon = new ImageIcon(img);
			JLabel label = new JLabel(icon);
			this.add(label);
		} catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
		
		System.out.println(d.toString());
		
		time = new JTextArea(d.toString());
		time.setEditable(false);
		this.add(time);
		
	}
}
