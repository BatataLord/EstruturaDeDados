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
public class FilaCircular {
    private int tamMax;
    private int memo[];
    private int inicio;
    private int fim;
    private int total;
    
    public FilaCircular(int tamMax)
    {
        this.tamMax = tamMax;
        this.memo = new int [tamMax];
        this.inicio = 0; // removemos da fila
        this.fim = 0; // inserimos na fila 
        this.total = 0;
    }
    
    public void insere (int elemento)
    {
        if(!this.isFull())
        {
            this.memo[this.fim] = elemento;
            this.total++;
            if(this.fim == tamMax-1)
            {
                this.fim = 0;
            }
            else
            {
                this.fim++;
            }
        }
        else
        {
            System.out.println("OVERFLOW");
        }
    }
    
    public boolean isFull()
    {
        if(this.total == this.tamMax)
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
            this.total--;
            if(this.inicio == this.tamMax-1)
            {
                this.inicio = 0;
            }
            else
            {
                this.inicio++;
            }
        }
        else
        {
            System.out.println("UNDERFLOW");
        }    
        return aux;
    }
    
    public boolean isEmpty()
    {
        if(this.total == 0)
        {
            return true;
        }
        else
        {
            return false;
        }    
    }
}
