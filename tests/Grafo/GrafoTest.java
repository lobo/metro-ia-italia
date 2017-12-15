package Grafo;

import jdd.graph.Edge;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class GrafoTest {

    @Test
    public void addNode() {
        Grafo graph = new Grafo(true);
        assertTrue(graph.getMap().isEmpty());
        Nodo node1 = graph.addNode("Franz", 1, 1);
        Nodo node2 = graph.addNode("", 0, 0);
        Nodo node3 = graph.addNode("Jürgen", 3, 5);
        Nodo node4 = graph.addNode("Dieter", -1, -1);
        assertEquals(graph.nodos.size(), 4);
        assertTrue(graph.nodos.contains(node1));
        assertTrue(graph.nodos.contains(node2));
        assertTrue(graph.nodos.contains(node3));
        assertTrue(graph.nodos.contains(node4));
    }

    @Test
    public void bullshitTest() {
        boolean check = false;
        if (true) {
        } else {
            check = true;
        }
        assertFalse(check);
    }

    @Test
    public void addEdge1() {
        Grafo graph = new Grafo(true);
        assertTrue(graph.tabla.isEmpty());
        assertFalse(graph.tabla.containsKey(""));
        Nodo node2 = graph.addNode("", 0, 0);
        Nodo node3 = graph.addNode("Jürgen", 3, 5);
        Edge edge2 = graph.addEdge(node2, node3, 100, "Metro 2033");
        assertTrue(graph.edges.contains(edge2));
        assertTrue(graph.tabla.containsKey(""));
        assertTrue(graph.tabla.containsKey("Jürgen"));
        List<Edge> list = graph.tabla.get("");
        for (int count = 0; count < list.size(); count++) {
            Edge edge = list.get(count);
            System.out.println("#" + Integer.toString(count) + " Node 1: " + edge.n1.toString()
                    + " , Node 2: " + edge.n2.toString());
        }
        assertEquals(graph.tabla.get("Jürgen").size(), 1);
        assertEquals(graph.tabla.get("").size(), 1);
    }

    @Test
    public void addEdge2() {
        Grafo graph = new Grafo(true);
        assertTrue(graph.tabla.isEmpty());
        assertFalse(graph.tabla.containsKey(""));
        Nodo node1 = graph.addNode("Franz", 1, 1);
        Nodo node2 = graph.addNode("", 0, 0);
        Nodo node3 = graph.addNode("Jürgen", 3, 5);
        Nodo node4 = graph.addNode("Dieter", -1, -1);
        Edge edge1 = graph.addEdge(node1, node2, 100, "Metro 2033");
        Edge edge2 = graph.addEdge(node2, node3, 100, "Metro 2033");
        Edge edge3 = graph.addEdge(node3, node4, 100, "Metro 2033");
        assertEquals(graph.edges.size(), 3);
        assertTrue(graph.edges.contains(edge1));
        assertTrue(graph.edges.contains(edge2));
        assertTrue(graph.edges.contains(edge3));
        assertTrue(graph.tabla.containsKey("Franz"));
        assertTrue(graph.tabla.containsKey("")); // creates problems for addEdge
        assertTrue(graph.tabla.containsKey("Jürgen"));
        assertTrue(graph.tabla.containsKey("Dieter"));
        assertEquals(graph.tabla.get("Jürgen").size(), 2);
        System.out.println("hello world");
        System.out.println(graph.tabla.get("").toString());
        List<Edge> list = graph.tabla.get("");
        for (int count = 0; count < list.size(); count++) {
            Edge edge = list.get(count);
            System.out.println("#" + Integer.toString(count) + " Node 1: " + edge.n1.toString()
                    + " , Node 2: " + edge.n2.toString());
        }
        assertEquals(graph.tabla.get("").size(), 2); // here we have 3
        assertTrue(graph.tabla.get("Franz").contains(edge1));
        assertTrue(graph.tabla.get("").contains(edge2));
        assertTrue(graph.tabla.get("Jürgen").contains(edge3));
    }

    @Test
    public void getChildren() {
    }
}