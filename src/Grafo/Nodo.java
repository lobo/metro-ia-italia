package Grafo;

/** Node object with Nombre and Coordenas as doubles **/
public class Nodo extends jdd.graph.Node{


	String Nombre;
	int x,y;

	/** Construct node invoking jdd.graph.Node(). arg0 sets node ID, arg1 the label **/
	public Nodo(int arg0, String arg1) {
		super(arg0, arg1);
	}

	/** Does the same as above, but sets label to (String)null **/
	public Nodo(int arg0) {
		super(arg0);
	}

	/**
	public void addCoordenas(int x, int y){
		this.x = x;
		this.y = y;
	}**/

	public void addCoordenas(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/** THIS FUNCTION DOES NOT CALCULATE THE DISTANCE
	 *  The ^ operator in Java implements binary XOR, not 2^2 = 4.
 	 * @param Nodo n
	 * @return Some int with no relation to this nodo or n
	 */
	public int distanciaVieja(Nodo n) {
		int j;
		int k;
		j = this.x - n.x;
		k = this.y - n.y;
		int re = (((j^2) + (k^2)) ^ (1/2));
		if (re >= 0) {
			return re;
		}
		else {
			return -re;
		}
	}

	/** Compute distance by computing the norm of the vector between this node and Nodo n **/
	public int distancia(Nodo n){
		int j;
		int k;
		j = this.x - n.x;
		k = this.y - n.y;
		Double re = Math.sqrt((Math.pow(j, 2) + Math.pow(k, 2)));
        return re.intValue();
	}

	public void addNombre(String nombre){
		this.Nombre = nombre;
		this.setLabel(nombre);
	}

	public String getNombre(){
		return this.Nombre;
	}


	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}

	public String toString() {
		StringBuilder re = new StringBuilder();
		re.append(this.Nombre + " x, y: " + Integer.toString(this.getX()) + ", " + Integer.toString(this.getY()));
		return re.toString();
	}
}
