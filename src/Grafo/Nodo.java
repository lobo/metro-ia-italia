package Grafo;
public class Nodo extends jdd.graph.Node{

	
	String Nombre;
	int x,y;
	
	
	public Nodo(int arg0, String arg1) {
		super(arg0, arg1);
	}

	public Nodo(int arg0) {
		super(arg0);
	}
	
	public int distancia(Nodo n){
		int j,k;
		j = this.x - n.x;
		k = this.y - n.y;
		int re = (((j^2)+(k^2))^(1/2));
		if (re>=0)
			return re;
		else return -re;
	}
	
	public void addNombre(String nombre){
		this.Nombre = nombre;
	}
	
	public String getNombre(){
		return this.Nombre;
	}
	
	public void addCoordenas(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}	
	
	public int getY(){
		return this.y;
	}
}
