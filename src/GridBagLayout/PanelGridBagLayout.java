package GridBagLayout;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/** 
* Attributes of GridBagConstrains
*
* Gridx: This attribute tells us the X position of the component.
* Gridy: This attribute tells us the Y position of the component.
*
*
* By default, each component uses a size of 1 x 1. To change the size said, we will use:
*
* Gridwidth: This attribute tells us how many cells horizontally occupy our component.
* Gridheight: This attribute tells us how many cells our vertical component occupies.
*
*
* With this, we only say it occupies, but the row or column will still be 1 x 1
* Now we must tell the components whether we want it stretched or not.
*
* Weight: Indicates whether to stretch the rows.
* Weight: Indicates whether to stretch the columns.
*
* These attributes have a value of 1.0, if you want to calculate, or 0.0 otherwise.
* An important detail, these attributes affect the entire row of the column, so each time you add a component to that row, the right to give the same value as it had.
 */
public class PanelGridBagLayout extends JPanel {
	
	private static final long serialVersionUID = 1L;
	GridBagConstraints constraints = new GridBagConstraints();
	
	
	public PanelGridBagLayout(){
		
		setLayout(new GridBagLayout());
		
		JPanel pruebaPanel = new JPanel();
		pruebaPanel.setBackground(Color.CYAN);
		getConstraints().gridx = 0;
		getConstraints().gridy = 0; //
		getConstraints().gridwidth = 3;
		getConstraints().gridheight = 3; 
		getConstraints().weighty = 1.0;
		getConstraints().weightx = 1.0;
		constraints.fill = GridBagConstraints.BOTH;
		add (pruebaPanel, constraints);
		getConstraints().weighty = 0.0;
		
		getConstraints().gridx = 1;
		getConstraints().gridy = 4;
		getConstraints().gridwidth = 1;
		getConstraints().gridheight = 1;
		add (new JButton("Arriba"), constraints);

		getConstraints().gridx = 0; // El área de texto empieza en la columna 0.
		getConstraints().gridy = 5; // El área de texto empieza en la fila 2
		getConstraints().gridwidth = 1; // El área de texto ocupa 1 columnas.
		getConstraints().gridheight = 1; // El área de texto ocupa 1 filas.
		add (new JButton("Izquierda"), constraints);

		
		getConstraints().gridx = 2; // El área de texto empieza en la columna 2.
		getConstraints().gridy = 5; // El área de texto empieza en la fila 5
		getConstraints().gridwidth = 1; // El área de texto ocupa 1 columnas.
		getConstraints().gridheight = 1; // El área de texto ocupa 1 filas.
		add (new JButton("Derecha"), constraints);
		
		getConstraints().gridx = 1; // El área de texto empieza en la columna 1.
		getConstraints().gridy = 6; // El área de texto empieza en la fila 6
		getConstraints().gridwidth = 1; // El área de texto ocupa 1 columnas.
		getConstraints().gridheight = 1; // El área de texto ocupa 1 filas.
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
