/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import javax.swing.JOptionPane;

public class Principal {


    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Esse programa calcula o seu IMC: ", "",-1);
        
        String altura = JOptionPane.showInputDialog(null, "Digite sua altura ", " ",  -1);
        double alt = Double.parseDouble(altura);
        
        String peso = JOptionPane.showInputDialog(null, "Digite seu peso ", " ",  -1);
        int pes = Integer.parseInt(peso);
        
        double imc = pes /(alt*alt);
        
        if (imc < 18.5){
            JOptionPane.showMessageDialog(null,String.format ("Cuidado! \nVocê está abaixo do peso \nSeu imc é: %.2f ", imc ), "",2);
        }
        else if (imc < 24.9){
            JOptionPane.showMessageDialog(null, String.format("Parabens! \nVocê está em seu peso normal \nSeu imc é: %.2f ", imc), "",1);
        }
        else if (imc < 29.9){
            JOptionPane.showMessageDialog(null, String.format("Cuidado! \nVocê está acima de seu peso (sobrepeso) \nSeu imc é: %.2f ",imc), "",2);
        }
        else if (imc < 34.9){
            JOptionPane.showMessageDialog(null, String.format("Cuidado! \nVocê está com obesidade grau I \nSeu imc é: %.2f",imc), "",2);
        }
        else if (imc < 39.9){
            JOptionPane.showMessageDialog(null, String.format("Cuidado! \nVocê está com obesidade grau II \nSeu imc é: %.2f",imc), "",2);
        }
        else {
            JOptionPane.showMessageDialog(null, String.format("Cuidado! \nVocê está com obesidade grau III \nSeu imc é: %.2f",imc), "",2);
        }
    }   
    
}
