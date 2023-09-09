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
public class ListasEncadeadasAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaSimples ls = new ListaSimples();
        
        ls.insereInicio(10);
        ls.insereInicio(20);
        ls.insereInicio(30);
        
        ls.removeInicio();
        
        ls.insereFim(50);
        ls.removeFim();
        
        ls.mostraLista();
    }
    
}
