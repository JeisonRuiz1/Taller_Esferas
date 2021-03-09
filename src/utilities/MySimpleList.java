package utilities;

import java.util.Comparator;

import view.View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esteban Novoa Quiñones
 * @param <T>
 * 
 * Caracteristicas
 * Lista de acceso secuencial 
 * Acceso secuencial siempre adelante
 * Esta conformada por nodos
 * 
 */
public class MySimpleList <T> {
    
    protected MySimpleNodo<T> head;
    private MySimpleNodo<T> currentElement;
    private Comparator<T> isortCriterian;
    private int size;

    public MySimpleList() {
        head = null;
        this.isortCriterian = null;
    }
    
    public MySimpleList(Comparator<T> criterian) {
		this.isortCriterian = criterian;
	}
   
    

    /*
     * A�ade un elemento usando el metodo de adicionar, segun corresponda
     * si es ordenada, o no
     */
    public void add(T info) {
    	   
    	if(this.isortCriterian != null) {    				
    		addSort(info);
    	}else {
    		addLess(info);
    	}
    }
    
    public void addSort(T info) {
    	if(this.head == null) {
    		this.head = new MySimpleNodo<>(info);
    	}else {
    		boolean listener = false;
    		if(isortCriterian.compare(this.head.info, info) <0) {
    			this.head = new MySimpleNodo<>(info,this.head);
    			listener = true;
    		}
    		MySimpleNodo<T> aux = this.head;
    		while(aux.nextNodo != null && listener == false) {
    			if(isortCriterian.compare((T) aux.nextNodo.info, info)<0) {
    				aux.nextNodo = new MySimpleNodo<>(info,aux.nextNodo);
    				listener = true;
    			}
    			aux = aux.nextNodo;
    		}
    		if(listener == false) {
    			aux.nextNodo = new MySimpleNodo<>(info);
    		}
    	}
    	size++;
    }
    
    /**
     * Adiciona un elemento al final de la lista ...
     * @param info  elemento a adicionar...
     */
    public void addLess(T info){
      if (this.head==null) {
         this.head = new MySimpleNodo<>(info);
      } else {
          MySimpleNodo<T> aux = this.head;
          while(aux.nextNodo!=null){
             aux = aux.nextNodo;
          }
          aux.nextNodo = new MySimpleNodo<>(info);
      }
      size++;
    }
    /**
     * Elimina el objeto info de la lista
     *
     * @param data
     */
    public void delete(T data) {
        reset();
        if (head.info == data) {
            head = head.nextNodo;
        }
        MySimpleNodo<T> aux = this.head;
        while (aux.nextNodo != null) {
            if (aux.nextNodo.info == data) {
                aux.nextNodo = aux.nextNodo.nextNodo;
            }
            aux = aux.nextNodo;
        }
    }

    /**
     * Determina si la lista esta vacia o no
     * @return true vacia
     */    
    public boolean isEmpty(){
        return this.head == null;
    }
    /**
     * Busca objetos que cumplan con un criterio de busqueda
     */
    public MySimpleList<T> search(ISeacrhCriterio<T> criterio){
       MySimpleList<T> listAux = new MySimpleList<>();
       MySimpleNodo<T> aux = this.head;
        if (criterio.searchByCriterian(aux.info)) {
            listAux.add(aux.info);
        }
        while (aux.nextNodo != null) {
            if (criterio.searchByCriterian((T) aux.nextNodo.info)) {
                listAux.add((T) aux.nextNodo.info);
            }
            aux = aux.nextNodo;
        }

        return listAux;
    }
    
    public T searchElement(ISeacrhCriterio<T> criterio){
       MySimpleList<T> listAux = new MySimpleList<>();
       MySimpleNodo<T> aux = this.head;
        if (criterio.searchByCriterian(aux.info)) {
            return aux.info;
        }
        while (aux.nextNodo != null) {
            if (criterio.searchByCriterian((T) aux.nextNodo.info)) {
                return (T) aux.nextNodo.info;
            }
            aux = aux.nextNodo;
        }

        return null;
    }
    /**
     * Verifica si un objeto esta en la lista
     * @param data objeto a buscar
     * @return true si esta en la lista o false si no esta
     */
    public boolean isIn(T data){
        boolean res = false;
        reset();
        while (this.currentElement != null) {
            if (this.currentElement.info == data) {
                res = true;                
            }       
            next();       
        } 
        return res;
    }
    
    public void reset(){
        this.currentElement = head;
    }
    
    /**
     * 
     * @return 
     */
    public T next(){
        T aux =  this.currentElement.info;
        this.currentElement = this.currentElement.nextNodo;
        return aux;
    }
    
    /**
     * Inserta el elemento data a la lista en primera posicion
     * @param data 
     */
    public void instert(T data){
        if (head == null) {
            head = (MySimpleNodo<T>) data;
        }else{
            this.head = new MySimpleNodo<>(data,this.head);
        }
    }
    
    /**
     * Imprime los elements de la lista
     */
    public void printList(){
    	View view = new View();
        reset();
        while (this.currentElement != null) {               
              view.showMessage((String) currentElement.info);
               next();
        }      
    }
    /**
     * Recorre la lista y devuelve el numero de elementos
     * @return 
     */
    public int size(){
        int size = 0;
        reset();
        while (currentElement != null) {
               size++;
               next();
        }
        return size;
    }
    
    /**
     * Fusiona dos listas agrupando los elementos al final de la lista original
     * @param newList 
     */
    public void joinListEnd(MySimpleList newList){
        MySimpleNodo currentNodoNewList = newList.head;
        while (currentNodoNewList != null) {
            add((T) currentNodoNewList.info);
            currentNodoNewList = currentNodoNewList.nextNodo;
        }
    }
    /**
     * Fusiona dos listas agrupando los elementos al comienzo de la lista original
     * @param newList 
     */
    public void joinListBegin(MySimpleList newList){
        newList.reset();
        while (newList.currentElement != null) {
            instert((T) newList.currentElement.info);
            newList.next();
                        
        }
    }
    
    /**
     * Retorna los elementos de la lista en un arreglo de objetos
     * @return arreglo de objetos
     */
    public T[] getListAsArray() {
        int count = 0;
        T[] newArray = (T[])new Object[size()];
        reset();
        while (currentElement != null) {
            newArray[count] = currentElement.info;
            count++;
            next();
        }
        return newArray;
    }
    /**
     * Añade un arreglo de objetos a la lista original al final
     * @param tList 
     */
    public void addObjectArrayEnd(T[] tList){
        int count = 0;
        while (count != tList.length) {
            this.add((T) tList);
            count++;
        }
    }
    /**
     * Añade un arreglo T a la lista original al comienzo
     * @param tList 
     */
    public void addObjectArrayBegin(T[] tList){
        int count = 0;
        while (count != tList.length) {
            this.instert(tList[count]);
            count++;
        }
    }

    public int getSize() {
        return size;
    }
    
}
