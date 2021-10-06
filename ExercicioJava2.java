/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojava;

import javax.swing.JOptionPane;

/**
 *
 * @author ETECIA
 */
public class ExercicioJava2 {
    
    public static void main(String[] args) {
        
        int i;
        int [] vet1 = new int[3];
        int [] vet2 = new int[3];
        int [] vet3 = new int[3];
        
        for ( i = 0; i < 3; i++) {
            
            String x = JOptionPane.showInputDialog(null, "Digite o valor"+(i+1)+" para o vetor 1 ");
            vet1[i]= Integer.parseInt (x);
            
        }
        for ( i = 0; i < 3; i++) {
            
            String x = JOptionPane.showInputDialog(null, "Digite o valor"+(i+1)+" para o vetor 2 ");
            vet2[i]= Integer.parseInt(x);
            
        }
        for ( i = 0; i < 3; i++) {
            
            vet3[i]= (vet1[i]*vet2[i]);
            JOptionPane.showMessageDialog(null, "O vetor 3 é"+vet3[i]);

        }
    }
    
}
