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
public class ListaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaSimples ls = new ListaSimples();
        
        //ls.insereInicio(10);
        //ls.insereInicio(20);
        //ls.insereInicio(30);
                        
        //ls.removeInicio();
        
        //ls.MostraLista();
        
        ls.insereFim(10);
        ls.insereFim(20);
        ls.insereFim(30);
        
        ls.removeFim();
        ls.MostraLista();
    }
    
}
