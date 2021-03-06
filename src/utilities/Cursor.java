/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author Esteban Novoa Quiñones
 */
public class Cursor <T>{
    private MySimpleNodo<T> currentElement;
    private MySimpleList<T> mySimpleList;

    public Cursor(MySimpleList<T> mySimpleList) {
        this.mySimpleList = mySimpleList;
        this.currentElement = mySimpleList.head;
    }

    public void reset() {
        this.currentElement = this.mySimpleList.head;
    }
    
    /**
     * Imprime los elements de la lista
     */
    public void printList(){
        reset();
        while (this.currentElement != null) {
               System.out.println(this.currentElement.info);
               next();
        }  
    }

    public T next() {
        T aux = this.currentElement.info;
        this.currentElement = this.currentElement.nextNodo;
        return aux;
    }

	/**
	 * @return the currentElement
	 */
	public MySimpleNodo<T> getCurrentElement() {
		return currentElement;
	}

    
}
