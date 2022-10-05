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
public class ListaDupla {
    
    public Nodo prim;
    public Nodo ult;
    
    public ListaDupla()
    {
        this.prim = null;
        this.ult = null;
    }
    
    public boolean isEmpty()
    {
        if(this.prim == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void insereInicio(int dado)
    {
        Nodo novoNodo = new Nodo(dado);
        
        if(this.isEmpty())
        {
            this.ult = novoNodo;
        }
        else
        {
            this.prim.prev = novoNodo;
        }
        novoNodo.next = this.prim;
        this.prim = novoNodo;
    }
    
    public void insereFim(int dado)
    {
        Nodo novoNodo = new Nodo(dado);
        
        if(this.isEmpty())
        {
            this.prim = novoNodo;
        }
        else
        {
            this.ult.next = novoNodo;
        }
        novoNodo.prev = this.ult;
        this.ult = novoNodo;
    }

    public void mostraLista()
    {
        Nodo nodoAux = this.prim;
        
        while(nodoAux != null)
        {
            nodoAux.mostraNodo();
            nodoAux = nodoAux.next;
        }
    }
}
