package CreateImage;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ventana extends JFrame {
	
	public Ventana(){
		setTitle("Image Example");
		setSize(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new ImageExample());
		setVisible(true);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana frame = new Ventana();
	}

}
