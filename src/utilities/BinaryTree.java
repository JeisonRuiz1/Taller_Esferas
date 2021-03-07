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

	public synchronized void recorridoPreorden()
    {
        ayudantePreorden(root);
    }
    //meoto recursivo para recorrido en preorden
    
    private void ayudantePreorden(BinaryNode<Double> nodo)    {
        if(nodo == null)
            return;
        
        System.out.print(nodo.info + " ");     //mostrar datos del nodo
        ayudantePreorden(nodo.leftNode);   //recorre subarbol izquierdo
        ayudantePreorden(nodo.rightNode);     //recorre subarbol derecho
    }
    public synchronized void recorridoPosorden()    {
        ayudantePosorden(root);        
    }
    
    //meotod recursivo para recorrido posorden
    private void ayudantePosorden(BinaryNode<Double> nodo)
    {
        if( nodo == null )
            return;
        
        ayudantePosorden(nodo.leftNode);
        ayudantePosorden(nodo.rightNode);
        System.out.print(nodo.info + " "+"\n");
    }


		public int getSize() {
			return size;
		}


		public void setSize(int size) {
			this.size = size;
		}
	    

}
