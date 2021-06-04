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
public class Lista {
    int numNodos=0;
    Arco [] arcos;
    int mx=5;
    
    //constructor
    public Lista(){
        this.arcos = new Arco[5];
    }
    
    public Lista(int mx){
        arcos= new Arco[mx];
    }
    
    public boolean contieneNodo(int n){
        boolean b=false;
        for(int i=0;i<numNodos;i++){
            b = this.arcos[i].getDestino()==n;
        }
        return b;
    }
    
}
