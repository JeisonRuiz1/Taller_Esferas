package utilities;
/**
*
* @author Esteban Novoa Quiñones
*/
public class BinaryNode<T> {
	
	protected BinaryNode<T> leftNode;
	protected BinaryNode<T> rightNode;
	protected T info;
	
	/**
	 * @param leftNode
	 * @param rightNode
	 * @param info
	 * Complejidad O(3)
	 */
	public BinaryNode(BinaryNode<T> leftNode, BinaryNode<T> rightNode, T info) {
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		this.info = info;
	}

	/**
	 * @param info
	 * Complejidad O(1)
	 */
	public BinaryNode(T info) {
		this.info = info;
	}

}
