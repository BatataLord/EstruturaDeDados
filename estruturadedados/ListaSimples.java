/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura;

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
        // 1 - criar nodo
        // 2 - conectar nodo a lista
        // 3 - atualizar o prim
        Nodo novoNodo = new Nodo(dado);
        novoNodo.next = this.prim;
        this.prim = novoNodo;
    }
    
    public Nodo removeInicio()
    {
        // 1 - Guardar o prim em um nodo auxiliar
        // 2 -  Atualizar o prim (next prim)
        // 3 - Retornar Nodo guardado
        Nodo aux;
        
        aux = this.prim;
        
    }
}
