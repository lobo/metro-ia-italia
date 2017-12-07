package Grafica;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JScrollPane;


public class ChoiceSal extends Applet implements ItemListener {
	private static final long serialVersionUID = 1L;
	/* Declaration */
	private LayoutManager Layout;
	String [] Estaciones = new String [56];
	List Selector = new List(30,false);
	private Font Times;
	Ventana salida;

	@SuppressWarnings("deprecation")
	public ChoiceSal (Ventana salida, JScrollPane panel, Container contentpane) {
		/* Declaration */
		this.salida = salida;
		int i;

		/* Instantiation */
		Times = new Font("Arial", 15, 25);
		Layout = new FlowLayout ();
		Selector.setFont (Times);
		Selector.setBounds(40, 200, 335, 90);


		/* Decoration */
		Estaciones [0] = "Estacion de Origen ...";
		Estaciones [1]= "Amendola Fiera";
		Estaciones [2]= "Bande Nere";
		Estaciones [3]= "Bisceglie";
		Estaciones [4]= "Buonarroti";
		Estaciones [5]= "Cadorna";
		Estaciones [6]= "Caiazzo";
		Estaciones [7]= "Cairoli";
		Estaciones [8]= "CascinaGobba";
		Estaciones [9]= "Centrale";
		Estaciones [10]= "Cimiano";
		Estaciones [11]= "Conciliazione";
		Estaciones [12]= "Cordusio";
		Estaciones [13]= "Crescenzago";
		Estaciones [14]= "Crocetta";
		Estaciones [15]= "De Angeli";
		Estaciones [16]= "Duomo";
		Estaciones [17]= "Famagosta";
		Estaciones [18]= "Gambara";
		Estaciones [19]= "Garibaldi";
		Estaciones [20]= "Gioia";
		Estaciones [21]= "Gorla";
		Estaciones [22]= "Inganni";
		Estaciones [23]= "Lambrate FS";
		Estaciones [24]= "Lanza";
		Estaciones [25]= "Lima";
		Estaciones [26]= "Lodi Tibb";
		Estaciones [27]= "Loreto";
		Estaciones [28]= "Lotto Fiera";
		Estaciones [29]= "Maciachini";
		Estaciones [30]= "Missori";
		Estaciones [31]= "Montenapoleone";
		Estaciones [32]= "Moscova";
		Estaciones [33]= "P.Ta Venezia";
		Estaciones [34]= "P.Ta Genova FS";
		Estaciones [35]= "Pagano";
		Estaciones [36]= "Palestro";
		Estaciones [37]= "Pasteur";
		Estaciones [38]= "Piola";
		Estaciones [39]= "Porta Romana";
		Estaciones [40]= "Precotto";
		Estaciones [41]= "Primaticcio";
		Estaciones [42]= "QT8";
		Estaciones [43]= "Repubblica";
		Estaciones [44]= "Romolo";
		Estaciones [45]= "Rovereto";
		Estaciones [46]= "S. Agostino";
		Estaciones [47]= "S. Ambrogio";
		Estaciones [48]= "S. Babila";
		Estaciones [49]= "Sondrio";
		Estaciones [50]= "Turati";
		Estaciones [51]= "Turro";
		Estaciones [52]= "Udine";
		Estaciones [53]= "Wagner";
		Estaciones [54]= "Villa SG";
		Estaciones [55]= "Zara" ;

		for (i = 0; i < Estaciones.length; ++i) {
			Selector.addItem(Estaciones[i],i);
		}

		setLayout (Layout);
		Selector.setBounds(40, 200, 335, 400);
		panel.add(Selector);
		contentpane.add(Selector);
		Selector.addItemListener (this);
		Selector.select (0);
	}

	public void itemStateChanged(ItemEvent e) {
		int Selection;
		Selection = Selector.getSelectedIndex();
		salida.setsalida(Estaciones[Selection]);
	} 

}

