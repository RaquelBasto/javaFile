/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavaapplication;

import javax.swing.JOptionPane;

public class MyJavaApplication {

     
    public static void main(String[] args) {
        int i;
        String x, total = "";
        int []valor = new int[5];
        
        for ( i = 0; i < 5; i++) {
            x = JOptionPane.showInputDialog(null,"Digite o valor "+(i+1),"",-1);  
            valor[i]  = Integer.parseInt(x);
            total = total + valor[i] + "  |  ";
            
            JOptionPane.showMessageDialog(null, total);
        }

    }
    
}
