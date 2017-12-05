package Grafica;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JScrollPane;


public class ChoiceLle extends Applet implements ItemListener {
	/* Declaration */
	private LayoutManager Layout;
	String [] Estaciones = new String [63];
	List Selector = new List(30,false);
	private Font Times;
	Ventana llegada;

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
		Estaciones [1]= "Alexander";
		Estaciones [2]= "Ambachtsland";
		Estaciones [3]= "Berkel Westpolder";
		Estaciones [4]= "Beurs";
		Estaciones [5]= "Binnenhof";
		Estaciones [6]= "Blaak";
		Estaciones [7]= "Blijdorp Hostivar";
		Estaciones [8]= "Capelle Centrum";
		Estaciones [9]= "Capelsebrug";
		Estaciones [10]= "Coolhaven";
		Estaciones [11]= "De Akkers";
		Estaciones [12]= "De Terp";
		Estaciones [13]= "De Tochten";
		Estaciones [14]= "Delfshaven";
		Estaciones [15]= "Dijkzigt";
		Estaciones [16]= "Eendrachtsplein";
		Estaciones [17]= "Forepark";
		Estaciones [18]= "Gerdesiaweg";
		Estaciones [19]= "Graskruid";
		Estaciones [20]= "Heemraadlaan";
		Estaciones [21]= "Hesseplaats";
		Estaciones [22]= "Hoogvliet";
		Estaciones [23]= "Kralingse Zoom";
		Estaciones [24]= "Laan van NOI";
		Estaciones [25]= "Leidschendam Voorburg";
		Estaciones [26]= "Leidschenveen";
		Estaciones [27]= "Leuvehaven";
		Estaciones [28]= "Maashaven";
		Estaciones [29]= "Marconiplein";
		Estaciones [30]= "Meijersplein";
		Estaciones [31]= "Melanchthonweg";
		Estaciones [32]= "Nesselande";
		Estaciones [33]= "Nieuw Verlaat";
		Estaciones [34]= "Nootdorp";
		Estaciones [35]= "Oosterflank";
		Estaciones [36]= "Oostplein";
		Estaciones [37]= "Parkweg";
		Estaciones [38]= "Pernis";
		Estaciones [39]= "Pijnacker Centruum";
		Estaciones [40]= "Pijnacker Zuid";
		Estaciones [41]= "Poortugaal";
		Estaciones [42]= "Prinsenlaan";
		Estaciones [43]= "Rhoon";
		Estaciones [44]= "Rijnhaven";
		Estaciones [45]= "Rodenrijs";
		Estaciones [46]= "Romeynshof";
		Estaciones [47]= "Rotterdam Centraal";
		Estaciones [48]= "Schenkel";
		Estaciones [49]= "Schiedam Centrum";
		Estaciones [50]= "Slinge";
		Estaciones [51]= "Slotlaan";
		Estaciones [52]= "Spijkenisse Centrum";
		Estaciones [53]= "Stadhuis";
		Estaciones [54]= "Troelstralaan";
		Estaciones [55]= "Tussenwater" ;
		Estaciones [56]= "Vijfsluizen" ;
		Estaciones [57]= "Voorburg t Loo";
		Estaciones [58]= "Voorschoterlaan";
		Estaciones [59]= "Wilhelminaplein";
		Estaciones [60]= "Zalmplaat";
		Estaciones [61]= "Zuidplein";
		Estaciones [62]= "Den Haag Centraal";
			
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