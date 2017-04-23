package JSpinner;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Ejemplo de uso de JSpinner.
 * Crea una JSpinner de valores entre 0 y 255 y reproduce el valor seleccionado en un JTextField
 * @author Aythami Torrado & Ernesto Echeverría
 */
public class JSpinnerExample extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textfield;
	private JSpinner spinner;
	protected final int TEXTFIELDSIZE = 20;
	protected final int INITIALVALUE = 30;
	protected final int DEFAULT = 0;
	protected final int LOWER = 0;
	protected final int HIGHER = 255;
	protected final int INCREMENT = 1;
	public static void main(String[] args) {
		new JSpinnerExample();
	}

	public JSpinnerExample() {
		super();
		// Creacion del JTextField
		textfield = new JTextField(TEXTFIELDSIZE);
		
		// Creacion del JSpinner y valor incial.
		SpinnerModel modelo = new SpinnerNumberModel(DEFAULT, LOWER, HIGHER, INCREMENT);
		spinner = new JSpinner(modelo);
		
		// Nos suscribimos a cambios en el JSpinner
		spinner.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				// Ponemos el valor del JSpinner en el JTextField
				textfield.setText(spinner.getValue().toString());
			}
		});
		
		setTitle("Ejemplo JSpinner");
		setLayout(new FlowLayout());
		add(spinner);
		add(textfield);
		pack();
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}