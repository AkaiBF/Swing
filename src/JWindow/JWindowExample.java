package JWindow;
import javax.swing.*;
/**
 * JWindow, a diferencia de JFrame, no posee bordes 
 * @author AkaiBF
 *
 */
public class JWindowExample extends JWindow {
	private static final long serialVersionUID = 1L;
	private final int SIZE = 500;

	public JWindowExample() {
		super();
		setSize(SIZE, SIZE);
		setVisible(true);
		getContentPane().add(new JButton());
	}
	
	public static void main(String[] args) {
		new JWindowExample();
	}
}

