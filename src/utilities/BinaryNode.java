package utilities;
/**
*
* @author Esteban Novoa Quiñones
*/
public class BinaryNode<T> {
	
	protected BinaryNode<T> leftNode;
	protected BinaryNode<T> rightNode;
	protected T info;

	public BinaryNode(BinaryNode<T> leftNode, BinaryNode<T> rightNode, T info) {
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		this.info = info;
	}

	public BinaryNode(T info) {
		this.info = info;
	}

}
