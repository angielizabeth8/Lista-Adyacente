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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {


      GrafoAdcia ListaAdy = new GrafoAdcia(5);

      ListaAdy.mostrarMatriz();
      System.out.println("--------------------");
      
      ListaAdy.nuevoVertice("Alicante");
      ListaAdy.nuevoVertice("Cartagena");
      ListaAdy.nuevoVertice("Barcelona");
      ListaAdy.nuevoVertice("Murcia");
      ListaAdy.nuevoVertice("Reus");
      
      ListaAdy.mostrarMatriz();
      System.out.println("\n--------------------");

      ListaAdy.nuevoArco("Alicante", "Cartagena",5);
      ListaAdy.nuevoArco("Cartagena", "Alicante", 3);
      ListaAdy.nuevoArco("Alicante", "Murcia", 5);
      ListaAdy.nuevoArco("Murcia", "Barcelona", 2);
      ListaAdy.nuevoArco("Barcelona", "Reus", 3);
      ListaAdy.nuevoArco("Reus", "Barcelona", 1);
      ListaAdy.nuevoArco("Barcelona", "Cartagena", 5);
      //matrizAdyacencia.nuevoArco("Barcelona", "Murcia", 6);
      ListaAdy.nuevoArco(ListaAdy.numVertice("Barcelona") , ListaAdy.numVertice("Murcia"), 6); // Tarea 2!
      
    
      ListaAdy.mostrarMatriz();
      System.out.println("\n--------------------");
            
      //TODO: Agregar metodo(s) para poder usar pesos
            
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
        
    }
    
}
