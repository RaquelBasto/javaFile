package exercicioResolvido;
import javax.swing.JOptionPane;





public class Principal {




    public static void main(String[] args) {
        int x = 0;

        String total="";
        int[] vet = new int[8];

        for(x = 0; x < 8 ; x++){

            String y = JOptionPane.showInputDialog(null, "Digite um numero"+ (x+1));

            vet[x] = Integer.parseInt(y);

            total = total + vet[x] + " | ";



        }



        JOptionPane.showMessageDialog(null, total);



    }



}