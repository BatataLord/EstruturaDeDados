/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados;

/**
 *
 * @author AndreyFernandesTraja
 */
public class Pilha {
    
  private int tamMax;
  private int topo;
  private int memo[];
    
    Pilha (int tamMax)
    {
        this.tamMax = tamMax;
        this.memo = new int[this.tamMax];
        this.topo = -1;
    }
    
public void push(int elemento)
{
    // 1 - incrementar o topo
    // 2 - adicionar elemento
    if(!this.isFull())
    {
        this.topo++;
        this.memo[this.topo] = elemento;
    }
    else
    {
        System.out.println("OVERFLOW");
    }
       
}

public int pop()
{
    int retorno = -1;
    
    if(!this.isEmpty())
    {       
        retorno = this.memo[this.topo];
        this.topo--;    
    }
    else
    {
        System.out.println("UNDERFLOW");
    }    
    return retorno;
}    

public int top()
{
    int retorno = -1;
    
    if(!this.isEmpty())
    {
    retorno = this.memo[this.topo];
    }
    else
    {
        System.out.println("UNDERFLOW");
    }
    return retorno; 
}
    
public boolean isFull()
{
    if(this.topo == this.tamMax-1)
    {
        return true;
    }
    else
    {
        return false;
    }    
}

public boolean isEmpty()
{
    if(this.topo == -1)
    {
        return true;
    }
    else
    {
        return false;
    }
}



}