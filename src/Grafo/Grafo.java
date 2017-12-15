package Grafo;
import java.util.*;

import Arbol.*;
import jdd.graph.*;

/** Graph class based on Nodo and jdd.graph.Graph.
 * As members: Two lists, "nodos" of Nodo type and "edges" of Edge type.
 * Also: HashMap mapping Strings to Lists of Edges. Strings represent the names of the metro stations,
 * the lists contain the in- and outgoing edges of metro stations.
 */
public class Grafo extends jdd.graph.Graph{


	List<Nodo> nodos = new ArrayList<Nodo>();
	List<Edge> edges = new ArrayList<Edge>();
	Map<String, List<Edge>> tabla = new HashMap<String, List<Edge>>();

	public Grafo(boolean arg0) { // the bool switches directed / undirected graph structures, not used
		super(arg0);
	}

	/** Create new Nodo, put it in nodos list and return Nodo. Names Nodo and gives coord's x, y **/
	public Nodo addNode (String nombre, int x, int y){
		Nodo nodo = new Nodo(10);
		nodos.add(nodo);
		nodo.addNombre(nombre);
		nodo.addCoordenas(x, y);
		return nodo;
	}

	/** Create new Edge and include it in the list edges
	 * Sets attributes: Nodos n1, n2 - begin and target of node
	 * int d: weight of edge
	 * String linea: represents the metro line
	 * Returns: an edge (from JDD package)
	 **/
	public Edge addEdge (Nodo n1, Nodo n2, int d, String linea) {
		Edge arista1 = new Edge(n1,n2, d);
		edges.add(arista1); // we are creating 2 aristas. put them in edges
		arista1.setWeight(d);
		arista1.setLabel(linea);
		// If HashMap<String, List<Edge> is empty, create entries for n1 (begin) and n2 (end) of edge
		// ...or just for n1?
		if (tabla.isEmpty()){
			ArrayList<Edge> list1 = new ArrayList<>();
			list1.add(arista1);
			//ArrayList<Edge> list2 = new ArrayList<>();
			//list2.add(arista1);
			tabla.put(n1.getNombre(), list1);
			//tabla.put(n2.getNombre(), list2);
		}
		// if n1 has an entry, add new edge arista1 to list
		else if (tabla.containsKey(n1.getNombre())){
			tabla.get(n1.getNombre()).add(arista1);
			// no error handling
		}
		// tabla not empty, doesn't have n1
		else{
			List<Edge> lista = new ArrayList<Edge>();
			lista.add(arista1);
			tabla.put(n1.getNombre(),lista);
		}
		// creates edge by calling jdd.graph.Graph.addEdge() for some reason, different from method above
		// adds reverse edge
		Edge arista2 = new Edge (n2, n1, d);
		// we don't want the reverse edge in the edge list
		// here we add the attributes
		arista2.setWeight(d);
		arista2.setLabel(linea);
		// here, table has to exist
		if (tabla.containsKey(n2.getNombre())){
			tabla.get(n2.getNombre()).add(arista2);
			}
		else{
			List<Edge> lista = new ArrayList<Edge>();
			lista.add(arista2);
			tabla.put(n2.getNombre(),lista);
		}
		return arista1;
	}

	/** returns list of children of LTreeNode<Elemento> nodo, encapsulating them in LTree data structures **/
	public List<LTreeNode<Elemento>> getChildren(LTreeNode<Elemento> nodo, Nodo fin){
		List <LTreeNode<Elemento>> lista = new ArrayList<LTreeNode<Elemento>>();
		// aristas is adjacencylist of nodo.element().getnodo().getNombre() from tabla
		List<Edge> aristas = tabla.get(nodo.element().getnodo().getNombre());
		Iterator<Edge> iterador = aristas.iterator();
		String nombre = ""; // ??
		// set nombre to parent node of nodo
		if (nodo.getParent() != null){
			nombre = nodo.getParent().element().getnodo().getNombre();
		}
		// now, iterate over the adjacency list of all edges of nodo.getnodo()
		while(iterador.hasNext()){
			Edge arista = iterador.next();
			Nodo hijo = (Nodo) arista.n2; // probably unnecessary cast
			if (hijo.getNombre()!= nombre){ // only catch outgoing edges (hijos) not ending in this Nodo
				Elemento elemento = new Elemento(arista.weight,(int) hijo.distancia(fin),hijo); // new Elemento from hijo
				LTreeNode<Elemento> node = new LTreeNode<Elemento>(elemento,nodo,null); // LTreeNode from Elemento
				lista.add(node); // put LTreeNode<Elemento> in list..
			}
		}
		return lista; // return list
	}


	/** Return tabla **/
	public Map<String, List<Edge>> getMap (){
		return this.tabla;
	}

	public List<Edge> getGrafoEdges() {
		return edges;
	}

	/**
	public Edge findEdge(Nodo nodo1, Nodo nodo2) {
		for (Edge edge : edges) {
			if (edge.n1 == nodo1)
		}
	}
	 **/

}
	

