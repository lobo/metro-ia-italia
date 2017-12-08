package Grafica;
import  java.awt.*;
import java.awt.event.*;

import javax.swing.*;
 
public class Ventana extends JFrame{
	
   private static final long serialVersionUID = 1L;
   private JLabel pantallaEtiqueta;
   private String salida;
   private String llegada;
   
   
   public void setsalida(String salida){
	   this.salida = salida;
   }
   public void setllegada(String llegada){
	   this.llegada = llegada;
   }
   
   
   // configurar GUI
   public Ventana(){
      super( "Camino optimo" );    
 
// establecer menu Archivo y sus elementos de menu
      JMenu menuArchivo = new JMenu( "Archivo" );
      menuArchivo.setMnemonic( 'A' );
 
      // establecer elemento de men� Acerca de...
      JMenuItem elementoAcerca = new JMenuItem( "Acerca de..." );
      elementoAcerca.setMnemonic( 'A' );
      menuArchivo.add( elementoAcerca );
      elementoAcerca.addActionListener(
 
         new ActionListener() {  // clase interna anonima
 
            // mostrar cuadro de dialogo de mensaje cuando el usuario seleccione Acerca de...
            public void actionPerformed( ActionEvent evento )
            {
            	JOptionPane.showMessageDialog( Ventana.this,
            			"Este software fue disenado por el grupo 4",
            	                  "Acerca de", JOptionPane.PLAIN_MESSAGE );
            }
 
         }  // fin de la clase interna anonima
 
      ); // fin de la llamada a addActionListener
 
      // establecer elemento de menu Salir
      JMenuItem elementoSalir = new JMenuItem( "Salir" );
      elementoSalir.setMnemonic( 'S' );
      menuArchivo.add( elementoSalir );
      elementoSalir.addActionListener(
 
         new ActionListener() {  // clase interna an�nima
 
            // terminar la aplicacion cuando el usuario haga clic en elementoSalir
            public void actionPerformed( ActionEvent evento )
            {
               System.exit( 0 );
            }
 
         }  // fin de la clase interna anonima
 
      ); // fin de la llamada a addActionListener
 
      // crear barra de menus y adjuntarla a la ventana 
      JMenuBar barra = new JMenuBar();
      setJMenuBar( barra );
      barra.add( menuArchivo );   
 
    //////////////////////////////////////
      final JScrollPane panel = new JScrollPane();
      panel.setLayout(null);
      panel.setAutoscrolls(true);
      final Container contentpane = getContentPane();
 

	  final ChoiceSal Salida = new ChoiceSal(this,panel,contentpane);
	  final ChoiceLle Llegada = new ChoiceLle(this,panel,contentpane);

            
      JButton Aceptar = new JButton("Aceptar");
      Aceptar.setFont(new Font("TimeNewRoman", 20, 24));
      Aceptar.setBounds(390, 250, 120, 40);
      contentpane.add(Aceptar);
      Aceptar.addActionListener(
    	         new ActionListener() {  // clase interna anonima
    	            // terminar la aplicacion cuando el usuario haga clic en elementoSalir
    	            public void actionPerformed( ActionEvent evento )
    	            {
     	           //System.out.print(Salida);
    	               //System.out.print(" - ");
    	               //System.out.println(Llegada);
    	               AA AEstrella = new AA(salida,llegada);
    	               JFrame.setDefaultLookAndFeelDecorated(false);   	               
    	               Dibujo aplicacion = new Dibujo(AEstrella.recorridoOptimo());
    	            }
    	         }  // fin de la clase interna anonima    	 
    	      ); // fin de la llamada a addActionListener

      // establecer etiqueta para mostrar texto
      pantallaEtiqueta = new JLabel( "Metro de Milan", SwingConstants.CENTER);
      pantallaEtiqueta.setBounds(20, 20, 0, 0);
      pantallaEtiqueta.setForeground( Color.black );
      pantallaEtiqueta.setFont( new Font( "Arial", Font.PLAIN, 74 ) );
 
      getContentPane().setBackground( Color.white );
      getContentPane().add( pantallaEtiqueta, BorderLayout.NORTH );
 
      setSize( 900, 700 );
      setVisible( true );
 
   } // fin del constructor
 
   public static void main( String args[] )
   {
      JFrame.setDefaultLookAndFeelDecorated(false);
      Ventana aplicacion = new Ventana();
      aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }
 

 
}