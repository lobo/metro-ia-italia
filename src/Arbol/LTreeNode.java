package Arbol;
import java.util.List;

import net.datastructures.*;

/** Elements of Tree thingy with members element (generic type), LTreeNode<E> parent as the parent node,
 * and a list of LTreeNodes which would be the children of this thingy. It seems that this is a directed graph therefore,
 * what is called a tree in CS. So it must have a root and spread out from there,
 * so that each node is parent and/or children....
 * Members:
 * E element
 * LTreeNode<E> parent
 * List of LTreeNode's "children", which would more aptly be called children
 * **/
public class LTreeNode<E> implements Position<E> {
	private E element;
	private LTreeNode<E> parent;
	private List<LTreeNode<E>> children; // in the plural
	
	public LTreeNode(E e, LTreeNode<E> parent, List<LTreeNode<E>> Child) {
		this.element = e;
		this.parent = parent;
		this.children = Child;
	}
		
	public void setElement(E element) {
		this.element = element;
	}

	/** only function included in Position interface **/
	public E element() {
		return element;
	}
	
	public void setParent(LTreeNode<E> parent) {
		this.parent = parent;
	}
	
	public LTreeNode<E> getParent() {
		return parent;
	}
	
	public void setChildren(List<LTreeNode<E>> Child) {
		this.children = Child;
	}
	
	public List<LTreeNode<E>> getChildren() {
		return children;
	}
}
