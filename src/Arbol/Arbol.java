package Arbol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import jdd.graph.Edge;
import Grafo.*;

public class Arbol  {

	Nodo salida;
	Nodo llegada;
	Grafo grafo;
	Map<String, List<Edge>> tabla;
	LTree<Elemento> arbol = new LTree<Elemento>();
	List<LTreeNode<Elemento>> posibles = new ArrayList<LTreeNode<Elemento>>();
	
 public Arbol(Nodo salida,Nodo llegada,Grafo grafo){
	 this.salida = salida;
	 this.llegada = llegada;
	 this.grafo = grafo;
	 this.arbol.setRoot(new Elemento(0,salida.distancia(llegada),salida));
	 this.arbol.root.element().setrecorrido(salida.distancia(llegada));
	 this.arbol.root.setChildren(grafo.getChildren(this.arbol.root, llegada));
	 addList(posibles,this.arbol.root.getChildren());
 }
	
 
 private void addList(List<LTreeNode<Elemento>> lis,List<LTreeNode<Elemento>> hijos){
	 Iterator<LTreeNode<Elemento>> it = hijos.iterator();
	 while(it.hasNext()){
		 lis.add(it.next());
	 }
 }
 
public LTreeNode<Elemento> CalcularRecorrido(){
	LTreeNode<Elemento> nodo = this.arbol.root;
	if (salida.getNombre()!=llegada.getNombre()){
		nodo = selectChild(nodo);
		while(!isEnd(nodo)){
			nodo = selectChild(nodo);
		}
	}
	return nodo;
} 
 
 public LTreeNode<Elemento> selectChild(LTreeNode<Elemento>padre){
	 LTreeNode<Elemento> nodo = new LTreeNode<Elemento>(null,null,null);
	 LTreeNode<Elemento> nod = new LTreeNode<Elemento>(null,null,null);
	 Iterator<LTreeNode<Elemento>> iterador = posibles.iterator(); 
	 double gh = 0;
	 nod = iterador.next();
	 gh = gh(nod);
	 nodo=nod;
	 int i = 0;
	 int j = 0;
	 while(iterador.hasNext()){
		 nod = iterador.next();
		 i++;
		 if (gh>gh(nod) && 
			(nod.element().getnodo().getNombre()!= padre.element().getnodo().getNombre())){
			 gh = gh(nod);
			 nodo=nod;
			 j = i;
		 }
	 }

		 //System.out.println(nodo.element().getnodo().getNombre());
		 
		 nodo.element().setrecorrido(gh);
		 
		 i=0;
		 posibles.remove(j);
		 iterador = posibles.iterator(); 
		 List<Integer> borrar =new ArrayList<Integer>();
		 while(iterador.hasNext()){
			 if(iterador.next().element().getnodo().getNombre()==nodo.element().getnodo().getNombre())
				 borrar.add(i);
			 i++;
		 }
		 
		 Iterator <Integer >iterad = borrar.iterator(); 
		 while(iterad.hasNext()){
			 posibles.remove(iterad.next());
		 }
		 
		 if (nodo.getChildren() == null){
			 nodo.setChildren(grafo.getChildren(nodo, llegada));
			 addList(posibles,nodo.getChildren());
		 }
	 return nodo;
 }
 
 public double gh (LTreeNode<Elemento> nodo){
	 return nodo.getParent().element().recorridoParcial() + nodo.element().recorridoMax();
 }
 
 public boolean isEnd(LTreeNode<Elemento>fin){
	 return (fin.element().getnodo().getNombre() == llegada.getNombre());
 }
 
 public List<Nodo> recorridoOptimo(LTreeNode<Elemento> fin){
	 List<Nodo> recorrido = new ArrayList<Nodo>();
	 LTreeNode<Elemento> posicion = fin;
	 boolean condicion = true;
	 while(condicion){
	 if (posicion.getParent()==null){
		 recorrido.add(((Elemento)posicion.element()).getnodo());
		 condicion = false;
	 }
	 else{
		 recorrido.add(((Elemento)posicion.element()).getnodo());
		 posicion = posicion.getParent();
	 }
	 }
	 return recorrido;
 }
 
 
 
 

}
