package CardLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlCardLayout implements ActionListener{

WindowCardLayout ventana;
public ControlCardLayout( WindowCardLayout frame){
       ventana = frame ;}
public void actionPerformed (ActionEvent evento){
  if (evento.getSource()==ventana.getCombo()){
     if (ventana.getCombo().getSelectedIndex()==0){
               ventana.getCardLayout().show(ventana.getPanelInferior(), ventana.getVectorCadena()[0]);}
     if (ventana.getCombo().getSelectedIndex()==1){
               ventana.getCardLayout().show(ventana.getPanelInferior(), ventana.getVectorCadena()[1]);}
     if (ventana.getCombo().getSelectedIndex()==2){
               ventana.getCardLayout().show(ventana.getPanelInferior(), ventana.getVectorCadena()[2]);}}
   }
}
