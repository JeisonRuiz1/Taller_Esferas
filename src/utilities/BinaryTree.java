package utilities;
/**
*
* @author Esteban Novoa Quiñones
*/

public class BinaryTree<T>{
	
	  private BinaryNode<T> root;

	    public BinaryTree() {
	        this.root = null;
	    }

	
	public BinaryNode<T> add(T info,BinaryNode<T> root) {
		BinaryNode<T> aux = new BinaryNode<>(info);
		if (iSortCriterian.compareTo(aux.info, root.info)>0) {
			if (root.rightNode==null) {
				root.rightNode = aux;
			}else {
				add(info,root.rightNode);
			}
		}
		if (ISortCriterian.compareTo(aux.info, root.info)<0) {
			if (root.leftNode==null) {
				root.leftNode=aux;
			}else {
				add(info,root.leftNode);
			}
		}
		
		return aux;
	}

}
