package CreateImage;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	public Ventana(){
		setTitle("Image Example");
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new ImageExample());
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana frame = new Ventana();
	}

}
