/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo358;

/**
 *
 * @author Anna
 */
// Criar um algoritmo que leia o preço de compra e o preço de venda de 100 
//mercadorias O algoritmo devera imprimir quantas mercadorias proporcionam 
// m lucro < 10 % 
// 10 % <= lucro <= 20 % 
// m lucro > 20 % 

import javax.swing.JOptionPane;
public class Algoritmo358 {

    public static void main(String[] args) {
        
         ClassAlgoritmo358 lucro = new ClassAlgoritmo358();
         

   for (int A = 0; A < 100; A++) { 
 
   lucro.precocompra[A] = Float.parseFloat(JOptionPane.showInputDialog("Preço de compra: "));
   lucro.precovenda[A] = Float.parseFloat(JOptionPane.showInputDialog("Preço de venda: "));
} 
   
   for (int A = 0; A < 100; A++) { 

        lucro.lucro = lucro.precovenda[A] - lucro.precocompra[A];

  if (lucro.lucro < 10.0) {
    lucro.totlucromenor10++;
 
} else{ 

  if (lucro.lucro <= 20.0) { 
    lucro.totlucromenor20++; 

} else { 
   lucro.totlucromaior20++; 
  } 
 } 
} 

JOptionPane.showMessageDialog(null, "Total de mercadorias com lucro < 10%: " + lucro.totlucromenor10);
JOptionPane.showMessageDialog(null, "\nTotal de mercadorias com 10% <= lucro <= 20%: " + lucro.totlucromenor20);
JOptionPane.showMessageDialog(null, "\nTotal de mercadorias com lucro > 20%: " + lucro.totlucromaior20);

 }
}
