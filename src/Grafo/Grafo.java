package Grafo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import Arbol.*;
import jdd.graph.*;

	public class Grafo extends jdd.graph.Graph{
		
		
	List<Nodo> nodos = new ArrayList<Nodo>();;
	List<Edge> edges = new ArrayList<Edge>();;
	Map<String, List<Edge>> tabla = new HashMap<String, List<Edge>>();;
		
	public Grafo(boolean arg0) {
			super(arg0);
		}

	public Nodo addNode (String nombre, int x, int y){
		Nodo nodo = new Nodo(10);
		nodos.add(nodo);
		nodo.addNombre(nombre);
		nodo.addCoordenas(x, y);
		return nodo;
	} 
	
	public Edge addEdge (Nodo n1, Nodo n2, double d, String linea){
		Edge arista1 = new Edge(n1,n2,(int) d);
		edges.add(arista1);
		arista1.setWeight(d);
		arista1.setLabel(linea);
		if (tabla.isEmpty()){
			tabla.put(n1.getNombre(), new ArrayList<Edge>());
			tabla.put(n2.getNombre(), new ArrayList<Edge>());
		}
			if (tabla.containsKey(n1.getNombre())){
				List<Edge> lista = tabla.get(n1.getNombre());
				lista.add(arista1);
				tabla.remove(n1.getNombre());
				tabla.put(n1.getNombre(),lista);
			}
			else{
				List<Edge> lista = new ArrayList<Edge>();
				lista.add(arista1);
				tabla.put(n1.getNombre(),lista);
			}
		Edge arista2 = super.addEdge(n2, n1);
		arista2.setWeight(d);
		arista2.setLabel(linea);
			if (tabla.containsKey(n2.getNombre())){
				List<Edge> lista = tabla.get(n2.getNombre());
				lista.add(arista2);
				tabla.remove(n2.getNombre());
				tabla.put(n2.getNombre(),lista);
			}
			else{
				List<Edge> lista = new ArrayList<Edge>();
				lista.add(arista2);
				tabla.put(n2.getNombre(),lista);
			}
		return arista1;
		}
	
	public List<LTreeNode<Elemento>> getChild(LTreeNode<Elemento> nodo, Nodo fin){
		List <LTreeNode<Elemento>> lista = new ArrayList<LTreeNode<Elemento>>();
		List<Edge> aristas = tabla.get(nodo.element().getnodo().getNombre());
		Iterator<Edge> iterador = aristas.iterator();
		String nombre = "";
		if (nodo.getParent() != null){
			nombre = nodo.getParent().element().getnodo().getNombre();
		}
		while(iterador.hasNext()){
			Edge arista = iterador.next();
			Nodo hijo = (Nodo) arista.n2;
			if (hijo.getNombre()!= nombre){
				Elemento elemento = new Elemento(arista.weight,hijo.distancia(fin),hijo);
				LTreeNode<Elemento> node = new LTreeNode<Elemento>(elemento,nodo,null);
				lista.add(node);
			}
		}
		return lista;
	}
	
	
	
	public Map<String, List<Edge>> getMap (){
		return this.tabla;
	}
	}
	

