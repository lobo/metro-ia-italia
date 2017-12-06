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
		
		/*
		Nodo Den_Haag_Centraal = grafo.addNode("Den Haag Centraal", 0,0);
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
		*/
		
		Nodo Bisceglie = grafo.addNode("Bisceglie", 0, 17); //done
		Nodo Inganni = grafo.addNode("Inganni", 1, 16); //done
		Nodo Primaticcio = grafo.addNode("Primaticcio", 2, 15); //done
		Nodo Bandenere = grafo.addNode("Bandenere", 3, 14); //done
		Nodo Gambara = grafo.addNode("Gambara", 4, 13); //done
		Nodo DeAngeli = grafo.addNode("DeAngeli", 5, 12); //done
		Nodo Wagner = grafo.addNode("Wagner", 6, 11); //done
		Nodo Pagano = grafo.addNode("Pagano", 7, 10); //done
		Nodo QT8 = grafo.addNode("QT8", 3, 6); //done
		Nodo LottoFiera = grafo.addNode("LottoFiera", 4, 7); //done
		Nodo AmendolaFiera = grafo.addNode("AmendolaFiera", 5, 8); //done
		Nodo Buonarroti = grafo.addNode("Buonarroti", 6, 9); //done
		Nodo Conciliazione = grafo.addNode("Conciliazione", 8, 10); //done
		Nodo Cadorna = grafo.addNode("Cadorna", 9, 10); //done
		Nodo Cairoli = grafo.addNode("Cairoli", 10, 10); //done
		Nodo LanzaM2 = grafo.addNode("LanzaM2", 9, 9); //done
		Nodo SAmbrogioM2 = grafo.addNode("SAmbrogioM2", 9, 11); //done
		Nodo Cordusio = grafo.addNode("Cordusio", 11, 10); //done
		Nodo Duomo = grafo.addNode("Duomo", 12, 10); //done
		Nodo SBabila = grafo.addNode("SBabila", 13, 10); //done
		Nodo MissoriM3 = grafo.addNode("MissoriM3", 17, -11);
		Nodo Montenapoleone = grafo.addNode("Montenapoleone", 12, 9); //done
		Nodo Palestro = grafo.addNode("Palestro", 14, 10); //done
		Nodo PTaVenezia = grafo.addNode("PTaVenezia", 15, 10); //done
		Nodo Lima = grafo.addNode("Lima", 16, 9); //done
		Nodo Loreto = grafo.addNode("Loreto", 16, 8); //done
		Nodo Pasteur = grafo.addNode("Pasteur", 16, 7); //done
		Nodo CaiazzoM2 = grafo.addNode("CaiazzoM2", 17, -11);
		Nodo PiolaM2 = grafo.addNode("PiolaM2", 17, -11);
		Nodo Rovereto = grafo.addNode("Rovereto", 16, 6); //done
		Nodo Turro = grafo.addNode("Turro", 16, 5); //done
		Nodo Gorla = grafo.addNode("Gorla", 16, 4); //done
		Nodo Precotto = grafo.addNode("Precotto", 16, 3); //done
		Nodo VillaSG = grafo.addNode("VillaSG", 16, 2); //done
		
		Nodo Famagosta = grafo.addNode("Famagosta", 9, 15); //done
		Nodo Romolo = grafo.addNode("Romolo", 9, 14); //done
		Nodo PtaGenovaFs = grafo.addNode("PtaGenovaFs", 9, 13); //done
		Nodo SAgostino = grafo.addNode("SAgostino", 9, 12); //done
		Nodo SAmbrogio = grafo.addNode("SAmbrogio", 9, 11); //done
		Nodo Lanza = grafo.addNode("Lanza", 9, 9); //done
		Nodo Moscova = grafo.addNode("Moscova", 10, 8); //done
		Nodo Garibaldi = grafo.addNode("Garibaldi", 11, 7); //done
		Nodo Gioia = grafo.addNode("Gioia", 12, 6); //done
		Nodo Centrale = grafo.addNode("Centrale", 13, 6); //done
		Nodo Caiazzo = grafo.addNode("Caiazzo", 17, -11); // revisar este
		Nodo SondrioM3 = grafo.addNode("SondrioM3", 14, 5); //done
		Nodo Piola = grafo.addNode("Piola", 17, 8); //done
		Nodo LambrateFS = grafo.addNode("LambrateFS", 18, 8); //done
		Nodo Udine = grafo.addNode("Udine", 19, 9); //done
		Nodo Cimiano = grafo.addNode("Cimiano", 19, 8); //done
		Nodo Crescenzago = grafo.addNode("Crescenzago", 19, 7); //done
		Nodo CascinaGobba = grafo.addNode("CascinaGobba", 19, 6); //done
		
		Nodo LodiTibb = grafo.addNode("LodiTibb", 15, 14); //done
		Nodo PortaRomana = grafo.addNode("PortaRomana", 14, 13); //done
		Nodo Crocetta = grafo.addNode("Crocetta", 13, 12); //done
		Nodo Missori = grafo.addNode("Missori", 12, 11); //done
		Nodo Turati = grafo.addNode("Turati", 13, 8); //done
		Nodo Repubblica = grafo.addNode("Repubblica", 14, 7); //done
		Nodo Sondrio = grafo.addNode("Sondrio", 14, 5); //done
		Nodo Zara = grafo.addNode("Zara", 14, 4); //done
		Nodo Maciachini = grafo.addNode("Maciachini", 14, 3); //done
		Nodo RepubblicaM3 = grafo.addNode("RepubblicaM3", 14, 7); //done 
		
	
		// Linea 1
		grafo.addEdge (Bisceglie, Inganni, 0.91, "linea 1");
		grafo.addEdge (Inganni, Primaticcio, 0.91, "linea 1");
		grafo.addEdge (Primaticcio, Bandenere, 0.91, "linea 1");
		grafo.addEdge (Bandenere, Gambara, 0.91, "linea 1");
		grafo.addEdge (Gambara, DeAngeli, 0.91, "linea 1");
		grafo.addEdge (DeAngeli, Wagner, 0.91, "linea 1");
		grafo.addEdge (Wagner, Pagano, 0.91, "linea 1");
		grafo.addEdge (QT8, LottoFiera, 0.91, "linea 1");
		grafo.addEdge (LottoFiera, AmendolaFiera, 0.91, "linea 1");
		grafo.addEdge (AmendolaFiera, Buonarroti, 0.91, "linea 1");
		grafo.addEdge (Buonarroti, Pagano, 0.91, "linea 1");
		grafo.addEdge (Pagano, Conciliazione, 0.91, "linea 1");
		grafo.addEdge (Conciliazione, Cadorna, 0.91, "linea 1");
		grafo.addEdge (Cadorna, Cairoli, 0.91, "linea 1");
		grafo.addEdge (Cairoli, LanzaM2, 0.91, "linea 1");
		grafo.addEdge (LanzaM2, SAmbrogioM2, 0.91, "linea 1");
		grafo.addEdge (SAmbrogioM2, Cordusio, 0.91, "linea 1");
		grafo.addEdge (Cordusio, Duomo, 0.91, "linea 1");
		grafo.addEdge (Duomo, SBabila, 0.91, "linea 1");
		grafo.addEdge (SBabila, MissoriM3, 0.91, "linea 1");
		grafo.addEdge (MissoriM3, Montenapoleone, 0.91, "linea 1");
		grafo.addEdge (Montenapoleone, Palestro, 0.91, "linea 1");
		grafo.addEdge (Palestro, PTaVenezia, 0.91, "linea 1");
		grafo.addEdge (PTaVenezia, Lima, 0.91, "linea 1");
		grafo.addEdge (Lima, Loreto, 0.91, "linea 1");
		grafo.addEdge (Loreto, Pasteur, 0.91, "linea 1");
		grafo.addEdge (Pasteur, CaiazzoM2, 0.91, "linea 1");
		grafo.addEdge (CaiazzoM2, PiolaM2, 0.91, "linea 1");
		grafo.addEdge (PiolaM2, Rovereto, 0.91, "linea 1");
		grafo.addEdge (Rovereto, Turro, 0.91, "linea 1");
		grafo.addEdge (Turro, Gorla, 0.91, "linea 1");
		grafo.addEdge (Gorla, Precotto, 0.91, "linea 1");
		grafo.addEdge (Precotto, VillaSG, 0.91, "linea 1");
		
		// Linea 2
		grafo.addEdge (Famagosta, Romolo, 0.91, "linea 2");
		grafo.addEdge (Romolo, PtaGenovaFs, 0.91, "linea 2");
		grafo.addEdge (PtaGenovaFs, SAgostino, 0.91, "linea 2");
		grafo.addEdge (SAgostino, SAmbrogio, 0.91, "linea 2");
		grafo.addEdge (SAmbrogio, Cadorna, 0.91, "linea 2");
		grafo.addEdge (Cadorna, Lanza, 0.91, "linea 2");
		grafo.addEdge (Lanza, Moscova, 0.91, "linea 2");
		grafo.addEdge (Moscova, Garibaldi, 0.91, "linea 2");
		grafo.addEdge (Garibaldi, Gioia, 0.91, "linea 2");
		grafo.addEdge (Gioia, Centrale, 0.91, "linea 2");
		grafo.addEdge (Centrale, Caiazzo, 0.91, "linea 2");
		grafo.addEdge (Caiazzo, SondrioM3, 0.91, "linea 2");
		grafo.addEdge (SondrioM3, RepubblicaM3, 0.91, "linea 2");
		grafo.addEdge (RepubblicaM3, Loreto, 0.91, "linea 2");
		grafo.addEdge (Loreto, Piola, 0.91, "linea 2");
		grafo.addEdge (Piola, LambrateFS, 0.91, "linea 2");
		grafo.addEdge (LambrateFS, Udine, 0.91, "linea 2");
		grafo.addEdge (Udine, Cimiano, 0.91, "linea 2");
		grafo.addEdge (Cimiano, Crescenzago, 0.91, "linea 2");
		grafo.addEdge (Crescenzago, CascinaGobba, 0.91, "linea 2");

		// Linea 3
		grafo.addEdge (LodiTibb, PortaRomana, 0.91, "linea 3");
		grafo.addEdge (PortaRomana, Crocetta, 0.91, "linea 3");
		grafo.addEdge (Crocetta, Missori, 0.91, "linea 3");
		grafo.addEdge (Missori, Duomo, 0.91, "linea 3");
		grafo.addEdge (Duomo, Montenapoleone, 0.91, "linea 3");
		grafo.addEdge (Montenapoleone, Turati, 0.91, "linea 3");
		grafo.addEdge (Turati, Repubblica, 0.91, "linea 3");
		grafo.addEdge (Repubblica, Centrale, 0.91, "linea 3");
		grafo.addEdge (Centrale, Sondrio, 0.91, "linea 3");
		grafo.addEdge (Sondrio, Zara, 0.91, "linea 3");
		grafo.addEdge (Zara, Maciachini, 0.91, "linea 3");


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
		List<Nodo> camino = arbol.recorridoOptimo(arbol.CalcularRecorrido());
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