/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author angie
 */
public class VerticeAdy {
    
    /*Atributos*/
    String nombre;
    int numVertice;
    Lista lad; // lista de adyacencia
    
    // constructor de la clase
    public VerticeAdy(String x){
        nombre = x;
        numVertice = -1;
        lad = new Lista();
    }


  /**
   * MÃ©todo que devuelve Identificador del Vertice
   * @author Lucas Gualda
   * @return String
   */
  public String nomVertice(){
    return nombre;  
  }

  /**
   * MÃ©todo que devuelve XXXXXXX
   * @author Lucas Gualda
     * @param n
   * @return boolean
   */
  public boolean equals(VerticeAdy n){
    return nombre.equals(n.nombre);
  }

  /**
   * MÃ©todo que XXXXXXX
     * @param n
   */
  public void asigVert(int n){
    numVertice = n;
  }

  /**
   * MÃ©todo que devuelve XXXXXXX
   * 
   * @return XXXXXXX
   */
  
  public String toString(){
    return nombre + "("+ numVertice +")";
  }
    
}
