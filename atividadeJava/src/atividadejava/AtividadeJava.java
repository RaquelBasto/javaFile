/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadejava;

import javax.swing.JOptionPane;

/**
 *
 * @author ETECIA
 */
public class AtividadeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String numero = JOptionPane.showInputDialog(null,"Digite um valor: ","",-1);
       int num = Integer.parseInt(numero);
       
       int prox = num +1;
       
       JOptionPane.showMessageDialog(null,"O sucessor de " +num+" é: "+prox);
       
    }
    
}
