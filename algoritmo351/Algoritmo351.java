/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo351;

/**
 *
 * @author Anna
 */
// Criar um algoritmo que armazene cinco nomes em um vetor e depois possa ser 
// digitado um número que corresponde a uma pessoa e imprimir esse nome. 

import javax.swing.JOptionPane;
public class Algoritmo351 {

    public static void main(String[] args) {
        
      ClassAlgoritmo351 pessoas = new ClassAlgoritmo351(); 

     for(int l=0; l <= 4; l++){ 

      pessoas.nomes[l] = JOptionPane.showInputDialog("Digite o nome " + (l + 1) + ":");
 } 
      pessoas.num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da pessoa: "));

  while(pessoas.num < 1 || pessoas.num > 5){ 

       JOptionPane.showMessageDialog(null, "Numero fora do intervalo. ");
       pessoas.num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da pessoa: "));

} 
       JOptionPane.showMessageDialog(null, pessoas.nomes[pessoas.num - 1]);
  }
}
