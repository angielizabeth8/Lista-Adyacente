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
public class GrafoAdcia {
    
    int numVerts;
    static int maxVerts = 20;
    VerticeAdy [] tablAdc;
    
    //constructor
    public GrafoAdcia(int mx){
        tablAdc = new VerticeAdy[mx];
        numVerts = 0;
        maxVerts = mx;
    }
    
    public GrafoAdcia() {
        this(maxVerts);
    }

    /*
      AÃ‘ADIR Vertice -- modificado
      @author IvÃ¡n Pereyra
    */
    public void nuevoVertice(String nom) {
        boolean esta = numVertice(nom) >= 0;
        if(!esta){
          VerticeAdy v = new VerticeAdy(nom);
          v.asigVert(numVerts);
          tablAdc[numVerts++] = v;
        }
    }

    /*
     * @author Walter -- modificado
      
    */
    public int numVertice(String vs) {
      VerticeAdy v = new VerticeAdy(vs);
      boolean encontrado = false;
      int i = 0;
      for (; (i < numVerts) && !encontrado;) {
            encontrado = tablAdc[i].equals(v);
            if (!encontrado) {
                i++;
            }
      }
      return (i < numVerts) ? i : -1;
    }

/*Recibe el nombre de cada vertice el arco
  *@author Lucas Gualda
  *modificado
*/
    public void nuevoArco(String a, String b, int peso) throws Exception {
        int va,vb;
        va=numVertice(a);
        vb=numVertice(b);
        System.out.println(">>>>>>"+va+"--"+vb);
        if (va<0||vb<0) throw new Exception ("El vertice no existe");
        Arco arco1= new Arco(vb,peso);
        tablAdc[va].lad.arcos[tablAdc[va].lad.numNodos] = arco1;
        System.out.println(">>>>>>"+va+"--"+tablAdc[va].lad.arcos[tablAdc[va].lad.numNodos].getDestino());
        tablAdc[va].lad.numNodos++;
    }

    /*
    @author Lucas
    Recibe el numero de vertice del arco
    */
    public void nuevoArco(int va, int vb, int peso) throws Exception {
        if(va<0||vb<0)throw new Exception ("El vertice no existe");
        tablAdc[va].lad.arcos[tablAdc[va].lad.numNodos] = new Arco (vb, peso);
        tablAdc[va].lad.numNodos++;
    }

    //@author Nahir 
    public boolean adyacente(String a, String b) throws Exception {
      int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
        return tablAdc[va].lad.contieneNodo(vb);                              
    }
    
    /*
     @author :elio
     */
    public boolean adyacente(int va, int vb) throws Exception {
      
      if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
      return tablAdc[va].lad.contieneNodo(vb);                               
        
    }

  /**
   * Método que imprime la matriz, sÃ³lo en caso de que no estÃ© vacÃ­a.
   * TAREA 1: Mejorar este método.
   */
    public void mostrarMatriz() {
        try {
            System.out.print("  |  ");

            for (VerticeAdy tablAdc1 : tablAdc) {
                System.out.print("\n" + tablAdc1.nombre);
                for (int j = 0; j < tablAdc1.lad.numNodos; j++) {
                    System.out.print(">--" + tablAdc1.lad.arcos[j].peso + "-->" + tablAdc[tablAdc1.lad.arcos[j].getDestino()].nombre);
                }
            }
        } catch (Exception e) {
            System.out.println("MATRIZ VACIA");
        }
    }
    
}
