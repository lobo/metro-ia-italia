package Grafo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodoTest {


    @Test
    public void distanciaIncorrecta() {
        Nodo nodo = new Nodo(0, "Jorge");
        nodo.addCoordenas(0, 0);
        Nodo nodo2 = new Nodo(1, "Pablo");
        nodo.addCoordenas(0, 1);
        assertEquals(nodo.distancia(nodo2), 1);
    }

    @Test
    public void distanciaCorrecta() {
        Nodo nodo = new Nodo(0, "Testnode");
        Nodo nodo2 = new Nodo(1, "Other Nodo");
        nodo.addCoordenas(1, 1);
        nodo2.addCoordenas(1, 3);
        Double dings = Math.sqrt((Math.pow(0, 2) + Math.pow(2, 2)));
        assertEquals(2.0, dings, 0.001);
        assertEquals(nodo.distancia(nodo2), 2);
    }

    @Test
    public void distanciaTest2() {
        Nodo nodo = new Nodo(0, "Testnode");
        Nodo nodo2 = new Nodo(1, "Other Nodo");
        nodo.addCoordenas(1, 1);
        nodo2.addCoordenas(2,2);
        assertEquals(nodo.distancia(nodo2), 1.0, 0.0001);
    }

    @Test
    public void labelAndNombreWhatIsWhat() {
        Nodo nodo = new Nodo(0, "Testnode");
        Nodo nodo2 = new Nodo(1, "Other Nodo");
        assertEquals(nodo.getLabel(), "Testnode");
        assertEquals(nodo2.getLabel(), "Other Nodo");
        assertEquals(nodo2.getNombre(), (String)null);
    }

    @Test
    public void addNombreAndgetNombre() {
        Nodo nodo = new Nodo(0, "Testnode");
        nodo.addNombre("Jürgen");
        assertEquals(nodo.getNombre(), "Jürgen");
    }

    @Test
    public void addCoordenas() {
        Nodo nodo = new Nodo(0, "Testnode");
        nodo.addCoordenas(1, 1);
        assertEquals(nodo.x, 1.0, 0.0001);
        assertEquals(nodo.y, 1.0, 0.0001);
    }

    @Test
    public void getX() {
        Nodo nodo = new Nodo(0, "Testnode");
        nodo.x = 1;
        assertEquals(nodo.getX(), 1.0, 0.0001);
    }

    @Test
    public void getY() {
        Nodo nodo = new Nodo(0, "Testnode");
        nodo.y = 1;
        assertEquals(nodo.getY(), 1);
    }

    @Test
    public void divisionOfInts() {
        int seconds = 65;
        assertEquals((65 / 60), 1);
        assertEquals((119 / 60), 1);
    }
    /**
    @Test
    public void toString() {
        assertEquals(true, true);
    }
    **/
}