package Grafica;

import java.awt.*;
import java.awt.event.*;
import java.util.List;

import javax.swing.*;

public class Dibujo extends Frame {

    private static final long serialVersionUID = 1L;
    private JTextArea areaTexto1;


    // configurar GUI
    public Dibujo(List<Pixel> lista) {
        super("Camino optimo");

// establecer menu Archivo y sus elementos de meni
        Menu menuArchivo = new Menu("Archivo");

        // establecer elemento de menu Acerca de...
        MenuItem elementoAcerca = new MenuItem("Acerca de...");
        menuArchivo.add(elementoAcerca);
        elementoAcerca.addActionListener(

                new ActionListener() {  // clase interna anonima

                    // mostrar cuadro de dialogo de mensaje cuando el usuario seleccione Acerca de...
                    public void actionPerformed(ActionEvent evento) {
                        JOptionPane.showMessageDialog(Dibujo.this,
                                "Este software fue disenado por el grupo 4",
                                "Acerca de", JOptionPane.PLAIN_MESSAGE);
                    }

                }  // fin de la clase interna anonima

        ); // fin de la llamada a addActionListener

        // establecer elemento de menu Salir
        MenuItem elementoSalir = new MenuItem("Salir");
        menuArchivo.add(elementoSalir);
        elementoSalir.addActionListener(

                new ActionListener() {  // clase interna anonima

                    // terminar la aplicacion cuando el usuario haga clic en elementoSalir
                    public void actionPerformed(ActionEvent evento) {
                        System.exit(0);
                    }

                }  // fin de la clase interna anonima

        ); // fin de la llamada a addActionListener

        // crear barra de menus y adjuntarla a la ventana
        MenuBar barra = new MenuBar();
        setMenuBar(barra);
        barra.add(menuArchivo);

        // Clase anidada que permite terminar la ejecucion de la animacion
        this.addWindowListener(
                // Definicion de la clase anonima para controlar el cierre de
                // la ventana
                new WindowAdapter() {
                    public void windowClosing(WindowEvent evt) {
                        // Se concluye el programa
                        System.exit(0);
                    }
                });


        //////////////////////////////////////

        setSize(1000, 750);
        setVisible(true);


        String cadena = "";
        for (int i = lista.size() - 1; i > -1; i--) {
            cadena = cadena + lista.get(i).getNombre() + "\n";
            if (i > 0) {
                cadena = cadena + "   ||  (" + lista.get(i - 1).getLinea() + ")\n";
            }
        }

        System.out.println(cadena);

        // Calculate number of lines in cadena, from which we infer the number of stops
        String[] lines = cadena.split("\n");
        Integer cantidad_estaciones = lines.length;
        if (cantidad_estaciones % 2 == 0) {
            cantidad_estaciones = cantidad_estaciones / 2;
        } else {
            cantidad_estaciones = (cantidad_estaciones - 1) / 2;
            cantidad_estaciones++;
        }
        String numero_estaciones = cantidad_estaciones.toString();
        System.out.print("Number of stations is ");
        System.out.print(numero_estaciones + "\n");

        // Get travel time from last pixel of lista:
        int travelTime = lista.get(lista.size()-1).getDistance();

        // Add this information to cadena to be displayed in JTextArea
        cadena = cadena + "\nNumber of stops: " + numero_estaciones + "\n";
        int travelTimeMinutes = travelTime / 60;
        int travelTimeSeconds = travelTime - (travelTimeMinutes * 60);
        cadena = cadena + "Time of travel " + Integer.toString(travelTimeMinutes) + "m " +
                    Integer.toString(travelTimeSeconds) + "s.";

        // establecer areaTexto1
        areaTexto1 = new JTextArea(cadena , 700, 300);
        //JTextArea areaTexto2 = new JTextArea( numero_estaciones, 700, 300 );
        add(new JScrollPane(areaTexto1));
        //add( new JScrollPane( areaTexto2 ) );

    } // fin del constructor


}