package utilities;
/**
*
* @author Esteban Novoa Quiñones
*/

public class BinaryTree{
	
	  private BinaryNode<Double> root;

	    public BinaryTree() {
	        this.root = null;
	    }

	
	    public void add (double info)	      {
	          BinaryNode<Double> newNode = new BinaryNode<Double>(info);
	          newNode.info = info;
	          newNode.leftNode = null;
	          newNode.rightNode= null;
	          if (root == null)
	        	  root= newNode;
	          else
	          {
	        	  BinaryNode<Double> anterior = null, reco;
	              reco = root;
	              while (reco != null)
	              {
	                  anterior = reco;
	                  if (info < reco.info)
	                      reco = reco.leftNode;
	                  else
	                      reco = reco.rightNode;
	              }
	              if (info < anterior.info)
	                  anterior.leftNode =  newNode;
	              else
	                  anterior.rightNode =  newNode;
	          }
	      }

}
