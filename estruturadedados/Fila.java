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
public class Fila {
    
    private int tamMax;
    private int memo[];
    private int inicio;
    private int fim;
    
    public Fila(int tamMax)
    {
        this.tamMax = tamMax;
        this.memo = new int [tamMax];
        this.inicio = 0; // removemos da fila
        this.fim = 0; // inserimos na fila 
    }
    
    public void insere (int elemento)
    {
        if(!this.isFull())
        {
            this.memo[this.fim] = elemento;
            this.fim++;
        }
        else
        {
            System.out.println("OVERFLOW");
        }
    }
    
    public boolean isFull()
    {
        if(this.fim == this.tamMax)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int remove()
    {
        int aux = -1;
        if(!this.isEmpty())
        {
            aux = this.memo[this.inicio];
            this.inicio++;
        }
        else
        {
            System.out.println("UNDERFLOW");
        }    
        return aux;
    }
    
    public boolean isEmpty()
    {
        if(this.inicio == this.fim)
        {
            return true;
        }
        else
        {
            return false;
        }    
    }
}
