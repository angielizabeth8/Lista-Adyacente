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
public class Arco {
    int destino;
    double peso;
    
    public Arco(int d){
        destino = d;
    }
    
    public Arco(int d, int p){
        this(d);
        peso = p;
    }
    
    public int getDestino(){
        return destino;
    }
    
   
    public boolean equals(Object n){
        Arco a = (Arco)n;
        return destino == a.destino;
    }
}
