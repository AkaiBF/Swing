/**
 * Controlador.java
 * @asignatura Programacion de Aplicaciones Interactivas
 * @practica Practica 
 * @author Aythami Torrado Cabrera <alu0100837018@ull.edu.es>
 * @date 30 mar. 2017
 *
 */
package PelotaConImagen;


public class Controlador {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
			int velocidad = 10;
		try{
			velocidad = Integer.parseInt(args[0]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Debe pasar un numero entero por linea de comandos correspondiente a la velocidad. "
					+ "\n Por ejemplo: Controlador.java 20  se iniciara con velocidad 20");
			System.out.println("\n El programa se iniciara con velocidad, por defecto, 10");
		}
		
		JuegoPanel juego = new JuegoPanel(VentanaPrincipal.MAX_WIDTH, VentanaPrincipal.MAX_HEIGHT / 2, 
				velocidad);
		VentanaPrincipal ventana = new VentanaPrincipal(juego);
		aniadirFuncionBotones(ventana, juego);

		ventana.add(juego);
		ventana.aniadirBotones();

	}
	
	public static void aniadirFuncionBotones(VentanaPrincipal ventana, JuegoPanel juego){
		
		Listener listen = new Listener(ventana.getUp(), ventana.getDown(), ventana.getLeft(), ventana.getRight(), ventana.getNoreast(), ventana.getNoroeast(), ventana.getSoueast(), ventana.getSouoeast(), juego);
		
		ventana.getUp().addActionListener(listen);	
		ventana.getDown().addActionListener(listen);	
		ventana.getLeft().addActionListener(listen);	
		ventana.getRight().addActionListener(listen);		
		ventana.getNoreast().addActionListener(listen);	
		ventana.getNoroeast().addActionListener(listen);
		ventana.getSoueast().addActionListener(listen);
		ventana.getSouoeast().addActionListener(listen);
	}

}
