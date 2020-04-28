import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
  private JMenuBar mb;
  private JMenu menu_opciones, menu_calcular, menu_acercaDe, menu_colorDeFondo;
  private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
  private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelPaterno, labelMaterno, labelDepartamento, labelAntiguedad, labelResultado, labelfooter;
  private JTextField txtNombreTrabajador, txtPaterno, txtMaterno;
  private JComboBox cDepartamento, cAntiguedad;
  private JScrollPane pane1;
  private JTextArea area1;
  String nombra ="";

  public Principal(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Pantalla Principal");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   Bienvenida ventanaBienvenida = new Bienvenida();
   nombra = ventanaBienvenida.texto;
   
   mb = new JMenuBar();
   mb.setBackground(new Color(255,0,0));
   setJMenuBar(mb);

   menu_opciones = new JMenu("Opciones");
   menu_opciones.setBackground(new Color(255,0,0));
   menu_opciones.setFont(new Font("Andale Mono", 1, 14));
   menu_opciones.setForeground(new Color(255,255,255));
   mb.add(menu_opciones);

   menu_calcular = new JMenu("Calcular");
   menu_calcular.setBackground(new Color(255,0,0));
   menu_calcular.setFont(new Font("Andale Mono", 1, 14));
   menu_calcular.setForeground(new Color(255,255,255));
   mb.add(menu_calcular);

   menu_acercaDe = new JMenu("Acerca De");
   menu_acercaDe.setBackground(new Color(255,0,0));
   menu_acercaDe.setFont(new Font("Andale Mono", 1, 14));
   menu_acercaDe.setForeground(new Color(255,255,255));
   mb.add(menu_acercaDe);

   menu_colorDeFondo = new JMenu("Color de Fondo");
   menu_colorDeFondo.setFont(new Font("Andale Mono", 1, 14));
   menu_colorDeFondo.setForeground(new Color(255,0,0));
   menu_opciones.add(menu_colorDeFondo);

   miCalculo = new JMenuItem("Vacaciones");
   miCalculo.setFont(new Font("Andale Mono", 1, 14));
   miCalculo.setForeground(new Color(255, 0, 0));
   menu_calcular.add(miCalculo);
   miCalculo.addActionListener(this);

   miRojo = new JMenuItem(" Rojo ");
   miRojo.setFont(new Font("Andale Mono", 1, 14));
   miRojo.setForeground(new Color(255, 0, 0));
   menu_colorDeFondo.add(miRojo);
   miRojo.addActionListener(this);

   miNegro = new JMenuItem(" Negro ");
   miNegro.setFont(new Font("Andale Mono", 1, 14));
   miNegro.setForeground(new Color(255, 0, 0));
   menu_colorDeFondo.add(miNegro);
   miNegro.addActionListener(this);

   miMorado = new JMenuItem(" Morado ");
   miMorado.setFont(new Font("Andale Mono", 1, 14));
   miMorado.setForeground(new Color(255, 0, 0));
   menu_colorDeFondo.add(miMorado);
   miMorado.addActionListener(this);

   miNuevo = new JMenuItem(" Nuevo ");
   miNuevo.setFont(new Font("Andale Mono", 1, 14));
   miNuevo.setForeground(new Color(255, 0, 0));
   menu_opciones.add(miNuevo);
   miNuevo.addActionListener(this);

   miSalir = new JMenuItem(" Salir ");
   miSalir.setFont(new Font("Andale Mono", 1, 14));
   miSalir.setForeground(new Color(255, 0, 0));
   menu_opciones.add(miSalir);
   miSalir.addActionListener(this);

   miElCreador = new JMenuItem(" El Creador ");
   miElCreador.setFont(new Font("Andale Mono", 1, 14));
   miElCreador.setForeground(new Color(255, 0, 0));
   menu_acercaDe.add(miElCreador);
   miElCreador.addActionListener(this);

   ImageIcon imagen = new ImageIcon("images/logo-coca.png");
   labelLogo = new JLabel(imagen);
   labelLogo.setBounds(5,5,250,100);
   add(labelLogo);

   labelBienvenido = new JLabel(" Bienvenido " + nombra);
   labelBienvenido.setBounds(280,30,300,50);
   labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
   labelBienvenido.setForeground(new Color(255,255,255));
   add(labelBienvenido);

   labelTitle = new JLabel("Datos del trabajador para el calculo de Vacaciones");
   labelTitle.setBounds(45,140,900,25);
   labelTitle.setFont(new Font("Andale Mono", 0, 24));
   labelTitle.setForeground(new Color(255,255,255));
   add(labelTitle);

   labelNombre = new JLabel("Nombre completo: ");
   labelNombre.setBounds(25,188,180,25);
   labelNombre.setFont(new Font("Andale Mono", 1, 14));
   labelNombre.setForeground(new Color(255,255,255));
   add(labelNombre);

   txtNombreTrabajador = new JTextField();
   txtNombreTrabajador.setBounds(25,213,150,25);
   txtNombreTrabajador.setBackground(new Color(224,224,224));
   txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
   txtNombreTrabajador.setForeground(new java.awt.Color(255,0,0));
   add(txtNombreTrabajador);   

   labelPaterno = new JLabel("Apellido Paterno: ");
   labelPaterno.setBounds(25,248,180,25);
   labelPaterno.setFont(new Font("Andale Mono", 1, 14));
   labelPaterno.setForeground(new Color(255,255,255));
   add(labelPaterno);

   txtPaterno = new JTextField();
   txtPaterno.setBounds(25,273,150,25);
   txtPaterno.setBackground(new Color(224,224,224));
   txtPaterno.setFont(new java.awt.Font("Andale Mono", 1, 14));
   txtPaterno.setForeground(new java.awt.Color(255,0,0));
   add(txtPaterno);  

   labelMaterno = new JLabel("Apellido Materno: ");
   labelMaterno.setBounds(25,308,180,25);
   labelMaterno.setFont(new Font("Andale Mono", 1, 14));
   labelMaterno.setForeground(new Color(255,255,255));
   add(labelMaterno);

   txtMaterno = new JTextField();
   txtMaterno.setBounds(25,334,150,25);
   txtMaterno.setBackground(new Color(224,224,224));
   txtMaterno.setFont(new java.awt.Font("Andale Mono", 1, 14));
   txtMaterno.setForeground(new java.awt.Color(255,0,0));
   add(txtMaterno);

   labelDepartamento = new JLabel("Selecciona el Departamento:");
   labelDepartamento.setBounds(220,188,180,25);
   labelDepartamento.setFont(new Font("Andale Mono", 1, 14));
   labelDepartamento.setForeground(new Color(255,255,255));
   add(labelDepartamento);  

   cDepartamento = new JComboBox();
   cDepartamento.setBounds(220,213,220,25);
   cDepartamento.setBackground(new Color(255,255,255));
   cDepartamento.setFont(new Font("Andale Mono", 1, 14));
   cDepartamento.setForeground(new Color(255,0,0));
   add(cDepartamento);  
   cDepartamento.addItem("");
   cDepartamento.addItem("Atencion al Cliente");
   cDepartamento.addItem("Departamento de Logistica");
   cDepartamento.addItem("Departamento de Gerencia");

   labelAntiguedad = new JLabel("Selecciona su antiguedad:");
   labelAntiguedad.setBounds(220,248,180,25);
   labelAntiguedad.setFont(new Font("Andale Mono", 1, 14));
   labelAntiguedad.setForeground(new Color(255,255,255));
   add(labelAntiguedad);  

   cAntiguedad = new JComboBox();
   cAntiguedad.setBounds(220,273,220,25);
   cAntiguedad.setBackground(new Color(255,255,255));
   cAntiguedad.setFont(new Font("Andale Mono", 1, 14));
   cAntiguedad.setForeground(new Color(255,0,0));
   add(cAntiguedad);  
   cAntiguedad.addItem("");
   cAntiguedad.addItem("1 año o menos");
   cAntiguedad.addItem("2 a 6 años de antiguedad");
   cAntiguedad.addItem("7 años o mas");

   labelResultado = new JLabel("Aqui aparece el resultado: ");
   labelResultado.setBounds(220,307,180,25);
   labelResultado.setFont(new Font("Andale Mono", 1, 14));
   labelResultado.setForeground(new Color(255,255,255));
   add(labelResultado); 

   area1 = new JTextArea();
   area1.setEditable(false);
   area1.setBackground(new Color(224,224,224));
   area1.setFont(new Font("Andale Mono", 1, 11));
   area1.setForeground(new Color(255,0,0));
   area1.setText("\n Aqui aparece el resultado ");
   pane1 = new JScrollPane(area1);
   pane1.setBounds(220,333,385,90);
   add(pane1);   

   labelfooter = new JLabel("©2019 Richi producciones LLAME AL:911");
   labelfooter.setBounds(135,445,500,30);
   labelfooter.setFont(new Font("Andale Mono", 1, 12));
   labelfooter.setForeground(new Color(255,255,255));
   add(labelfooter); 
 }
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == miCalculo){
      String nombreTrabajador = txtNombreTrabajador.getText();
      String AP = txtPaterno.getText();
      String AM = txtMaterno.getText();
      String Departamento = cDepartamento.getSelectedItem().toString();
      String Antiguedad   = cAntiguedad.getSelectedItem().toString();

      if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") || Departamento.equals("") || Antiguedad.equals("")){
        JOptionPane.showMessageDialog(null, " Debes llenar todos los campos PLIIISS");
      } else {
    
         if(Departamento.equals("Atencion al Cliente")){
             
              if(Antiguedad.equals("1 año o menos")){
                 area1.setText("\n El trabajador " + nombreTrabajador + "" + AP + "" + AM +
                               "\n quien colabora en " + Departamento + " con " + Antiguedad +
                               "\n recibe 6 dias de  Vacaciones. ");
              }
              if(Antiguedad.equals("2 a 6 años de antiguedad")){
                 area1.setText("\n El trabajador " + nombreTrabajador + "" + AP + "" + AM +
                               "\n quien colabora en " + Departamento + " con " + Antiguedad +
                               "\n recibe 14 dias de  Vacaciones. ");
              }
              if(Antiguedad.equals("7 años o mas")){
                 area1.setText("\n El trabajador " + nombreTrabajador + "" + AP + "" + AM +
                               "\n quien colabora en " + Departamento + " con " + Antiguedad +
                               "\n recibe 20 dias de  Vacaciones. ");
              }
         }
         if(Departamento.equals("Departamento de Logistica")){
             
              if(Antiguedad.equals("1 año o menos")){
                 area1.setText("\n El trabajador " + nombreTrabajador + "" + AP + "" + AM +
                               "\n quien colabora en " + Departamento + " con " + Antiguedad +
                               "\n recibe 7 dias de  Vacaciones. ");
              }
              if(Antiguedad.equals("2 a 6 años de antiguedad")){
                 area1.setText("\n El trabajador " + nombreTrabajador + "" + AP + "" + AM +
                               "\n quien colabora en " + Departamento + " con " + Antiguedad +
                               "\n recibe 15 dias de  Vacaciones. ");
              }
              if(Antiguedad.equals("7 años o mas")){
                 area1.setText("\n El trabajador " + nombreTrabajador + "" + AP + "" + AM +
                               "\n quien colabora en " + Departamento + " con " + Antiguedad +
                               "\n recibe 22 dias de  Vacaciones. ");
              }
         }
         if(Departamento.equals("Departamento de Gerencia")){
             
              if(Antiguedad.equals("1 año o menos")){
                 area1.setText("\n El trabajador " + nombreTrabajador + "" + AP + "" + AM +
                               "\n quien colabora en " + Departamento + " con " + Antiguedad +
                               "\n recibe 10 dias de  Vacaciones. ");
              }
              if(Antiguedad.equals("2 a 6 años de antiguedad")){
                 area1.setText("\n El trabajador " + nombreTrabajador + "" + AP + "" + AM +
                               "\n quien colabora en " + Departamento + " con " + Antiguedad +
                               "\n recibe 20 dias de  Vacaciones. ");
              }
              if(Antiguedad.equals("7 años o mas")){
                 area1.setText("\n El trabajador " + nombreTrabajador + "" + AP + "" + AM +
                               "\n quien colabora en " + Departamento + " con " + Antiguedad +
                               "\n recibe 30 dias de  Vacaciones. ");
              }
         }
      }
    } 
   if(e.getSource() == miRojo){
      getContentPane().setBackground(new Color(255,0,0));
    } 
   if(e.getSource() == miNegro){
      getContentPane().setBackground(new Color(0,0,0));
    } 
   if(e.getSource() == miMorado){
     getContentPane().setBackground(new Color(51,0,51));
    } 
   if(e.getSource() == miElCreador){
        JOptionPane.showMessageDialog(null, " Lo creo Richi Malo gracias ah Ernesto ");
    } 
   if(e.getSource() == miSalir){
         Bienvenida bienvenida1 = new Bienvenida();
         bienvenida1.setBounds(0,0,350,450);
         bienvenida1.setVisible(true);
         bienvenida1.setResizable(false);
         bienvenida1.setLocationRelativeTo(null); 
         this.setVisible(false);
    } 
   if(e.getSource() == miNuevo){
      txtNombreTrabajador.setText("");
      txtPaterno.setText("");
      txtMaterno.setText("");
      cDepartamento.setSelectedIndex(0);
      cAntiguedad.setSelectedIndex(0);
      area1.setText("\n Aqui aparece el resultado ");
    } 
 }
  public static void main(String args[]){
   Principal ventana = new Principal();
   ventana.setBounds(0,0,640,535); 
   ventana.setVisible(true);
   ventana.setResizable(false);
   ventana.setLocationRelativeTo(null);
 }
}






