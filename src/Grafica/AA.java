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

	public AA(String salida, String llegada) {

		grafo = new Grafo(true);

		// Creacion de la linea de metro

		// ESTACIONES
		// Estaciones linea 1
		Nodo Bisceglie = grafo.addNode("Bisceglie", 0, 17);
		Nodo Inganni = grafo.addNode("Inganni", 1, 16);
		Nodo Primaticcio = grafo.addNode("Primaticcio", 2, 15);
		Nodo Bandenere = grafo.addNode("Bandenere", 3, 14);
		Nodo Gambara = grafo.addNode("Gambara", 4, 13);
		Nodo DeAngeli = grafo.addNode("DeAngeli", 5, 12);
		Nodo Wagner = grafo.addNode("Wagner", 6, 11);
		Nodo Pagano = grafo.addNode("Pagano", 7, 10);
		Nodo QT8 = grafo.addNode("QT8", 3, 6);
		Nodo LottoFiera = grafo.addNode("LottoFiera", 4, 7);
		Nodo AmendolaFiera = grafo.addNode("AmendolaFiera", 5, 8);
		Nodo Buonarroti = grafo.addNode("Buonarroti", 6, 9);
		Nodo Conciliazione = grafo.addNode("Conciliazione", 8, 10);
		
		Nodo CadornaR = grafo.addNode("Cadorna-Linea Roja", 9, 10);
		Nodo CadornaInt = grafo.addNode("Cadorna-M1", 9, 10);
		Nodo CadornaTrans = grafo.addNode("Cadorna-M2", 9, 10);
		
		Nodo Cairoli = grafo.addNode("Cairoli", 10, 10); //done
		Nodo Cordusio = grafo.addNode("Cordusio", 11, 10); //done
	
		Nodo DuomoR = grafo.addNode("Duomo-Linea Roja", 12, 10); //done
		Nodo DuomoInt = grafo.addNode("Duomo-M1", 12, 10);
		Nodo DuomoTrans = grafo.addNode("Duomo-M3", 12, 10);
		
		Nodo SBabila = grafo.addNode("SBabila", 13, 10); //done
		Nodo Palestro = grafo.addNode("Palestro", 14, 9); //done
		Nodo PTaVenezia = grafo.addNode("PTaVenezia", 15, 8); //done
		Nodo Lima = grafo.addNode("Lima", 15, 7); //done
		
		Nodo LoretoR = grafo.addNode("Loreto-Linea Roja", 15, 6); //done
		Nodo LoretoInt = grafo.addNode("Loreto-M1", 15, 6);
		Nodo LoretoTrans = grafo.addNode("Loreto-M2", 15, 6);
		
		Nodo Pasteur = grafo.addNode("Pasteur", 15, 5); //done
		Nodo Rovereto = grafo.addNode("Rovereto", 15, 4); //done
		Nodo Turro = grafo.addNode("Turro", 15, 3); //done
		Nodo Gorla = grafo.addNode("Gorla", 15, 2); //done
		Nodo Precotto = grafo.addNode("Precotto", 15, 1); //done
		Nodo VillaSG = grafo.addNode("VillaSG", 15, 0); //done
		
		
		// Estaciones linea 2
		Nodo Famagosta = grafo.addNode("Famagosta", 9, 15); //done
		Nodo Romolo = grafo.addNode("Romolo", 9, 14); //done
		Nodo PtaGenovaFs = grafo.addNode("PtaGenovaFs", 9, 13); //done
		Nodo SAgostino = grafo.addNode("SAgostino", 9, 12); //done
		Nodo SAmbrogio = grafo.addNode("SAmbrogio", 9, 11); //done
		
		Nodo CadornaV = grafo.addNode("Cadorna-Linea Verde", 9, 10);
		
		Nodo Lanza = grafo.addNode("Lanza", 9, 9); //done
		Nodo Moscova = grafo.addNode("Moscova", 10, 8); //done
		Nodo Garibaldi = grafo.addNode("Garibaldi", 11, 7); //done
		Nodo Gioia = grafo.addNode("Gioia", 12, 6); //done
		
		Nodo CentraleV = grafo.addNode("Centrale-Linea Verde", 13, 6); //done
		Nodo CentraleInt = grafo.addNode("Centrale-M2", 13, 6);
		Nodo CentraleTrans = grafo.addNode("Centrale-M3", 13, 6);
		
		Nodo Caiazzo = grafo.addNode("Caiazzo", 14, 6); // revisar este
		
		Nodo LoretoV = grafo.addNode("Loreto-Linea Verde", 15, 6);
		
		Nodo Piola = grafo.addNode("Piola", 16, 6); //done
		Nodo LambrateFS = grafo.addNode("LambrateFS", 17, 6); //done
		Nodo Udine = grafo.addNode("Udine", 18, 5); //done
		Nodo Cimiano = grafo.addNode("Cimiano", 18, 4); //done
		Nodo Crescenzago = grafo.addNode("Crescenzago", 18, 3); //done
		Nodo CascinaGobba = grafo.addNode("CascinaGobba", 18, 2); //done
		
		
		// Estaciones linea 3
		Nodo LodiTibb = grafo.addNode("LodiTibb", 15, 14); //done
		Nodo PortaRomana = grafo.addNode("PortaRomana", 14, 13); //done
		Nodo Crocetta = grafo.addNode("Crocetta", 13, 12); //done
		Nodo Missori = grafo.addNode("Missori", 12, 11); //done
		
		Nodo DuomoA = grafo.addNode("Duomo-Linea Amarilla", 12, 10);
		
		Nodo Montenapoleone = grafo.addNode("Montenapoleone", 12, 9);//done
		Nodo Turati = grafo.addNode("Turati", 13, 8); //done
		Nodo Repubblica = grafo.addNode("Repubblica", 13, 7); //done	
		
		Nodo CentraleA = grafo.addNode("Centrale-Linea Amarilla", 13, 6);
		
		Nodo Sondrio = grafo.addNode("Sondrio", 13, 5); //done
		Nodo Zara = grafo.addNode("Zara", 13, 4); //done
		Nodo Maciachini = grafo.addNode("Maciachini", 12, 3); //done 
	
		
		// Linea 1
		grafo.addEdge (Bisceglie, Inganni, 87, "linea 1");
		grafo.addEdge (Inganni, Primaticcio, 82, "linea 1");
		grafo.addEdge (Primaticcio, Bandenere, 84, "linea 1");
		grafo.addEdge (Bandenere, Gambara, 84, "linea 1");
		grafo.addEdge (Gambara, DeAngeli, 78, "linea 1");
		grafo.addEdge (DeAngeli, Wagner, 75, "linea 1");
		grafo.addEdge (Wagner, Pagano, 79, "linea 1");
		grafo.addEdge (QT8, LottoFiera, 109, "linea 1");
		grafo.addEdge (LottoFiera, AmendolaFiera, 93, "linea 1");
		grafo.addEdge (AmendolaFiera, Buonarroti, 69, "linea 1");
		grafo.addEdge (Buonarroti, Pagano, 82, "linea 1");
		grafo.addEdge (Pagano, Conciliazione, 81, "linea 1");
		grafo.addEdge (Conciliazione, CadornaR, 208, "linea 1");
		
		// Intercambio
		grafo.addEdge (Cairoli, CadornaInt, 211, "linea 1");
		grafo.addEdge (Conciliazione, CadornaInt, 208, "linea 1");		
		grafo.addEdge (CadornaInt, CadornaTrans, 239, "Trasbordo");
		grafo.addEdge (CadornaTrans, Lanza, 96, "linea 2");
		grafo.addEdge (CadornaTrans, SAmbrogio, 105, "linea 2");	
		
		grafo.addEdge (CadornaR, Cairoli, 211, "linea 1");
		grafo.addEdge (Cairoli, Cordusio, 275, "linea 1");
		grafo.addEdge (Cordusio, DuomoR, 212, "linea 1");
		
		// Intercambio
		grafo.addEdge (SBabila, DuomoInt, 212, "linea 1");
		grafo.addEdge (Cordusio, DuomoInt, 212, "linea 1");
		grafo.addEdge (DuomoInt, DuomoTrans, 220, "Trasbordo");
		grafo.addEdge (DuomoTrans, Montenapoleone, 88, "linea 3");
		grafo.addEdge (DuomoTrans, Missori, 81, "linea 3");
		
		grafo.addEdge (DuomoR, SBabila, 93, "linea 1");
		grafo.addEdge (SBabila, Palestro, 77, "linea 1");
		grafo.addEdge (Palestro, PTaVenezia, 259, "linea 1");
		grafo.addEdge (PTaVenezia, Lima, 87, "linea 1");
		grafo.addEdge (Lima, LoretoR, 86, "linea 1");
			
		// Intercambio
		grafo.addEdge (Pasteur, LoretoInt, 76, "linea 1");
		grafo.addEdge (Lima, LoretoInt, 86, "linea 1");
		grafo.addEdge (LoretoInt, LoretoTrans, 170, "Trasbordo");
		grafo.addEdge (LoretoTrans, Caiazzo, 132, "linea 2");
		grafo.addEdge (LoretoTrans, Piola, 107, "linea 2");
		
		grafo.addEdge (LoretoR, Pasteur, 76, "linea 1");
		grafo.addEdge (Pasteur, Rovereto, 78, "linea 1");
		grafo.addEdge (Rovereto, Turro, 77, "linea 1");
		grafo.addEdge (Turro, Gorla, 78, "linea 1");
		grafo.addEdge (Gorla, Precotto, 119, "linea 1");
		grafo.addEdge (Precotto, VillaSG, 77, "linea 1");
		
		// Linea 2
		grafo.addEdge (Famagosta, Romolo, 97, "linea 2");
		grafo.addEdge (Romolo, PtaGenovaFs, 102, "linea 2");
		grafo.addEdge (PtaGenovaFs, SAgostino, 104, "linea 2");
		grafo.addEdge (SAgostino, SAmbrogio, 227, "linea 2");
		grafo.addEdge (SAmbrogio, CadornaV, 105, "linea 2");	
		grafo.addEdge (CadornaV, Lanza, 96, "linea 2");
		grafo.addEdge (Lanza, Moscova, 95, "linea 2");
		grafo.addEdge (Moscova, Garibaldi, 98, "linea 2");
		grafo.addEdge (Garibaldi, Gioia, 104, "linea 2");
		grafo.addEdge (Gioia, CentraleV, 87, "linea 2");
		
		// Intercambio
		grafo.addEdge (Gioia, CentraleInt, 87, "linea 2");
		grafo.addEdge (Caiazzo, CentraleInt, 130, "linea 2");
		grafo.addEdge (CentraleInt, CentraleTrans, 278, "Trasbordo");
		grafo.addEdge (CentraleTrans, Sondrio, 132, "linea 3");
		grafo.addEdge (CentraleTrans, Repubblica, 107, "linea 3");
		
		grafo.addEdge (CentraleV, Caiazzo, 130, "linea 2");
		grafo.addEdge (Caiazzo, LoretoV, 132, "linea 2");
		grafo.addEdge (LoretoV, Piola, 107, "linea 2");
		grafo.addEdge (Piola, LambrateFS, 89, "linea 2");
		grafo.addEdge (LambrateFS, Udine, 98, "linea 2");
		grafo.addEdge (Udine, Cimiano, 131, "linea 2");
		grafo.addEdge (Cimiano, Crescenzago, 95, "linea 2");
		grafo.addEdge (Crescenzago, CascinaGobba, 120, "linea 2");

		// Linea 3
		grafo.addEdge (LodiTibb, PortaRomana, 88, "linea 3");
		grafo.addEdge (PortaRomana, Crocetta, 94, "linea 3");
		grafo.addEdge (Crocetta, Missori, 74, "linea 3");
		grafo.addEdge (Missori, DuomoA, 81, "linea 3");
		grafo.addEdge (DuomoA, Montenapoleone, 88, "linea 3");
		grafo.addEdge (Montenapoleone, Turati, 76, "linea 3");
		grafo.addEdge (Turati, Repubblica, 78, "linea 3");
		grafo.addEdge (Repubblica, CentraleA, 88, "linea 3");
		grafo.addEdge (CentraleA, Sondrio, 72, "linea 3");
		grafo.addEdge (Sondrio, Zara, 72, "linea 3");
		grafo.addEdge (Zara, Maciachini, 96, "linea 3");


		Iterator<Edge> l = grafo.getMap().get(salida).iterator();
		boolean cond = true;
		Edge tramo;
		while(l.hasNext() && cond){
			tramo = l.next();
			if(((Nodo)tramo.n1).getNombre() == salida) {
				this.salida = (Nodo)tramo.n1;
				cond = false;
			}
		}
		

		Iterator<Edge> s = grafo.getMap().get(llegada).iterator();
		cond = true;
		while(s.hasNext() && cond){
			tramo = s.next();
			if(((Nodo)tramo.n1).getNombre() == llegada) {
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
			Pixel pixel = new Pixel(nodo.getX(), nodo.getY(), nodo.getNombre(), linea);
			recorrido.add(pixel);
		}
		return recorrido;
	}
}
