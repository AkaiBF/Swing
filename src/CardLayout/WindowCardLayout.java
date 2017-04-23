package CardLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.WindowConstants;
import javax.swing.BorderFactory;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Color;

public class WindowCardLayout{

    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel panelSuperior, panelInferior,panelInf1, panelInf2, panelInf3;
    private JLabel etiqueta, etiqueta1, etiqueta2,etiqueta3;
    private JComboBox<String> combo;
    private String [] vectorCadena = {"panel1","panel2","panel3"};

	public WindowCardLayout(){/*Constructor*/
        construyePanelSuperior();
        construyePanelInf1();
        construyePanelInf2();
        construyePanelInf3();
        construyePanelInferior();
        construyeVentana();}

    public void construyePanelSuperior(){
        setEtiqueta(new JLabel("Elegir Opcion"));
        setPanelSuperior(new JPanel());
        getPanelSuperior().setBorder(BorderFactory.createTitledBorder("Demo por INFORUX"));
        setCombo(new JComboBox<String>(getVectorCadena() ));
        getPanelSuperior().setLayout(new FlowLayout());
        getPanelSuperior().add(getEtiqueta());
        getPanelSuperior().add(getCombo());
        getPanelSuperior().getPreferredSize();}

    public void construyePanelInferior(){
        setPanelInferior(new JPanel());
        getPanelInferior().setBorder(BorderFactory.createTitledBorder("Panel Inferior"));
        setCardLayout(new CardLayout());
        getPanelInferior().setLayout(cardLayout);
        /*Al agregar necesitamos 2 argumentos, el objeto a agregar y un nombre referencial */
        getPanelInferior().add(getPanelInf1(), getVectorCadena()[0]);
        getPanelInferior().add(getPanelInf2(), getVectorCadena()[1]);
        getPanelInferior().add(getPanelInf3(), getVectorCadena()[2]);}

    public void construyePanelInf1(){
        setEtiqueta1(new JLabel("Has Seleccionado el Panel 1"));
        setPanelInf1(new JPanel(new FlowLayout()));
        getPanelInf1().setBackground(Color.white);
        getPanelInf1().add(getEtiqueta1());}

    public void construyePanelInf2(){
        setEtiqueta2( new JLabel("increiblemente estas viendo el panel2"));
        setPanelInf2(new JPanel(new FlowLayout()));
        getPanelInf2().setBackground(Color.orange);
        getPanelInf2().add(getEtiqueta2());}

    public void construyePanelInf3(){
        setEtiqueta3(new JLabel("CardLayout permite solo uno a la vez, esta vez el panel 3"));
        setPanelInf3(new JPanel(new FlowLayout()));
        getPanelInf3().setBackground(Color.green);
        getPanelInf3().add(etiqueta3);}

    public void construyeVentana(){
        setFrame(new JFrame());
        getFrame().setTitle("Ejemplo CardLayout");
        getFrame().setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
        getFrame().add(panelSuperior);
        getFrame().add(panelInferior);
        getFrame().getPreferredSize();
        getFrame().pack();
        getFrame().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getFrame().setVisible(true);
        //creamos el objeto controlador de eventos
        ControlCardLayout control= new ControlCardLayout(this);
        getCombo().addActionListener(control);
        }
    

    /**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * @param frame the frame to set
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * @return the cardLayout
	 */
	public CardLayout getCardLayout() {
		return cardLayout;
	}

	/**
	 * @param cardLayout the cardLayout to set
	 */
	public void setCardLayout(CardLayout cardLayout) {
		this.cardLayout = cardLayout;
	}

	/**
	 * @return the panelSuperior
	 */
	public JPanel getPanelSuperior() {
		return panelSuperior;
	}

	/**
	 * @param panelSuperior the panelSuperior to set
	 */
	public void setPanelSuperior(JPanel panelSuperior) {
		this.panelSuperior = panelSuperior;
	}

	/**
	 * @return the panelInferior
	 */
	public JPanel getPanelInferior() {
		return panelInferior;
	}

	/**
	 * @param panelInferior the panelInferior to set
	 */
	public void setPanelInferior(JPanel panelInferior) {
		this.panelInferior = panelInferior;
	}

	/**
	 * @return the panelInf1
	 */
	public JPanel getPanelInf1() {
		return panelInf1;
	}

	/**
	 * @param panelInf1 the panelInf1 to set
	 */
	public void setPanelInf1(JPanel panelInf1) {
		this.panelInf1 = panelInf1;
	}

	/**
	 * @return the panelInf2
	 */
	public JPanel getPanelInf2() {
		return panelInf2;
	}

	/**
	 * @param panelInf2 the panelInf2 to set
	 */
	public void setPanelInf2(JPanel panelInf2) {
		this.panelInf2 = panelInf2;
	}

	/**
	 * @return the panelInf3
	 */
	public JPanel getPanelInf3() {
		return panelInf3;
	}

	/**
	 * @param panelInf3 the panelInf3 to set
	 */
	public void setPanelInf3(JPanel panelInf3) {
		this.panelInf3 = panelInf3;
	}

	/**
	 * @return the etiqueta
	 */
	public JLabel getEtiqueta() {
		return etiqueta;
	}

	/**
	 * @param etiqueta the etiqueta to set
	 */
	public void setEtiqueta(JLabel etiqueta) {
		this.etiqueta = etiqueta;
	}

	/**
	 * @return the etiqueta1
	 */
	public JLabel getEtiqueta1() {
		return etiqueta1;
	}

	/**
	 * @param etiqueta1 the etiqueta1 to set
	 */
	public void setEtiqueta1(JLabel etiqueta1) {
		this.etiqueta1 = etiqueta1;
	}

	/**
	 * @return the etiqueta2
	 */
	public JLabel getEtiqueta2() {
		return etiqueta2;
	}

	/**
	 * @param etiqueta2 the etiqueta2 to set
	 */
	public void setEtiqueta2(JLabel etiqueta2) {
		this.etiqueta2 = etiqueta2;
	}

	/**
	 * @return the etiqueta3
	 */
	public JLabel getEtiqueta3() {
		return etiqueta3;
	}

	/**
	 * @param etiqueta3 the etiqueta3 to set
	 */
	public void setEtiqueta3(JLabel etiqueta3) {
		this.etiqueta3 = etiqueta3;
	}

	/**
	 * @return the combo
	 */
	public JComboBox<String> getCombo() {
		return combo;
	}

	/**
	 * @param combo the combo to set
	 */
	public void setCombo(JComboBox<String> combo) {
		this.combo = combo;
	}

	/**
	 * @return the vectorCadena
	 */
	public String[] getVectorCadena() {
		return vectorCadena;
	}

	/**
	 * @param vectorCadena the vectorCadena to set
	 */
	public void setVectorCadena(String[] vectorCadena) {
		this.vectorCadena = vectorCadena;
	}

    public static void main (String [] inforux){
        new WindowCardLayout();
    }

}