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
        Nodo aux=this.prim;
        
        this.prim=aux.next;
        
        return aux;              
    }
    
    public void MostraLista()
    {
        Nodo nodoAux = this.prim;
        
        while(nodoAux != null)
        {
            nodoAux.mostraNodo();
            nodoAux = nodoAux.next;
        }
    }
    
    public void insereFim(int dado)
    {
        // 1 - Criar nodo
        // 2 - Encontrar o ultimo
        // 3 - Alterar o next do ultimo para conectalo a lista
        // * Exceção - Alterando no fim da lista, e alterando o inicio
        
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
        Nodo nodoUltimo = this.prim;
        Nodo nodoAnterior = this.prim;
        // 1 - Encontrar o último -- Guardando o anterior
        while(nodoUltimo.next != null)
        {
            nodoAnterior = nodoUltimo;
            nodoUltimo = nodoUltimo.next;            
        }
        // 2 - next do anterior == null
        if(nodoAnterior != nodoUltimo)
        {
            nodoAnterior.next = null;
        }
        else
        {
            this.prim = null;
        }       
        // 3 - retornar o último
        return nodoUltimo;   
    }
    
    
}
