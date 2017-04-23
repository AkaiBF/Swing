/**
 * Listener.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 30 mar. 2017
 *
 */
package PelotaConImagen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Listener implements ActionListener {
	JButton listenUp;
	JButton listenDown;
	JButton listedLeft;
	JButton listenRight;
	JButton listenNO;
	JButton listenNE;
	JButton listenSO;
	JButton listenSE;
	JuegoPanel juego;
	Listener(JButton botonarriba, JButton botonabajo, JButton botonizquierda, JButton botonderecha, JButton botonarribaizq, JButton botonarribader, 
			JButton botonabajoizq, JButton botonabajoder, JuegoPanel juego){
		setListenUp(botonarriba);
		setListenDown(botonabajo);
		setListedLeft(botonizquierda);
		setListenRight(botonderecha);
		setListenNO(botonarribader);
		setListenNE(botonarribaizq);
		setListenSO(botonabajoder);
		setListenSE(botonabajoizq);
		setJuego(juego);
	}

	/**
	 * Getter de listenUp
	 * @return the listenUp
	 */
	public JButton getListenUp() {
		return listenUp;
	}

	/**
	 * Setter de listenUp
	 * @param listenUp the listenUp to set
	 */
	public void setListenUp(JButton listenUp) {
		this.listenUp = listenUp;
	}

	/**
	 * Getter de listenDown
	 * @return the listenDown
	 */
	public JButton getListenDown() {
		return listenDown;
	}

	/**
	 * Setter de listenDown
	 * @param listenDown the listenDown to set
	 */
	public void setListenDown(JButton listenDown) {
		this.listenDown = listenDown;
	}

	/**
	 * Getter de listedLeft
	 * @return the listedLeft
	 */
	public JButton getListedLeft() {
		return listedLeft;
	}

	/**
	 * Setter de listedLeft
	 * @param listedLeft the listedLeft to set
	 */
	public void setListedLeft(JButton listedLeft) {
		this.listedLeft = listedLeft;
	}

	/**
	 * Getter de listenRight
	 * @return the listenRight
	 */
	public JButton getListenRight() {
		return listenRight;
	}

	/**
	 * Setter de listenRight
	 * @param listenRight the listenRight to set
	 */
	public void setListenRight(JButton listenRight) {
		this.listenRight = listenRight;
	}

	/**
	 * Getter de listenNO
	 * @return the listenNO
	 */
	public JButton getListenNO() {
		return listenNO;
	}

	/**
	 * Setter de listenNO
	 * @param listenNO the listenNO to set
	 */
	public void setListenNO(JButton listenNO) {
		this.listenNO = listenNO;
	}

	/**
	 * Getter de listenNE
	 * @return the listenNE
	 */
	public JButton getListenNE() {
		return listenNE;
	}

	/**
	 * Setter de listenNE
	 * @param listenNE the listenNE to set
	 */
	public void setListenNE(JButton listenNE) {
		this.listenNE = listenNE;
	}

	/**
	 * Getter de listenSO
	 * @return the listenSO
	 */
	public JButton getListenSO() {
		return listenSO;
	}

	/**
	 * Setter de listenSO
	 * @param listenSO the listenSO to set
	 */
	public void setListenSO(JButton listenSO) {
		this.listenSO = listenSO;
	}

	/**
	 * Getter de listenSE
	 * @return the listenSE
	 */
	public JButton getListenSE() {
		return listenSE;
	}

	/**
	 * Setter de listenSE
	 * @param listenSE the listenSE to set
	 */
	public void setListenSE(JButton listenSE) {
		this.listenSE = listenSE;
	}

	/**
	 * Getter de juego
	 * @return the juego
	 */
	public JuegoPanel getJuego() {
		return juego;
	}

	/**
	 * Setter de juego
	 * @param juego the juego to set
	 */
	public void setJuego(JuegoPanel juego) {
		this.juego = juego;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == getListenUp() ){
			 getJuego().moveBall(Pelota.ARRIBA);
			 getJuego().repaint();
		} else if(e.getSource() == getListenDown()){
			getJuego().moveBall(Pelota.ABAJO);
			getJuego().repaint();
		}else if(e.getSource() == getListedLeft()){
			getJuego().moveBall(Pelota.IZQUIERDA);
			getJuego().repaint();
		}else if(e.getSource() == getListenRight()){
			getJuego().moveBall(Pelota.DERECHA);
			getJuego().repaint();
			
		}else if(e.getSource() == getListenNE() ){
			 getJuego().moveBall(Pelota.NORESTE);
			 getJuego().repaint();
		} else if(e.getSource() == getListenNO()){
			getJuego().moveBall(Pelota.NOROESTE);
			getJuego().repaint();
		}else if(e.getSource() == getListenSE()){
			getJuego().moveBall(Pelota.SURESTE);
			getJuego().repaint();
		}else if(e.getSource() == getListenSO()){
			getJuego().moveBall(Pelota.SUROESTE);
			getJuego().repaint();
		}
		
	}



}
