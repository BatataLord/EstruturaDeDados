/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados;

import javax.swing.JOptionPane;

/**
 *
 * @author AndreyFernandesTraja
 */
public class PilhaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pilha minhaPilha = new Pilha(5);
        /*minhaPilha.push(20);
        minhaPilha.push(30);
        minhaPilha.push(40);
        minhaPilha.push(50);
        minhaPilha.push(60);
        
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.pop());*/
        String tamPilha = JOptionPane.showInputDialog("Informe o tamano da pilha");
        
        while(!minhaPilha.isFull())
        {
            //entrada de dados e fazer o push aqui dentro
          
          String valor = JOptionPane.showInputDialog("Informe os valores da pilha");
        }
        while(!minhaPilha.isEmpty())
        {
            //fazer o pop aqui dentro
        } 
    }
    
}
