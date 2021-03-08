package utilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esteban Novoa Quiñones
 */
public class MySimpleNodo <T>{
    
    protected T info;
    protected MySimpleNodo nextNodo;

    /**
     * Construir un nodo
     * @param info objeto de info util
     * @param nextNodo enlace o relacion con otro
     * Complejidad O(2)
     */
    public MySimpleNodo(T info, MySimpleNodo nextNodo) {
        this.info = info;
        this.nextNodo = nextNodo;
    }
    
    /**
     * Nodo solo info
     * @param info informacion util
     * Complejidad O(1)
     */

    public MySimpleNodo(T info) {
        this.info = info;
       // this.nextNodo = null;
    }

	/**
	 * @return the info
	 */
	public T getInfo() {
		return info;
	}


    
    
}
