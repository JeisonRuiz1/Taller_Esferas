package utilities;
/**
*
* @author Esteban Novoa Quiñones
*/

public class BinaryTree{

	private BinaryNode<Double> root;
	private int size;

	public BinaryTree() {
		this.root = null;
	}

	/**
	 * @param info
	 * Complejidad O(n) de la forma T(n) = 2 T(n/2) + O(1)
	 */
	public void add(double info) {
		BinaryNode<Double> newNode = new BinaryNode<Double>(info);
		newNode.info = info;
		newNode.leftNode = null;
		newNode.rightNode = null;
		if (root == null)
			root = newNode;
		else {
			BinaryNode<Double> anterior = null, reco;
			reco = root;
			while (reco != null) {
				anterior = reco;
				if (info < reco.info)
					reco = reco.leftNode;
				else
					reco = reco.rightNode;
			}
			if (info < anterior.info)
				anterior.leftNode = newNode;
			else
				anterior.rightNode = newNode;
		}
		size++;
	}

	/**
	 * Complejidad O(4) 
	 */
	public synchronized void recorridoPreorden(){
        ayudantePreorden(root);
    }
    //meoto recursivo para recorrido en preorden
    
	/**
	 * @param nodo
	 * Complejidad O(4)
	 */
    private void ayudantePreorden(BinaryNode<Double> nodo)    {
        if(nodo == null)
            return;
        
        System.out.print(nodo.info + " ");     //mostrar datos del nodo
        ayudantePreorden(nodo.leftNode);   //recorre subarbol izquierdo
        ayudantePreorden(nodo.rightNode);     //recorre subarbol derecho
    }
    
    /**
     * Complejidad O(4)
     */
    public synchronized void recorridoPosorden()    {
        ayudantePosorden(root);        
    }
    
    /**
     * meotod recursivo para recorrido posorden
     * @param nodo
     * Complejidad O(log N)
     */
    private void ayudantePosorden(BinaryNode<Double> nodo){
        if( nodo == null )
            return;
        
        ayudantePosorden(nodo.leftNode);
        ayudantePosorden(nodo.rightNode);
        System.out.print(nodo.info + " "+"\n");
    }

    /**
     * @return
     * Complejidad O(1)
     */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 * Complejidad O(1)
	 */
	public void setSize(int size) {
		this.size = size;
	}
}
