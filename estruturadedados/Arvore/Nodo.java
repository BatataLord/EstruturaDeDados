/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvore;

/**
 *
 * @author AndreyFernandesTraja
 */
public class Nodo {
    public Nodo esq;
    public int dado;
    public Nodo dir;
    
    public Nodo(int dado)
    {
        this.esq = null;
        this.dado = dado;
        this.dir = null;
    }
    
    public void mostraNodo()
    {
        System.out.println("Dado: "+this.dado);
    }
}
