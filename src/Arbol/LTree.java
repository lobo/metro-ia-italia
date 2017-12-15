package Arbol;
import net.datastructures.*;


import java.util.*;
import java.util.List;

/** Tree object without a constructor **/
public class LTree<E> implements Tree<E> {
	protected LTreeNode<E> root=null;

	/** calls positions() and counts items **/
	public int size() { 
		int numPos=0;
		for (Position<E> p: positions()) ++numPos;
		return numPos;
	}

	/** If we have a root, return false **/
	public boolean isEmpty() {
		return (root==null);
	}

	/** Again go through nodeList via positions(), add them to a list and return an iterator created from the list **/
	public Iterator<E> iterator() {
		List<E> list = new ArrayList<E>();
		for (Position<E> p: positions()) list.add(p.element());
		return list.listIterator();
	}

	/** Forms a list of all childs of our root node, and returns iterator from the list **/
	public Iterable<Position<E>> positions() {
		return nodeList(root);
	}

	/** Replaces Elemento of LTreeNode **/
	public E replace(Position<E> v, E e) {
		LTreeNode<E> node = getLTreeNode(v); // type cast v
		E tmp = node.element(); // get Elemento from v
		node.setElement(e); // put e into v as element
		return tmp; // return previous element of v
	}

	/** Return root of tree if it exists **/
	public Position<E> root() throws EmptyTreeException {
		if (isEmpty()) throw new EmptyTreeException("Tree is empty");
		return root;
	}

	/** If v it not root, return v.getParent() **/
	public Position<E> parent(Position<E> v) throws InvalidPositionException, BoundaryViolationException {
		if (isRoot(v)) throw new BoundaryViolationException("At root node");
		LTreeNode<E> node = getLTreeNode(v);
		return node.getParent();
	}

	/** returns null because childrenList returns null as a placeholder function. DO NOT USE! **/
	/**
	 *
	 * @param v
	 * @return
	 * @throws InvalidPositionException
	 */
	public Iterable<Position<E>> children(Position<E> v) throws InvalidPositionException {
		return childrenList(v);
	}

	/** returns true.. always. **/
	public boolean isInternal(Position<E> v) throws InvalidPositionException {
		//return !isExternal(v);
		getLTreeNode(v);
		return true; // faster
	}

	/** Always returns false! **/
	public boolean isExternal(Position<E> v) throws InvalidPositionException {
		LTreeNode<E> node = getLTreeNode(v);
		return false;
	}

	/** checks for identity of v to this.root via this.root() **/
	public boolean isRoot(Position<E> v) throws InvalidPositionException {
		LTreeNode<E> node = getLTreeNode(v);
		return node==root(); // root is the only member variable of LTree, root() returns it
	}

	/** If tree is not empty, convert generic Position to LTreeNode and set as root of tree **/
	public Position<E> setRoot(E e) throws NonEmptyTreeException {
		if (root != null) {
			throw new NonEmptyTreeException("adding new root to nonempty tree");
		}
		root = new LTreeNode<E>(e,null,null);
		return root;
	}

	/** Modify LTreeNode v to add child-LTreeNode from Elemento e, returns LTreeNode from Elemento e, the child node
	Also not used.... **/
	public Position<E> addChild(E e, Position<E> v) throws InvalidPositionException { // E will be Elemento
		LTreeNode<E> node = getLTreeNode(v); // equal to = v;
		LTreeNode<E> newNode = new LTreeNode<E>(e,node,null); // create new LTreeNode of E type from e, as parent v
		List<LTreeNode<E>> lista = node.getChildren(); // equal to = node.children or v.children
		lista.add(lista.size(), newNode); // put newNode at the end of list
		node.setChildren(lista); // node is parent, set extended list as children list
		return newNode; // return kid node
	}

	/** Not used according to IntelliJ **/
	public Position<E> addChild(Tree<E> t,Position<E> v) throws InvalidPositionException, EmptyTreeException {
		LTreeNode<E> t_node = getLTreeNode(t.root()); // t_node as root of t
		LTreeNode<E> v_node = getLTreeNode(v); // typecast v
		t_node.setParent(v_node); // set v_node as parent of root of t ???
		//t_node.setRight(v_node.getFirstChild());
		//v_node.setFirstChild(t_node);
		return t_node;
	}

	/** Checks v for being null and for being an LTreeNode of generic type, then returns v.
	 * Performs a glorified type cast.**/
	private LTreeNode<E> getLTreeNode(Position<E> v) throws InvalidPositionException {
		if (v == null || !(v instanceof LTreeNode<?>)) {
			throw new InvalidPositionException("Invalid position");
		}
		return (LTreeNode<E>) v;
	}

	/** placeholder function **/
	private Iterable<Position<E>> childrenList(Position<E> v) {
		return null;
	}

	/** takes LTreeNode child, and adds it to the list. Equal to list.add(child). Never used.**/
	private void addChildren(Position<E> child,List<Position<E>> list) {
		if (child!=null) {
			LTreeNode<E> childNode = getLTreeNode(child);
			list.add(child);
			//addChildren(childNode.getRight(),list);
		}
	}

	/** Iterate through childenList of LTreeNode v, adds all children to list and returns list **/
	private List<Position<E>> nodeList(Position<E> v) {
		List<Position<E>> list = new ArrayList<Position<E>>();
		addAllNodes(v,list);
		return list;
	}

	/** Adds node to list. Iterates through childrenList(node) and adds the children also **/
	private void addAllNodes(Position<E> node,List<Position<E>> list) {
		if (node!=null) {
			list.add(node);
			for (Position<E> child : childrenList(node)) // Position refers to LTreeNode
				addAllNodes(child,list);
		}
	}
}
