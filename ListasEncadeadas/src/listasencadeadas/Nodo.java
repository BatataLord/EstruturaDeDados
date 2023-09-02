/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasencadeadas;

/**
 *
 * @author AndreyFernandesTraja
 */
public class Nodo {
    
    public int dado;
    public Nodo next;
    
    public Nodo (int dado)
    {
        this.dado= dado;
        this.next = null;
    }
    
    public void mostraNodo()
    {
        System.out.println("Dado: "+this.dado); //Da pra colocar o this.next para aparecer a próxima posição
    }
}
