package GridBagLayout;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPruebaGridBag extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPruebaGridBag frame = new VentanaPruebaGridBag();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPruebaGridBag() {
		setTitle("Ejemplo 1. GridBagLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setContentPane(new PanelGridBagLayout());
		
	}

}
