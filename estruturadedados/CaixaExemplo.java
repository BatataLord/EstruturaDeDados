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
public class CaixaExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Caixa caixaSapato = new Caixa();
    caixaSapato.altura = 10;
    caixaSapato.largura = 30;
    caixaSapato.profundidade = 50;
    
    System.out.println("Volume da caixa de sapato e: " + caixaSapato.volume());
    }
    
}
