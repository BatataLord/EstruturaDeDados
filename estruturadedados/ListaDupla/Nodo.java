/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDupla;

/**
 *
 * @author AndreyFernandesTraja
 */
public class Nodo {
        
    public int dado;
    public Nodo next;
    public Nodo prev;
    
    public Nodo(int dado)
    {
        this.prev = null;
        this.dado = dado;
        this.next = null;
    }    
    public void mostraNodo()
    {
        System.out.println("Dado : "+this.dado);
    }
    
}