package Arbol;

import Grafo.Nodo;

public class Elemento {
	
	private double g;
	private int h,recorrido;
	private Nodo nodo;
	
	public Elemento(double g, int h, Nodo nodo){
		this.g = g;
		this.h = h;
		this.nodo = nodo;
	}
	
	public double getG(){
		return this.g;
	}
	
	public void setG(int g){
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
	
	public int getrecorrido(){
		return this.recorrido;
	}
	
	public void setrecorrido(int recorrido){
		this.recorrido = recorrido;
	}	
	
	public int recorridoParcial(){
		return this.recorrido-this.h;
	}
	
	public int recorridoMax(){
		return (int)this.g+this.h;
	}
	
	
	
}
