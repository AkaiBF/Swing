/**
 * Ventana.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 30 mar. 2017
 *
 */
package PelotaConImagen;

import java.awt.GridBagConstraints;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {
	final static int MAX_WIDTH = 800;
	final static int MAX_HEIGHT = 600;
	final static int DIR_DOWN = 40;
	final static int DIR_UP = 38;
	final static int DIR_LEFT = 37;
	final static int DIR_RIGHT = 39;
	private JButton up = new JButton("Up");
	private JButton left = new JButton("Left");
	private JButton right = new JButton("Right");
	private JButton down = new JButton("Down");	
	
	private JButton noreast = new JButton("NorEast");	
	private JButton noroeast = new JButton("NorOeast");	
	private JButton soueast = new JButton("SouthEast");	
	private JButton souoeast = new JButton("SouthOeast");	
    

	public VentanaPrincipal(JuegoPanel juego){
		
		setSize(MAX_WIDTH, MAX_HEIGHT);
		setLayout(new GridLayout(2, 1));
		
		setTitle("Bola Magica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
	
	/**
	 * Metodo que añade los botones al panel de abajo con un GridBagLayout
	 */
	public void aniadirBotones(){
		JPanel contenedor = new JPanel();
		contenedor.setLayout(new FlowLayout());
		JPanel panelabajo = new JPanel();
		GridBagLayout gridbag = new GridBagLayout();
	    GridBagConstraints gbc = new GridBagConstraints();
	    panelabajo.setLayout(gridbag);
	    gbc.fill = GridBagConstraints.BOTH;
	    
	    gbc.weightx = 0.5;
	    gbc.gridx = 1;
	    gbc.gridy = 0;
	    getUp().setMnemonic(DIR_UP);
	    panelabajo.add(getUp(), gbc);
	    
	    gbc.gridx = 1;
	    gbc.gridy = 2;
	    getDown().setMnemonic(DIR_DOWN);
	    panelabajo.add(getDown(), gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    getLeft().setMnemonic(DIR_LEFT);
	    panelabajo.add(getLeft(), gbc);
	    
	    gbc.gridx = 2;
	    gbc.gridy = 1;
	    getRight().setMnemonic(DIR_RIGHT);
	    panelabajo.add(getRight(), gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    panelabajo.add(getNoroeast(), gbc);
	    
	    gbc.gridx = 2;
	    gbc.gridy = 0;
	    panelabajo.add(getNoreast(), gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    panelabajo.add(getSouoeast(), gbc);
	    
	    gbc.gridx = 2;
	    gbc.gridy = 2;
	    panelabajo.add(getSoueast(), gbc);
	    
	    contenedor.add(panelabajo);
	    add(contenedor);
		
	}

	/**
	 * Getter de up
	 * @return the up
	 */
	public JButton getUp() {
		return up;
	}

	/**
	 * Setter de up
	 * @param up the up to set
	 */
	public void setUp(JButton up) {
		this.up = up;
	}

	/**
	 * Getter de left
	 * @return the left
	 */
	public JButton getLeft() {
		return left;
	}

	/**
	 * Setter de left
	 * @param left the left to set
	 */
	public void setLeft(JButton left) {
		this.left = left;
	}

	/**
	 * Getter de right
	 * @return the right
	 */
	public JButton getRight() {
		return right;
	}

	/**
	 * Setter de right
	 * @param right the right to set
	 */
	public void setRight(JButton right) {
		this.right = right;
	}

	/**
	 * Getter de down
	 * @return the down
	 */
	public JButton getDown() {
		return down;
	}

	/**
	 * Setter de down
	 * @param down the down to set
	 */
	public void setDown(JButton down) {
		this.down = down;
	}

	/**
	 * Getter de noreast
	 * @return the noreast
	 */
	public JButton getNoreast() {
		return noreast;
	}

	/**
	 * Setter de noreast
	 * @param noreast the noreast to set
	 */
	public void setNoreast(JButton noreast) {
		this.noreast = noreast;
	}

	/**
	 * Getter de noroeast
	 * @return the noroeast
	 */
	public JButton getNoroeast() {
		return noroeast;
	}

	/**
	 * Setter de noroeast
	 * @param noroeast the noroeast to set
	 */
	public void setNoroeast(JButton noroeast) {
		this.noroeast = noroeast;
	}

	/**
	 * Getter de soueast
	 * @return the soueast
	 */
	public JButton getSoueast() {
		return soueast;
	}

	/**
	 * Setter de soueast
	 * @param soueast the soueast to set
	 */
	public void setSoueast(JButton soueast) {
		this.soueast = soueast;
	}

	/**
	 * Getter de souoeast
	 * @return the souoeast
	 */
	public JButton getSouoeast() {
		return souoeast;
	}

	/**
	 * Setter de souoeast
	 * @param souoeast the souoeast to set
	 */
	public void setSouoeast(JButton souoeast) {
		this.souoeast = souoeast;
	}
	
	

}
