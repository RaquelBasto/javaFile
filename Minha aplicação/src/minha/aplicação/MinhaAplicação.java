
package minha.aplicação;

import javax.swing.JOptionPane;


public class MinhaAplicação {

// -1 nenhum
// 0 = X
// 1 = i
// 2 = !
// 3 = ?
    
    public static void main(String[] args) {
        /*String x = JOptionPane.showInputDialog(null,"Digite um valor: ");
        int valor1 = Integer.parseInt(x);
        JOptionPane.showMessageDialog(null, x, " ", 3);*/
        
        String op = JOptionPane.showInputDialog(null, "1 - para soma \n2 - para subtração \n3 - para multiplicação \n4 - para divisão \n\tEscolha uma opção: ", " ",  -1);
        int opcao = Integer.parseInt(op);
        
            String numero = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ", " ",  -1);
            double num1 = Double.parseDouble(numero);
            
            String numero2 = JOptionPane.showInputDialog(null, "Digite o segundo valor: ", " ",  -1);
            double num2 = Double.parseDouble(numero2);
        
        if(opcao == 1){
            double res = num1 + num2;
            JOptionPane.showMessageDialog(null, "O resultado é: "+res);
        }
        else if(opcao == 2){
            double res = num1 - num2;
            JOptionPane.showMessageDialog(null, "O resultado é: "+res);
        }
        else if(opcao == 3){
            double res = num1 * num2;
            JOptionPane.showMessageDialog(null, "O resultado é: "+res);
        }
        else if(opcao == 4){
            double res = num1 / num2;
            JOptionPane.showMessageDialog(null, "O resultado é: "+res);
        }
        
        
        
    }
    
}
