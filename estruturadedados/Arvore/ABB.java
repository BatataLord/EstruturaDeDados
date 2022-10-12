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
public class ABB {
    private Nodo raiz;
    
    public ABB()
    {
        this.raiz = null;
    }
    public Nodo getRaiz()
    {
        return this.raiz;
    }
    public boolean isEmpty()
    {
        if(this.raiz == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void insere(int dado)
    {
        Nodo novoNodo = new Nodo(dado); // criamos o nodo
        if(this.isEmpty())              // árvore estava vazia
        {
            this.raiz = novoNodo;
        }
        else                            
        {
            Nodo nodoAux = this.raiz;   // variavel nodoAux = percorre a arvore
            Nodo nodoPai = null;        // variavel nodoPai = conectar o novo nodo
            boolean achou = false;      // variavel boolean = variavel de pesquisa
            
            while(!achou)
            {
                nodoPai = nodoAux;      // endereço do pai
                
                if(dado < nodoAux.dado) // se o dado inserido é menor = vai pra esquerda
                {
                   nodoAux = nodoAux.esq;
                   if(nodoAux == null)
                   {
                       achou = true;
                       nodoPai.esq = novoNodo; // se não tiver esquerda = conecta no pai
                   }
                }
                else                    // se o dado inserido é maior = vai pra direita
                {
                    nodoAux = nodoAux.dir;
                    if(nodoAux == null)
                    {
                        achou = true;
                        nodoPai.dir = novoNodo; // se não tiver direita = conecta no pai
                    }
                }
            }
        }
    }
}
