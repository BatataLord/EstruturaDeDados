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
public class TrianguloAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo area = new Triangulo();
        
        area.altura = 10;
        area.base = 50;
        
        System.out.println("O valor da area é = "+area.area());
        
        
    }
    
}
