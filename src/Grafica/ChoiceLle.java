package Grafica;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JScrollPane;


public class ChoiceLle extends Applet implements ItemListener {
	private static final long serialVersionUID = 1L;
	/* Declaration */
	private LayoutManager Layout;
	String [] Estaciones = new String [56];
	List Selector = new List(30,false);
	private Font Times;
	Ventana llegada;

	@SuppressWarnings("deprecation")
	public ChoiceLle (Ventana llegada, JScrollPane panel, Container contentpane) {
		/* Declaration */
		this.llegada = llegada;
		int i;

		/* Instantiation */
		Times = new Font("Arial", 15, 25);
		Layout = new FlowLayout ();
		Selector.setFont (Times);
		Selector.setBounds(75, 200, 335, 90);


		/* Decoration */
		Estaciones [0] = "Estacion de Destino ...";
		Estaciones [1]= "AmendolaFiera";
		Estaciones [2]= "Bandenere";
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
		Estaciones [15]= "DeAngeli";
		Estaciones [16]= "Duomo";
		Estaciones [17]= "Famagosta";
		Estaciones [18]= "Gambara";
		Estaciones [19]= "Garibaldi";
		Estaciones [20]= "Gioia";
		Estaciones [21]= "Gorla";
		Estaciones [22]= "Inganni";
		Estaciones [23]= "LambrateFS";
		Estaciones [24]= "Lanza";
		Estaciones [25]= "Lima";
		Estaciones [26]= "LodiTibb";
		Estaciones [27]= "Loreto";
		Estaciones [28]= "LottoFiera";
		Estaciones [29]= "Maciachini";
		Estaciones [30]= "Missori";
		Estaciones [31]= "Montenapoleone";
		Estaciones [32]= "Moscova";
		Estaciones [33]= "PTaVenezia";
		Estaciones [34]= "PTaGenovaFS";
		Estaciones [35]= "Pagano";
		Estaciones [36]= "Palestro";
		Estaciones [37]= "Pasteur";
		Estaciones [38]= "Piola";
		Estaciones [39]= "PortaRomana";
		Estaciones [40]= "Precotto";
		Estaciones [41]= "Primaticcio";
		Estaciones [42]= "QT8";
		Estaciones [43]= "Repubblica";
		Estaciones [44]= "Romolo";
		Estaciones [45]= "Rovereto";
		Estaciones [46]= "SAgostino";
		Estaciones [47]= "SAmbrogio";
		Estaciones [48]= "SBabila";
		Estaciones [49]= "Sondrio";
		Estaciones [50]= "Turati";
		Estaciones [51]= "Turro";
		Estaciones [52]= "Udine";
		Estaciones [53]= "Wagner";
		Estaciones [54]= "VillaSG";
		Estaciones [55]= "Zara" ;
		
			
		for (i = 0; i < Estaciones.length; ++i) {
					Selector.addItem(Estaciones[i],i);
				}

		setLayout (Layout);
		Selector.setBounds(525, 200, 335, 400);
		panel.add(Selector);
		contentpane.add(Selector);
		Selector.addItemListener (this);
		Selector.select (0);
	}

	public void itemStateChanged(ItemEvent e) {
		int Selection;
		Selection = Selector.getSelectedIndex();
		llegada.setllegada(Estaciones[Selection]);
	} 

}