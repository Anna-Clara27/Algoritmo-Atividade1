/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo362;

/**
 *
 * @author Anna
 */
// Criar um algoritmo que leia dois conjuntos de números inteiros, tendo cada 
// um 10 e 20 elementos e apresente os elementos comuns aos conjuntos. Lembre-se 
//de que os elementos podem se repetir mas não podem aparecer repetidos na saída. 

import javax.swing.JOptionPane;
public class Algoritmo362 {

    public static void main(String[] args) {
        
        ClassAlgoritmo362 elementos = new ClassAlgoritmo362();
        
        JOptionPane.showMessageDialog(null, "Entrada de dados do vetor 1 (10 elementos):");
        for (int i = 0; i <= 9; i++) {
            JOptionPane.showInputDialog("Entre com o elemento " + (i + 1) + ": ");
            elementos.vet1[i] = i;
        }

      
        JOptionPane.showMessageDialog(null, "Entrada de dados do vetor 2 (20 elementos):");
        for (int i = 0; i <= 19; i++) {
            JOptionPane.showInputDialog("Entre com o elemento " + (i + 1) + ": ");
                elementos.vet2[i] = i;
        }

        
        for (int i = 0; i <= 9; i++) {
            elementos.vetc[i] = -999999999;
        }

      
        for (int i = 0; i <=9; i++) {
            int c = 0;
            
            while (elementos.vet1[i] != elementos.vet2[c] && c < 19) {
                c++;
            }
           
            if (elementos.vet1[i] == elementos.vet2[c]) {
                int d = 0;
                
                while (elementos.vet1[i] != elementos.vetc[d] && d < elementos.l) {
                    d++;
                }
              
                if (d == elementos.l) {
                    elementos.vetc[elementos.l] = elementos.vet1[i];
                    elementos.l++;
                }
            }
        }

    
        if (elementos.l > 0) {
            System.out.println("\n\nExistem elementos comuns:");
            for (int i = 0; i <= elementos.l; i++) {
                System.out.println(elementos.vetc[i]);
            }
        } else {
            System.out.println("\n\nNao existem elementos comuns.");
        }

    }
}