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
public class ListaSimples {
    
    public Nodo prim;
    
    public ListaSimples()
    {
        this.prim = null;
    }
    
    public boolean isEmpty()
    {
        if (this.prim == null)
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
        // 1 - Criar novoNodo com dado
        // 2 - Alterar o next do novoNodo <= prim
        // 3 - Alterar o prim <= novoNodo
        
        Nodo novoNodo = new Nodo(dado); // 1
        novoNodo.next = this.prim; // 2
        this.prim = novoNodo; // 3
    }
    
    public void mostraLista()
    {
        Nodo nodoAux = this.prim;
        
        while(nodoAux.next != null)
        {
            nodoAux.mostraNodo();
            nodoAux = nodoAux.next;
        }
    }
    
    public Nodo removeInicio()
    {
        // 1 - Guardar o nodo prim em uma variavel Nodoaux
        // 2 - Alterar o prim <= next nodoAux
        // 3 - Retornar nodo Auxiliar
        
        Nodo nodoAux = this.prim; // 1
        this.prim = nodoAux.next; // 2
        return nodoAux; // 3
    }
}
