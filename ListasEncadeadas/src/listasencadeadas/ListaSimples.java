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
        
        while(nodoAux != null)
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
    
    public void insereFim(int dado)
    {
        // 1 - Cria nodo com dado
        // 2 - Percorrer a lista para encontrar o ultimo(nodo com null no next)
        //  2.1 - While a partir do prim até o ultimo
        // 3 - Conectar o novo nodo no ultimo(next do ultimo <- novoNodo)
        Nodo novoNodo = new Nodo(dado);
        
        if(this.prim != null) // exceção
        {
            Nodo nodoAux = this.prim;
            
            while(nodoAux.next != null)
            {
                nodoAux = nodoAux.next;
            }
            nodoAux.next = novoNodo;
        }
        else
        {
            this.prim = novoNodo;
        }
    }
    
    public Nodo removeFim()
    {
        // 1 - Percorrer lista guardando 2 endereços (ant -> aux)
        // 2 - No final da lista(Aux) -> retornar Aux
        // 3 - Desconectar o aux(ant.next <- null)
        Nodo nodoAux = this.prim;
        Nodo nodoAnt = this.prim;
        
        while(nodoAux.next != null)
        {
            nodoAnt = nodoAux;
            nodoAux = nodoAux.next;
        }
        if(nodoAux != nodoAnt)
        {
            nodoAnt.next = null;
        }
        else
        {
            this.prim = null;
        }
        return nodoAux;
    }
}
