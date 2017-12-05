package Grafica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jdd.graph.Edge;

import Arbol.Arbol;
import Grafo.*;

public class AA {

	private Grafo grafo;
	Nodo salida;
	Nodo llegada;

	public AA(String salida, String llegada){


		grafo = new Grafo(true);

		// Creacion de la linea de metro

		//Estaciones

		Nodo Den_Haag_Centraal = grafo.addNode("Den Haag Centraal", 0,0);
		Nodo Laan_van_NOI = grafo.addNode("Laan van NOI", 1,0);
		Nodo Voorburg_t_Loo = grafo.addNode("Voorburg t Loo", 2,0);
		Nodo Leidschendam_Voorburg = grafo.addNode("Leidschendam-Voorburg", 3,0);
		Nodo Forepark = grafo.addNode("Forepark", 4,0);
		Nodo Leidschenveen = grafo.addNode("Leidschenveen", 6,0);
		Nodo Nootdorp = grafo.addNode("Noordorp", 6,-1);
		Nodo Pijnacker_Centruum = grafo.addNode("Pijnacker Centruum", 7,-2);
		Nodo Pijnacker_Zuid = grafo.addNode("Pijnacker Zuid", 7, -3);
		Nodo Berkel_Westpolder = grafo.addNode("Berkel Westpolder", 7, -4);
		Nodo Rodenrijs = grafo.addNode("Rodenrijs", 7, -5);
		Nodo Meijersplein = grafo.addNode("Meijersplein", 7, -6);
		Nodo Melanchthonweg = grafo.addNode("Melanchthonweg", 7, -7);
		Nodo Blijdorp = grafo.addNode("Blijdorp", 7, -8);
		Nodo Rotterdam_Centraal = grafo.addNode("Rotterdam Centraal", 7, -9);
		Nodo Stadhuis = grafo.addNode("Stadhuis", 7, -10);
		Nodo Beurs = grafo.addNode("Beurs", 7, -11);
		Nodo Leuvehaven = grafo.addNode("Leuvehaven", 7, -12);
		Nodo Wilhelminaplein = grafo.addNode("Wilhelminaplein", 7, -13);
		Nodo Rijnhaven = grafo.addNode("Rijnhaven", 7, -14);
		Nodo Maashaven = grafo.addNode("Maashaven", 7, -15);
		Nodo Zuidplein = grafo.addNode("Zuidplein", 7, -16);
		Nodo Slinge = grafo.addNode("Slinge", 7, -17);
		Nodo Rhoon = grafo.addNode("Rhoon", 4, -18);
		Nodo Poortugaal = grafo.addNode("Poortugaal", 2, -18 );
		Nodo Tussenwater = grafo.addNode("Tussenwater", 0, -18);
		Nodo Hoogvliet = grafo.addNode("Hoogvliet", -1, -19);
		Nodo Zalmplaat = grafo.addNode("Zalmplaat", -1, -20);
		Nodo Spijkenisse_Centrum = grafo.addNode("Spijkenisse Centrum", -2, -21);
		Nodo Heemraadlaan = grafo.addNode("Heemraadlaan", -3, -22);
		Nodo De_Akkers = grafo.addNode("De Akkers", -4, -23);
		Nodo Schiedam_Centrum = grafo.addNode("Schiedam Centrum", 1, -11);
		Nodo Marconiplein = grafo.addNode("Marconiplein", 2, -11);
		Nodo Delfshaven = grafo.addNode("Delfshaven", 3, -11);
		Nodo Coolhaven = grafo.addNode("Coolhaven", 4, -11);
		Nodo Dijkzigt = grafo.addNode("Dijkzigt", 5, -11);
		Nodo Eendrachtsplein = grafo.addNode("Eendrachtsplein", 6, -11);
		Nodo Blaak = grafo.addNode("Blaak", 8,-11);
		Nodo Oostplein = grafo.addNode("Oostplein", 9,-11);
		Nodo Gerdesiaweg = grafo.addNode("Gerdesiaweg", 10, -11);
		Nodo Voorschoterlaan = grafo.addNode("Voorschoterlaan", 11, -11);
		Nodo Kralingse_Zoom = grafo.addNode("Kralingse Zoom", 12, -11);
		Nodo Capelsebrug = grafo.addNode("Capelsebrug", 13, -11);
		Nodo Schenkel = grafo.addNode("Schenkel", 14, -10);
		Nodo Prinsenlaan = grafo.addNode("Prinsenlaan", 14, -9);
		Nodo Oosterflank = grafo.addNode("Oosterflank", 14, -8);
		Nodo Alexander = grafo.addNode("Alexander", 14, -7);
		Nodo Graskruid = grafo.addNode("Graskruid", 14, -6);
		Nodo Romeynshof = grafo.addNode("Romeynshof", 13, -5);
		Nodo Binnenhof = grafo.addNode("Binnenhof", 12, -5);
		Nodo Hesseplaats = grafo.addNode("Hesseplaats", 15 , -5);
		Nodo Nieuw_Verlaat = grafo.addNode("Nieuw Verlaat", 16, -5);
		Nodo Ambachtsland = grafo.addNode("Ambachtsland", 17, -5);
		Nodo De_Tochten = grafo.addNode("De Tochten", 18, -5);
		Nodo Nesselande = grafo.addNode("Nesselande", 19 , -5);
		Nodo Pernis = grafo.addNode("Pernis", 0, -15);
		Nodo Vijfsluizen = grafo.addNode("Vijfsluizen", 0, -14);
		Nodo Troelstralaan = grafo.addNode("Troelstralaan", 0, -13);
		Nodo Parkweg = grafo.addNode("Parkweg", 0, -12);
		Nodo Slotlaan = grafo.addNode("Slotlaan", 15, -11);
		Nodo Capelle_Centrum  = grafo.addNode("Capelle Centrum", 16, -11);
		Nodo De_Terp = grafo.addNode("De Terp", 17, -11);


		// Linea A
		grafo.addEdge (Schiedam_Centrum, Marconiplein, 1.76, "lineaA");		
		grafo.addEdge (Marconiplein, Delfshaven, 0.96, "lineaA");		
		grafo.addEdge (Delfshaven, Coolhaven, 0.86, "lineaA");		
		grafo.addEdge (Coolhaven, Dijkzigt, 0.64, "lineaA");		
		grafo.addEdge (Dijkzigt, Eendrachtsplein, 0.60, "lineaA");				
		grafo.addEdge (Eendrachtsplein, Beurs, 0.62, "lineaA");				
		grafo.addEdge (Beurs, Blaak, 0.61, "lineaA");				
		grafo.addEdge (Blaak, Oostplein, 0.59, "lineaA");				
		grafo.addEdge (Oostplein, Gerdesiaweg, 0.71, "lineaA");				
		grafo.addEdge (Gerdesiaweg, Voorschoterlaan, 0.48, "lineaA");				
		grafo.addEdge (Voorschoterlaan, Kralingse_Zoom, 1.52, "lineaA");				
		grafo.addEdge (Kralingse_Zoom, Capelsebrug, 1.57, "lineaA");				
		grafo.addEdge (Capelsebrug, Schenkel, 1.37, "lineaA");					
		grafo.addEdge (Schenkel, Prinsenlaan, 0.94, "lineaA");					
		grafo.addEdge (Prinsenlaan, Oosterflank, 0.56, "lineaA");					
		grafo.addEdge (Oosterflank, Alexander, 0.82, "lineaA");					
		grafo.addEdge (Alexander, Graskruid, 0.63, "lineaA");					
		grafo.addEdge (Graskruid, Romeynshof, 0.65, "lineaA");					
		grafo.addEdge (Romeynshof, Binnenhof, 0.51, "lineaA");	


		// Linea B	
		grafo.addEdge (Schiedam_Centrum, Marconiplein, 1.76, "lineaB");				
		grafo.addEdge (Marconiplein, Delfshaven, 0.96, "lineaB");				
		grafo.addEdge (Delfshaven, Coolhaven, 0.86, "lineaB");				
		grafo.addEdge (Coolhaven, Dijkzigt, 0.64, "lineaB");				
		grafo.addEdge (Dijkzigt, Eendrachtsplein, 0.60, "lineaB");				
		grafo.addEdge (Eendrachtsplein, Beurs, 0.62, "lineaB");				
		grafo.addEdge (Beurs, Blaak, 0.61, "lineaB");				
		grafo.addEdge (Blaak, Oostplein, 0.59, "lineaB");				
		grafo.addEdge (Oostplein, Gerdesiaweg, 0.71, "lineaB");				
		grafo.addEdge (Gerdesiaweg, Voorschoterlaan, 0.48, "lineaB");				
		grafo.addEdge (Voorschoterlaan, Kralingse_Zoom, 1.52, "lineaB");				
		grafo.addEdge (Kralingse_Zoom, Capelsebrug, 1.57, "lineaB");				
		grafo.addEdge (Capelsebrug, Schenkel, 1.37, "lineaB");					
		grafo.addEdge (Schenkel, Prinsenlaan, 0.94, "lineaB");				
		grafo.addEdge (Prinsenlaan, Oosterflank, 0.56, "lineaB");					
		grafo.addEdge (Oosterflank, Alexander, 0.82, "lineaB");					
		grafo.addEdge (Alexander, Graskruid, 0.63, "lineaB");					
		grafo.addEdge (Graskruid, Hesseplaats, 0.66, "lineaB");				
		grafo.addEdge (Hesseplaats, Nieuw_Verlaat, 0.64, "lineaB");				
		grafo.addEdge (Nieuw_Verlaat, Ambachtsland, 0.59, "lineaB");				
		grafo.addEdge (Ambachtsland, De_Tochten, 0.66, "lineaB");				
		grafo.addEdge (De_Tochten, Nesselande, 1.27, "lineaB");


		// Linea C
		grafo.addEdge (De_Akkers, Heemraadlaan, 0.91, "lineaC");				
		grafo.addEdge (Heemraadlaan, Spijkenisse_Centrum, 0.95,"lineaC");				
		grafo.addEdge (Spijkenisse_Centrum, Zalmplaat, 2.20, "lineaC");				
		grafo.addEdge (Zalmplaat, Hoogvliet, 0.63, "lineaC");				
		grafo.addEdge (Hoogvliet, Tussenwater, 0.66, "lineaC");				
		grafo.addEdge (Tussenwater, Pernis, 2.47, "lineaC");				
		grafo.addEdge (Pernis, Vijfsluizen, 2.72, "lineaC");				
		grafo.addEdge (Vijfsluizen, Troelstralaan, 1.14, "lineaC");				
		grafo.addEdge (Troelstralaan, Parkweg, 0.99, "lineaC");				
		grafo.addEdge (Parkweg, Schiedam_Centrum, 1.14, "lineaC");				
		grafo.addEdge (Schiedam_Centrum, Marconiplein, 1.76, "lineaC");				
		grafo.addEdge (Marconiplein, Delfshaven, 0.96, "lineaC");				
		grafo.addEdge (Delfshaven, Coolhaven, 0.86, "lineaC");				
		grafo.addEdge (Coolhaven, Dijkzigt, 0.64, "lineaC");				
		grafo.addEdge (Dijkzigt, Eendrachtsplein, 0.60, "lineaC");				
		grafo.addEdge (Eendrachtsplein, Beurs, 0.62, "lineaC");				
		grafo.addEdge (Beurs, Blaak, 0.61, "lineaC");				
		grafo.addEdge (Blaak, Oostplein, 0.59, "lineaC");				
		grafo.addEdge (Oostplein, Gerdesiaweg, 0.71, "lineaC");				
		grafo.addEdge (Gerdesiaweg, Voorschoterlaan, 0.48, "lineaC");				
		grafo.addEdge (Voorschoterlaan, Kralingse_Zoom, 1.52, "lineaC");				
		grafo.addEdge (Kralingse_Zoom, Capelsebrug, 1.57, "lineaC");				
		grafo.addEdge (Capelsebrug, Slotlaan, 1.70, "lineaC");				
		grafo.addEdge (Slotlaan, Capelle_Centrum, 0.87, "lineaC");				
		grafo.addEdge (Capelle_Centrum, De_Terp, 0.82, "lineaC");

		// Linea D
		grafo.addEdge (De_Akkers, Heemraadlaan, 0.91, "lineaD");
		grafo.addEdge (Heemraadlaan, Spijkenisse_Centrum, 0.95,"lineaD");
		grafo.addEdge (Spijkenisse_Centrum, Zalmplaat, 2.20, "lineaD");
		grafo.addEdge (Zalmplaat, Hoogvliet, 0.63, "lineaD");
		grafo.addEdge (Hoogvliet, Tussenwater, 0.66, "lineaD");
		grafo.addEdge (Tussenwater, Poortugaal, 1.38, "lineaD");
		grafo.addEdge (Poortugaal, Rhoon, 1.60, "lineaD");
		grafo.addEdge (Rhoon, Slinge, 4.36, "lineaD");
		grafo.addEdge (Slinge, Zuidplein, 1.50, "lineaD");
		grafo.addEdge (Zuidplein, Maashaven, 1.26, "lineaD");
		grafo.addEdge (Maashaven, Rijnhaven, 0.78, "lineaD");
		grafo.addEdge (Rijnhaven, Wilhelminaplein, 0.57, "lineaD");
		grafo.addEdge (Wilhelminaplein, Leuvehaven, 0.94, "lineaD");
		grafo.addEdge (Leuvehaven, Beurs, 0.51, "lineaD");
		grafo.addEdge (Beurs, Stadhuis, 0.64, "lineaD");
		grafo.addEdge (Stadhuis, Rotterdam_Centraal, 0.60, "lineaD"); 

		// Linea E
		grafo.addEdge (Den_Haag_Centraal , Laan_van_NOI , 1.28, "lineaE");
		grafo.addEdge (Laan_van_NOI , Voorburg_t_Loo, 2.67,"lineaE");		//ESTACION NOMBRE RARO  Voorburgt Loo
		grafo.addEdge (Voorburg_t_Loo, Leidschendam_Voorburg, 1.24, "lineaE");
		grafo.addEdge (Leidschendam_Voorburg, Forepark, 1.12, "lineaE");
		grafo.addEdge (Forepark, Leidschenveen, 0.76, "lineaE");
		grafo.addEdge (Leidschenveen, Nootdorp, 2.23, "lineaA");
		grafo.addEdge (Nootdorp, Pijnacker_Centruum, 3.40, "lineaE");
		grafo.addEdge (Pijnacker_Centruum, Pijnacker_Zuid, 1.72, "lineaE");
		grafo.addEdge (Pijnacker_Zuid, Berkel_Westpolder, 1.74, "lineaE");
		grafo.addEdge (Berkel_Westpolder, Rodenrijs, 1.60, "lineaE");
		grafo.addEdge (Rodenrijs, Meijersplein, 2.40, "lineaE");
		grafo.addEdge (Meijersplein, Melanchthonweg, 0.77, "lineaE");
		grafo.addEdge (Melanchthonweg,Blijdorp, 1.97, "lineaE");
		grafo.addEdge (Blijdorp, Rotterdam_Centraal, 1.04, "lineaE");
		grafo.addEdge (Rotterdam_Centraal, Stadhuis, 0.60, "lineaE");
		grafo.addEdge (Stadhuis, Leuvehaven, 1.14, "lineaE");
		grafo.addEdge (Leuvehaven, Wilhelminaplein, 0.94, "lineaE");
		grafo.addEdge (Wilhelminaplein, Rijnhaven, 0.57, "lineaE");
		grafo.addEdge (Rijnhaven, Maashaven, 0.78, "lineaE");
		grafo.addEdge (Maashaven, Zuidplein, 1.26, "lineaE");
		grafo.addEdge (Zuidplein, Slinge, 1.50, "lineaE");



		Iterator<Edge> l = grafo.getMap().get(salida).iterator();
		boolean cond = true;
		Edge tramo;
		while(l.hasNext() && cond){
			tramo = l.next();
			if(((Nodo)tramo.n1).getNombre() == salida){
				this.salida = (Nodo)tramo.n1;
				cond = false;
			}
		} //while


		Iterator<Edge> s = grafo.getMap().get(llegada).iterator();
		cond = true;
		while(s.hasNext() && cond){
			tramo = s.next();
			if(((Nodo)tramo.n1).getNombre() == llegada){
				this.llegada = (Nodo)tramo.n1;
				cond = false;
			}
		}
	}

	public List<Pixel> recorridoOptimo() {
		String linea = "";
		String lineaA = "Linea0";
		Arbol arbol = new Arbol(salida, llegada, grafo);
		List<Nodo> camino = arbol.recorridoObtimo(arbol.CalcularRecorrido());
		List<Pixel> recorrido = new ArrayList<Pixel>();
		Iterator<Nodo> iterador = camino.iterator();
		Iterator<Nodo> iterador2 = camino.iterator();
		iterador2.next();
		while (iterador.hasNext()) {
			Nodo nodo = iterador.next();
			Nodo nodo2;
			if (iterador2.hasNext()) {
				nodo2 = iterador2.next();
				Iterator<Edge> l = grafo.getMap().get(nodo.getNombre())
						.iterator();
				boolean cond = true;
				Edge tramo;
				while (l.hasNext() && cond) {
					tramo = l.next();
					if (((Nodo) tramo.n2).getNombre() == nodo2.getNombre()) {
						if (cond && linea == lineaA) {
							linea = tramo.getLabel();
							cond = false;
						} else
							linea = tramo.getLabel();
					}
				}
				lineaA = linea;
			} else
				linea = "";
			Pixel pixel = new Pixel(nodo.getX(), nodo.getY(), nodo.getNombre(),
					linea);
			recorrido.add(pixel);
		}
		return recorrido;
	}

}