package GridBagLayout;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * 
 * Atributos de GridBagConstrains
 * 
 * gridx : Este atributo nos dice la posicion X del componente.
 * gridy : Este atributo nos dice la posicion Y del componente.
 * 
 * 
 * Por defecto, cada componente usa un tamaño de 1 x 1. Para cambiar dicho tamaño, usaremos:
 * 
 * gridwidth: Este atributo nos dice cuantas celdas ocupa en horizontal nuestro componente.
 * gridheight: Este atributo nos dice cuantas celdas ocupa en vertical nuestro componente.
 * 
 * 
 * Con esto, solo le decimos que ocupa, pero la fila o columna seguirá siendo de 1 x 1
 * Ahora debemos decirle a los componente si queremos que se estire o no.
 * 
 * weightx: Indica si estirar las filas.
 * weighty: Indica si estirar las columnas.
 * 
 * Estos atributos tienen un valor 1.0, si quieres que estire, o 0.0 en caso contrario.
 * Un detalle importante, estos atributos afectan a toda la fila o columna, con lo cual cada vez que añadamos un componente a esa fila, le debemos dar el mismo valor que tenia. 
 */
public class PanelGridBagLayout extends JPanel {
	
	GridBagConstraints constraints = new GridBagConstraints();
	
	
	public PanelGridBagLayout(){
		
		setLayout(new GridBagLayout());
		
		JPanel prueba = new JPanel();
		prueba.setBackground(Color.CYAN);
		getConstraints().gridx = 0; // El área de texto empieza en la columna dos.
		getConstraints().gridy = 0; // El área de texto empieza en la fila dos
		getConstraints().gridwidth = 3; // El área de texto ocupa 3 columnas.
		getConstraints().gridheight = 3; // El área de texto ocupa 3 filas.
		getConstraints().weighty = 1.0;
		getConstraints().weightx = 1.0;
		constraints.fill = GridBagConstraints.BOTH;
		add (prueba, constraints);
		//getConstraints().weightx = 0.0;
		getConstraints().weighty = 0.0;
		
		getConstraints().gridx = 1; // El área de texto empieza en la columna cero.
		getConstraints().gridy = 4; // El área de texto empieza en la fila cero
		getConstraints().gridwidth = 1; // El área de texto ocupa dos columnas.
		getConstraints().gridheight = 1; // El área de texto ocupa 2 filas.
		add (new JButton("Arriba"), constraints);

		getConstraints().gridx = 0; // El área de texto empieza en la columna dos.
		getConstraints().gridy = 5; // El área de texto empieza en la fila dos
		getConstraints().gridwidth = 1; // El área de texto ocupa dos columnas.
		getConstraints().gridheight = 1; // El área de texto ocupa 2 filas.
		add (new JButton("Izquierda"), constraints);

		
		getConstraints().gridx = 2; // El área de texto empieza en la columna dos.
		getConstraints().gridy = 5; // El área de texto empieza en la fila dos
		getConstraints().gridwidth = 1; // El área de texto ocupa dos columnas.
		getConstraints().gridheight = 1; // El área de texto ocupa 2 filas.
		add (new JButton("Derecha"), constraints);
		
		getConstraints().gridx = 1; // El área de texto empieza en la columna dos.
		getConstraints().gridy = 6; // El área de texto empieza en la fila dos
		getConstraints().gridwidth = 1; // El área de texto ocupa dos columnas.
		getConstraints().gridheight = 1; // El área de texto ocupa 2 filas.
		add (new JButton("Abajo"), constraints);
		

	}


	/**
	 * @return the constraints
	 */
	public GridBagConstraints getConstraints() {
		return constraints;
	}


	/**
	 * @param constraints the constraints to set
	 */
	public void setConstraints(GridBagConstraints constraints) {
		this.constraints = constraints;
	}

}
