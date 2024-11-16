/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo419;

/**
 *
 * @author Anna
 */
// Entrar com valores para duas matrizes inteiras de ordem cinco. Gerar e imprimir a 
// matriz diferença.

import javax.swing.JOptionPane;
public class Algoritmo419 {

    public static void main(String[] args) {
        
        ClassAlgoritmo419 matrizes = new ClassAlgoritmo419();
        
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
              matrizes.A[L][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento de A[" + (L+1) + "][" + (c+1) + "]: "));
                  
            }
        }
        
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
              matrizes.B[L][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento de B[" + (L+1) + "][" + (c+1) + "]: "));
              
                matrizes.DIF[L][c] = matrizes.A[L][c] - matrizes.B[L][c];
            }
        }
        
        System.out.println("\n\tMATRIZ DIFERENCA");
        for (int L = 0; L < 5; L++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matrizes.DIF[L][c] + "\t");
            }
        }
    }
}


    
