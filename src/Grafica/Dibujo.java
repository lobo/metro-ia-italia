package Grafica;
import  java.awt.*;
import java.awt.event.*;
import java.util.List;

import javax.swing.*;
 
public class Dibujo extends Frame{
	
   private JTextArea areaTexto1;

   
   // configurar GUI
   public Dibujo(List<Pixel> lista){
      super( "Camino optimo" );    
 
// establecer menu Archivo y sus elementos de meni
      Menu menuArchivo = new Menu( "Archivo" );
 
      // establecer elemento de menu Acerca de...
      MenuItem elementoAcerca = new MenuItem( "Acerca de..." );
      menuArchivo.add( elementoAcerca );
      elementoAcerca.addActionListener(
 
         new ActionListener() {  // clase interna anonima
 
            // mostrar cuadro de dialogo de mensaje cuando el usuario seleccione Acerca de...
            public void actionPerformed( ActionEvent evento )
            {
               JOptionPane.showMessageDialog( Dibujo.this,
                  "Este software fue disenado por el grupo 4",
                  "Acerca de", JOptionPane.PLAIN_MESSAGE );
            }
 
         }  // fin de la clase interna anonima
 
      ); // fin de la llamada a addActionListener
 
      // establecer elemento de menu Salir
      MenuItem elementoSalir = new MenuItem( "Salir" );
      menuArchivo.add( elementoSalir );
      elementoSalir.addActionListener(
 
         new ActionListener() {  // clase interna anonima
 
            // terminar la aplicacion cuando el usuario haga clic en elementoSalir
            public void actionPerformed( ActionEvent evento )
            {
               System.exit( 0 );
            }
 
         }  // fin de la clase interna anonima
 
      ); // fin de la llamada a addActionListener
 
      // crear barra de menus y adjuntarla a la ventana 
      MenuBar barra = new MenuBar();
      setMenuBar( barra );
      barra.add( menuArchivo );   
 
   // Clase anidada que permite terminar la ejecucion de la animacion
      this.addWindowListener(
        // Definicion de la clase anonima para controlar el cierre de
        // la ventana
        new WindowAdapter() {
          public void windowClosing( WindowEvent evt ) {
            // Se concluye el programa
            System.exit( 0 );
          }
        } );
      

    //////////////////////////////////////

      setSize( 1000, 750 );
      setVisible(true);
      
      

    String cadena = "";
    for (int i = lista.size()-1; i >-1 ;i--){
  	  cadena = cadena + lista.get(i).getNombre() + "\n";
      if (i > 0){
    		cadena = cadena +"   ||  ("+lista.get(i-1).getLinea()+")\n";
    	  }
      }

    // establecer areaTexto1
    areaTexto1 = new JTextArea( cadena, 700, 300 );
    add( new JScrollPane( areaTexto1 ) );

   } // fin del constructor
 

}