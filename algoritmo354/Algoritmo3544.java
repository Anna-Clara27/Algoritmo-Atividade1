/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo354;

/**
 *
 * @author Anna
 */
// Armazenar 15 números inteiros em um vetor NUM e imprimir uma listagem numerada 
// contendo o número e uma das mensagens: par ou ímpar.

import javax.swing.JOptionPane;
public class Algoritmo3544 {

    public static void main(String[] args) {
        
        ClassAlgoritmo354 num = new ClassAlgoritmo354();
        
        
    for(int i=0; i<=14; i++){
             num.l[i] = i;
        num.l[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
       }

  for(int i=0; i<=14; i++){
       System.out.print((i + 1) + " - " + num.l[i]);
      if(num.l[i] %2==0){
         System.out.println("eh PAR ");

} else{
        System.out.println("eh IMPAR ");
   }
  }
 }
} 
