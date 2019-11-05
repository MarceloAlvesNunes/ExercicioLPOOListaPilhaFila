
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo
 */
public class Principal {
    
     public static void main(String[] args) {
        LinkIntList l = new LinkIntList();
        int x;
        String y;
       x = parseInt(JOptionPane.showInputDialog("Digite o tamanho"));
        
       for(int i=0; i<x; i++){
           y = JOptionPane.showInputDialog("Digite os valores");
           l.addFirst(y);
       } 
       l.print();     
    }
    
}
