package Grafica;
public class Pixel {

	
	String Nombre, linea;
	int x,y;
	int distance;
	

	public Pixel(int x, int y, String Nombre, String linea) {
		this.x = x;
		this.y = y;
		this.Nombre = Nombre;
		this.linea = linea;
		this.distance = 0;
	}
	

	public void setNombre(String nombre){
		this.Nombre = nombre;
	}
	
	public String getNombre(){
		return this.Nombre;
	}

	public void setLinea(String linea){
		this.linea = linea;
	}
	
	public String getLinea(){
		return this.linea;
	}
	
	public void setCoordenas(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}	
	
	public int getY(){
		return this.y;
	}

	public void setDistance(int dist) {
		this.distance = dist;
	}

	public int getDistance() {
		return this.distance;
	}

}

