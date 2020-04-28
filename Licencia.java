import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
  private JLabel label1, label2;
  private JTextArea area1;
  private JScrollPane pane1;
  private JButton boton1, boton2;
  private JCheckBox caja1;
  String nombre ="";

  public Licencia(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle(" Licencia de uso ");
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   Bienvenida ventanaBienvenida = new Bienvenida();
   nombre = ventanaBienvenida.texto; 
   
   label1 = new JLabel(" TERMINOS Y CONDICIONES ");
   label1.setBounds(215,5,200,30);
   label1.setFont(new Font("Andale Mono", 1, 14));
   label1.setForeground(new Color(0,0,0));
   add(label1);

   area1 = new JTextArea();
   area1.setEditable(false);
   area1.setFont(new Font("Andale Mono", 1, 12));
   area1.setText(" \n\n          TERMINOS Y CONDICIONES" +
   "\n\n                  A.No uses mal este Sorfware que te conozco maquina" +
   "\n                    y no seas desgraciado dandole mal uso y no el que deberia" +
   "\n                    B. No lo descarges y entregarlo como tuyo ya que el codigo es mio jaja Salu2"+
   "\n                    intenta crear un programa como yo, lo se soy un PRO" +
   "\n\n                  Este programa es un medio educativo, ah te creas me pago SONY jaja Salu2"+
   "\n                    Este programa fue por la Geekipedia de Ernesto Descanse en Paz y gracias a mi Madre");
   pane1 = new JScrollPane(area1);
   pane1.setBounds(10,40,575,200);
   add(pane1);

   boton1 = new JButton(" Continuar ");
   boton1.setBounds(10,290,100,30);
   boton1.addActionListener(this);
   boton1.setEnabled(false);
   add(boton1);

   boton2 = new JButton(" No Acepto ");
   boton2.setBounds(120,290,100,30);
   boton2.addActionListener(this);
   boton2.setEnabled(true);
   add(boton2); 

   caja1 = new JCheckBox("Yo " + nombre +" Acepto");
   caja1.setBounds(10,250,300,30);
   caja1.addChangeListener(this);
   add(caja1);

   ImageIcon imagen = new ImageIcon("images/coca-cola.png");
   label2 = new JLabel(imagen);
   label2.setBounds(315,135,300,300);
   add(label2);     
 }
  public void stateChanged(ChangeEvent e){
    if(caja1.isSelected() == true){
      boton1.setEnabled(true);
      boton2.setEnabled(false);
    } else {
      boton1.setEnabled(false);
      boton2.setEnabled(true);
    }
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
          	Principal ventana = new Principal();
   		ventana.setBounds(0,0,640,535); 
  	        ventana.setVisible(true);
   		ventana.setResizable(false);
                ventana.setLocationRelativeTo(null);
                this.setVisible(false);
    }
     else if(e.getSource() == boton2){
         Bienvenida bienvenida1 = new Bienvenida();
         bienvenida1.setBounds(0,0,350,450);
         bienvenida1.setVisible(true);
          bienvenida1.setResizable(false);
          bienvenida1.setLocationRelativeTo(null); 
         this.setVisible(false);
    }
 } 
  public static void main(String args[]){
    Licencia licencia1 = new Licencia();
    licencia1.setBounds(0,0,600,360);
    licencia1.setVisible(true);
    licencia1.setResizable(false);
    licencia1.setLocationRelativeTo(null);
 }
} 











