package Arbol;
import net.datastructures.*;


import java.util.*;
import java.util.List;

public class LTree<E> implements Tree<E> {
	protected LTreeNode<E> root=null;
	
	public int size() { 
		int numPos=0;
		for (Position<E> p: positions()) ++numPos;
		return numPos;
	}
	 
	public boolean isEmpty() {
		return (root==null);
	}
	
	public Iterator<E> iterator() {
		List<E> list = new LinkedList<E>();
		for (Position<E> p: positions()) list.add(p.element());
		return list.listIterator();
	}
	
	public Iterable<Position<E>> positions() {
		return nodeList(root);
	}
	
	public E replace(Position<E> v, E e) {
		LTreeNode<E> node = getLTreeNode(v);
		E tmp = node.element();
		node.setElement(e);
		return tmp;
	}
	
	public Position<E> root() throws EmptyTreeException {
		if (isEmpty()) throw new EmptyTreeException("Tree is empty");
		return root;
	}
	
	public Position<E> parent(Position<E> v) throws InvalidPositionException, BoundaryViolationException {
		if (isRoot(v)) throw new BoundaryViolationException("At root node");
		LTreeNode<E> node = getLTreeNode(v);
		return node.getParent();
	}
	
	public Iterable<Position<E>> children(Position<E> v) throws InvalidPositionException {
		return childrenList(v);
	}
		
	public boolean isInternal(Position<E> v) throws InvalidPositionException {
		return !isExternal(v);
	}
		 
	public boolean isExternal(Position<E> v) throws InvalidPositionException {
		LTreeNode<E> node = getLTreeNode(v);
		return false;
	}
		 
	public boolean isRoot(Position<E> v) throws InvalidPositionException {
		LTreeNode<E> node = getLTreeNode(v);
		return node==root();
	}
		 
	public Position<E> addRoot(E e) throws NonEmptyTreeException {
		if (root != null) {
			throw new NonEmptyTreeException("adding new root to nonempty tree");
		}
		root = new LTreeNode<E>(e,null,null);
		return root;
	}
		 
	public Position<E> addChild(E e,Position<E> v) throws InvalidPositionException {
		LTreeNode<E> node = getLTreeNode(v);
		LTreeNode<E> newNode = new LTreeNode<E>(e,node,null);
		List<LTreeNode<E>> lista = node.getChild();
		lista.add(lista.size(), newNode);
		node.setChild(lista);
		return newNode;
	}
		 
	public Position<E> addChild(Tree<E> t,Position<E> v) throws InvalidPositionException, EmptyTreeException {
		LTreeNode<E> t_node = getLTreeNode(t.root());
		LTreeNode<E> v_node = getLTreeNode(v);
		t_node.setParent(v_node);
		//t_node.setRight(v_node.getFirstChild());
		//v_node.setFirstChild(t_node);
		return t_node;
	}
		 
	private LTreeNode<E> getLTreeNode(Position<E> v) throws InvalidPositionException {
		if (v == null || !(v instanceof LTreeNode<?>)) {
			throw new InvalidPositionException("Invalid position");
		}
		return (LTreeNode<E>) v;
	}
	
	private Iterable<Position<E>> childrenList(Position<E> v) {
		return null;
	}
	
	private void addChildren(Position<E> child,List<Position<E>> list) {
		if (child!=null) {
			LTreeNode<E> childNode = getLTreeNode(child);
			list.add(child);
			//addChildren(childNode.getRight(),list);
		}
	}
	
	private List<Position<E>> nodeList(Position<E> v) {
		List<Position<E>> list = new LinkedList<Position<E>>();
		addAllNodes(v,list);
		return list;
	}
	
	private void addAllNodes(Position<E> node,List<Position<E>> list) {
		if (node!=null) {
			list.add(node);
			for (Position<E> child : childrenList(node))
				addAllNodes(child,list);
		}
	}
}
