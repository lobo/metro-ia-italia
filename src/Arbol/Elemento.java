package Arbol;

import Grafo.Nodo;

/** Encapsulates Nodo and adds double recorrido, int h, double g as members **/
public class Elemento {
	
	private double g;
	private int h;
    private double recorrido;
	private Nodo nodo;
	
	public Elemento(double g, int h, Nodo nodo){
		this.g = g;
		this.h = h;
		this.nodo = nodo;
	}
	
	public double getG(){
		return this.g;
	}
	
	public void setG(double g){
		this.g = g;
	}
	
	public int getH(){
		return this.h;
	}
	
	public void setH(int h){
		if(h>=0)
			this.h = h;
		else
			this.h = -h;
	}	
	
	public Nodo getnodo(){
		return this.nodo;
	}
	
	public void setnodo(Nodo nodo){
		this.nodo = nodo;
	}
	
	public double getrecorrido(){
		return this.recorrido;
	}
	
	public void setrecorrido(double recorrido){
		this.recorrido = recorrido;
	}	
	
	public double recorridoParcial(){
		return this.recorrido-this.h;
	}
	
	public int recorridoMax(){
		return (int)this.g+this.h;
	}
	
	
	
}
