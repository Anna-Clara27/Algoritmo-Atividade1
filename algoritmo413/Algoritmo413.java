/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo413;

/**
 *
 * @author Anna
 */
// Criar um algoritmo que armazene dados inteiros em uma matriz de ordem cinco e 
// imprima: toda a matriz e a raiz quadrada da soma dos quadrados dos números 
// ímpares localizados abaixo da DS.

import javax.swing.JOptionPane;
public class Algoritmo413 {

    public static void main(String[] args) {
        
        ClassAlgoritmo413 dados = new ClassAlgoritmo413();
      
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                String input = JOptionPane.showInputDialog("Digite o elemento [" + L + "][" + c + "]: ");
                dados.n[L][c] = Integer.parseInt(input);  
            }
        }
                  
        System.out.println("\nToda a matriz:");
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(dados.n[L][c] + "\t");
            }
            System.out.println();
        }
        
        for (int L = 1; L < 5; L++) {
            for (int c = 5 - L; c < 5; c++) {
                if (dados.n[L][c] % 2 != 0) { 
                    dados.soma += dados.n[L][c] * dados.n[L][c]; 
              }
            }
          }
        
        double raizQuadrada = Math.sqrt(dados.soma);

        JOptionPane.showMessageDialog(null, "Raiz quadrada da soma dos quadrados dos números ímpares: " + raizQuadrada);
     }
   }


   