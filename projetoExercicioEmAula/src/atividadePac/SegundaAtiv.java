package atividadePac;

import javax.swing.*;

public class SegundaAtiv {
    public static void main(String[] args) {

        int x;
        double vet[] = new double[5];
        double total=0;
        int contador= 0;
        for (x = 0; x<5; x++) {
            String y = JOptionPane.showInputDialog(null, "Digite o valor " + (x + 1)+": ","",-1);
            contador +=1;
            vet[x] = Double.parseDouble(y);
            total = total + vet[x];
        }
        JOptionPane.showMessageDialog(null,String.format("A soma dos "+contador+" números é: %.2f ",total),"",1);
        }
    }

