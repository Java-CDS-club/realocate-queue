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
public class FilaR<T> {
    
    private T[] fila;
    private int fim;
    
    public FilaR(int tam) {
        this.fila = (T[]) new Object[tam];
        this.fim = -1;
    }
    
    public void insere(T valor) {
        if (!estaCheia()) {
            this.fila[++fim] = valor;
        }  
    }

    public T remove() {
        if(estaVazia())
            return (T) "A FILA JÁ ESTÁ VAZIA!";
        T t = fila[fim];
        for (int i=0; i < fim; i++)
            fila[i] = fila[i+1];
        
        fim--;
        fila[fim + 1] = null;
        return t;
    }

    public boolean estaVazia() {
        return this.fim == -1;
    }
    
    public boolean estaCheia() {
        if(fim == this.fila.length - 1 ){
            System.out.println("FILA CHEIA!");
            return true;
        }
        return false;
    }

    public T[] getFila() {
        return fila;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }
    
    public void imprimeFila(){
        for (int i = 0; i <= fim; i++) {
            System.out.println(fila[i]);
        }
    }
    
    public void imprimeVetor(){
        for (int i = 0; i < fila.length; i++) {
            System.out.println(fila[i]);
        }
    }
    
    
    
    
}
