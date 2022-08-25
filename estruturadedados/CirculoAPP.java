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
public class CirculoAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo raio = new Circulo();
        Circulo area = new Circulo();
                
        System.out.println("O valor do raio e: "+raio.r);
        System.out.println("O valor da area e: "+area.area());
    }
    
}
