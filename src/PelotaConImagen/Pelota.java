/**
 * Pelota.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 29 mar. 2017
 *
 */
package PelotaConImagen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Pelota extends JPanel{
	public static final int INICIO_X_Y = 0;
	public static final int MAX_DIR = 8;
	public static final int ARRIBA = 0;
	public static final int ABAJO = 1;
	public static final int IZQUIERDA = 2;
	public static final int DERECHA = 3;
	public static final int NORESTE = 4;
	public static final int NOROESTE = 5;
	public static final int SURESTE = 6;
	public static final int SUROESTE = 7;
	private int maxAncho;
	private int maxAlto;
	private int x;
	private int y;
	private int aceleracion;
	private int tamanio;
	private Color colorPelota;
	private Image image;
	
	/**
	 * Constructor de la clase Pelota
	 * @param acelera 
	 * @param x
	 * @param y
	 */
	public Pelota(JuegoPanel p, int acelera) {
		setTamanio(30);
		setAceleracion(acelera);
		setMaxAncho(p.getAncho());
		setMaxAlto(p.getAlto());
		setX(getMaxAncho() / 2);
		setY(getMaxAlto() / 2);
		setColorPelota(new Color(169, 72, 255));
		
        try {
        	File image2 = new File("tenis.png");
			image = ImageIO.read(image2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	/**
	 * Metodo que segun el valor indicado por parametros se movera en una direccion u otra. 
	 * @param dir
	 */
	public void move(int dir){
		switch(dir){
			case ARRIBA:{ // arriba
				if(getY() - getAceleracion() > INICIO_X_Y)
					setY(getY() - getAceleracion());
				else{
					colorAleatorio();
					setY(getMaxAlto() - (getTamanio() + getTamanio() /2) );
				}	
			}break;
			
			case ABAJO:{ // abajo
				if(getY() + getAceleracion() < getMaxAlto() - getTamanio())
					setY(getY() + getAceleracion());
				else{
					colorAleatorio();
					setY(INICIO_X_Y);
				}
			}break;
			
			case IZQUIERDA:{ // izquierda
				if(getX() - getAceleracion() > INICIO_X_Y)
					setX(getX() - getAceleracion());
				else{
					colorAleatorio();
					setX(getMaxAncho() - (getTamanio()) );
				}
					
			}break;
			
			case DERECHA:{ // derecha
				if(getX() + getAceleracion() < getMaxAncho() - getTamanio() )
					setX(getX() + getAceleracion());
				else{
					colorAleatorio();
					setX(INICIO_X_Y);
				}
			}break;
		case NORESTE:{ // arriba derecha
			if((getY() - getAceleracion() > 0) && (getX() + getAceleracion() < getMaxAncho() - getTamanio() ) ){
				setY(getY() - getAceleracion());
				setX(getX() + getAceleracion());
			}
		}break;
		case NOROESTE:{ // arriba izquierda
			if((getY() - getAceleracion() > 0) && (getX() - getAceleracion() > 0) ){
				setY(getY() - getAceleracion());
				setX(getX() - getAceleracion());
			}
		}break;
		case SURESTE:{ // abajo derecha
			if((getY() + getAceleracion() < getMaxAlto() - getTamanio()) && (getX() - getAceleracion() > 0) ){
				setY(getY() + getAceleracion());
				setX(getX() + getAceleracion());
			}
				
	
		}break;
		case SUROESTE:{ // abajo izquierda
			if((getY() + getAceleracion() < getMaxAlto() - getTamanio()) && (getX() - getAceleracion() > 0)){
				setY(getY() + getAceleracion());
				setX(getX() - getAceleracion());
			}
			
		}break;
	}
}
	/**
	 * Metodo que crea un color alatorio y se lo atribuye a colorPelota
	 */
	private void colorAleatorio() {
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		setColorPelota(new Color(red,green,blue));
		
	}

	public boolean moveAleatorio(int dir){
		switch(dir){
			case 0:{ // arriba
				if(getY() - getAceleracion() > 0)
					setY(getY() - getAceleracion());
				else
					return false;
//				else
//					setY(getMaxAlto() - (getTamanio() + getTamanio() /2) );
			}break;
			case 1:{ // abajo
				if(getY() + getAceleracion() < getMaxAlto() - getTamanio())
					setY(getY() + getAceleracion());
				else
					return false;
//				else
//					setY(0 );
			}break;
			case 2:{ // izquierda
				if(getX() - getAceleracion() > 0)
					setX(getX() - getAceleracion());
				else
					return false;
//				else
//					setX(getMaxAncho() - (getTamanio()) );
			}break;
			case 3:{ // derecha
				if(getX() + getAceleracion() < getMaxAncho() - getTamanio() )
					setX(getX() + getAceleracion());
				else
					return false;
//				else
//				setX(0 );
			}break;
		case 4:{
			if((getY() - getAceleracion() > 0) && (getX() + getAceleracion() < getMaxAncho() - getTamanio() ) ){
				setY(getY() - getAceleracion());
				setX(getX() + getAceleracion());
			}else
				return false;
		}break;
		case 5:{ //arriba izquierda
			if((getY() - getAceleracion() > 0) && (getX() - getAceleracion() > 0) ){
				setY(getY() - getAceleracion());
				setX(getX() - getAceleracion());
			}else
				return false;
		}break;
		case 6:{ //abajo derecha
			if((getY() + getAceleracion() < getMaxAlto() - getTamanio()) && (getX() - getAceleracion() > 0) ){
				setY(getY() + getAceleracion());
				setX(getX() + getAceleracion());
			}else
				return false;
				
	
		}break;
		case 7:{ // abajo izquierda
			if((getY() + getAceleracion() < getMaxAlto() - getTamanio()) && (getX() - getAceleracion() > 0)){
				setY(getY() + getAceleracion());
				setX(getX() - getAceleracion());
			}else
				return false;
			
		}break;
	}
		return true;
}

	
	/**
	 * Movimiento de la pelota en diagonal
	 */
	public void moveDiagonal(int dir) {
		switch(dir){ //arriba derecha
		case 0:{
			if((getY() - getAceleracion() > 0) && (getX() + getAceleracion() < getMaxAncho() - getTamanio() ) ){
				setY(getY() - getAceleracion());
				setX(getX() + getAceleracion());
			}
		}break;
		case 1:{ //arriba izquierda
			if((getY() - getAceleracion() > 0) && (getX() - getAceleracion() > 0) ){
				setY(getY() - getAceleracion());
				setX(getX() - getAceleracion());
			}
		}break;
		case 2:{ //abajo derecha
			if((getY() + getAceleracion() < getMaxAlto() - getTamanio()) && (getX() - getAceleracion() > 0) ){
				setY(getY() + getAceleracion());
				setX(getX() + getAceleracion());
			}
				

		}break;
		case 3:{ // abajo izquierda
			if((getY() + getAceleracion() < getMaxAlto() - getTamanio()) && (getX() - getAceleracion() > 0)){
				setY(getY() + getAceleracion());
				setX(getX() - getAceleracion());
			}
			
		}break;
	}
		
	}
	/**
	 * Metodo que dibuja la bola.
	 * @param g
	 */
	public void paint(Graphics g) {
		g.setColor(getColorPelota());
		//g.fillOval(getX(), getY(), 30, 30);
		g.drawImage(image, getX(), getY(), this);
		
	}
	
	/**
	 * Getter de x
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Setter de x
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Getter de y
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Setter de y
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Getter de maxAncho
	 * @return the maxAncho
	 */
	public int getMaxAncho() {
		return maxAncho;
	}

	/**
	 * Setter de maxAncho
	 * @param maxAncho the maxAncho to set
	 */
	public void setMaxAncho(int maxAncho) {
		this.maxAncho = maxAncho;
	}

	/**
	 * Getter de maxAlto
	 * @return the maxAlto
	 */
	public int getMaxAlto() {
		return maxAlto;
	}

	/**
	 * Setter de maxAlto
	 * @param maxAlto the maxAlto to set
	 */
	public void setMaxAlto(int maxAlto) {
		this.maxAlto = maxAlto;
	}

	/**
	 * Getter de aceleracion
	 * @return the aceleracion
	 */
	public int getAceleracion() {
		return aceleracion;
	}

	/**
	 * Setter de aceleracion
	 * @param aceleracion the aceleracion to set
	 */
	public void setAceleracion(int aceleracion) {
		this.aceleracion = aceleracion;
	}

	/**
	 * Getter de tama�o
	 * @return the tama�o
	 */
	public int getTamanio() {
		return tamanio;
	}

	/**
	 * Setter de tama�o
	 * @param tama�o the tama�o to set
	 */
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	/**
	 * Getter de colorPelota
	 * @return the colorPelota
	 */
	public Color getColorPelota() {
		return colorPelota;
	}

	/**
	 * Setter de colorPelota
	 * @param colorPelota the colorPelota to set
	 */
	public void setColorPelota(Color colorPelota) {
		this.colorPelota = colorPelota;
	}


}
