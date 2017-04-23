package CreateImage;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageExample extends JPanel {
	
	private Image image;
	public ImageExample(){
		
		
        try {
        	File image2 = new File("tenis.png");
			image = ImageIO.read(image2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, this);
	}
}
