package Arbol;
import java.util.List;

import net.datastructures.*;

public class LTreeNode<E> implements Position<E> {
	private E element;
	private LTreeNode<E> parent;
	private List<LTreeNode<E>> Child;
	
	public LTreeNode(E e, LTreeNode<E> parent, List<LTreeNode<E>> Child) {
		this.element = e;
		this.parent = parent;
		this.Child = Child;
	}
		
	public void setElement(E element) {
		this.element = element;
	}
	
	public E element() {
		return element;
	}
	
	public void setParent(LTreeNode<E> parent) {
		this.parent = parent;
	}
	
	public LTreeNode<E> getParent() {
		return parent;
	}
	
	public void setChild(List<LTreeNode<E>> Child) {
		this.Child = Child;
	}
	
	public List<LTreeNode<E>> getChild() {
		return Child;
	}
}
