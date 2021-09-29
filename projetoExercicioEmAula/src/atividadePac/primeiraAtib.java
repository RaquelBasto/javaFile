package atividadePac;

import javax.swing.*;

public class primeiraAtib {
    public static void main(String[] args) {
        /*1 - Montar um vetor de 7 posições de String e exibi-lo ao final
        2 - Montar um vetor de int com 8 posições e exibi-lo ao final*/

        // int [] = vet =new int [8];
        String [ ] vetor = new String[7];
        String total= " ";
        //vetor[] ={"1","2","3","4","5","6","7"};
        for (int i = 0; i < 7; i++){
            vetor[i]=JOptionPane.showInputDialog(null,"Digite um valor  "+i+1);
            //String y = JOptionPane.showInputDialog(null,"Digite um valor: ");
            //vet[i] = Integer.parseInt(y);
            total = total + vetor[i] + " | ";
        }
        /*
        * for (x = 0; < 8; x++){
        *
        * }
        * */
        JOptionPane.showMessageDialog(null,"OS valores inseridos: "+ total);
    }
}
