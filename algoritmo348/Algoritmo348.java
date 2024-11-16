/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo348;

/**
 *
 * @author Anna
 */
// Criar um algoritmo que armazene nome e duas notas de 5 alunos e imprima uma 
// listagem contendo nome, as duas notas e a média de cada aluno.

import javax.swing.JOptionPane;
public class Algoritmo348 {

    public static void main(String[] args) {
       
      ClassAlgoritmo348 notas = new ClassAlgoritmo348();
    
        
        for (int l=0; l<=4; l++){
           notas.nomes[l] = JOptionPane.showInputDialog("Digite o nome: ");
               
           notas.pr1[l] = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
                
           notas.pr2[l] = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
                 
           notas.media[l] = (notas.pr1[l] + notas.pr2[l]) /2;
        }
         System.out.println("\n\n\n\t\t\tRelacao final: \n");
         
           for (int l=0; l<=4; l++){
               
         System.out.println((l + 1) + "-" + notas.nomes[l]);
         System.out.println("\nNota 1: " + notas.pr1[l] + "\tNota 2: " + notas.pr2[l] + "\tMédia: " + notas.media[l]);
         }
    }
}
