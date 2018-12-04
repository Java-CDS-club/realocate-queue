/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author afonso
 */
public class MainR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FilaR f = new FilaR<Integer>(5);
        
        f.insere(23);
        f.insere(64);
        f.insere(42);
        f.insere(70);
        
        f.imprimeFila();
        
        
        System.out.println("\n");
        
        f.imprimeFila();
        System.out.println("\n");
        f.imprimeVetor();

    }
    
}
