
package exerciciojava;


import javax.swing.JOptionPane;

public class ExercicioJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int i,j;
        
        String x, total = "";
            
        int[] par = new int[5];        
        int[] impar = new int[5];
        int valor,y =0,w = 0,z=0;
        
        for ( i = 0; i < 30; i++) {
            x = JOptionPane.showInputDialog(null,"Digite o valor "+(i+1),"",-1);  
            valor  = Integer.parseInt(x);
            
            
            if(valor % 2 == 0){
                if(y == 5){
                
                        JOptionPane.showMessageDialog(null,"Encheu o par");
                    }
                else{
                    
                    par[y] = valor;
                    y=y+1;
                           
                }
            }
            
            
            else{
                if(w == 5){
                    JOptionPane.showMessageDialog(null,"Encheu o impar");
                }else{
                    
                    impar[w] = valor;
                    w += 1;
                    
                }
            }                     
                  
            }
            
        /*for (z = 0;z < 5; z++){
        
            JOptionPane.showMessageDialog(null,"Números do vetor par "+impar)
        }
            JOptionPane.showMessageDialog(null,"A variável de par"+ par);
            JOptionPane.showMessageDialog(null,"A variável de impar"+ impar);
        //    total = total + valor + "  |  ";
            
            JOptionPane.showMessageDialog(null, total);*/
        }
    
}
