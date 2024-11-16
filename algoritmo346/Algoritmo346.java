/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo346;

/**
 *
 * @author Anna
 */
// Criar um algoritmo que funcione através do menu a seguir: 
// MENU 
// 1 - Imprime o comprimento da frase 
// 2 - Imprime os dois primeiros e os dois últimos caracteres da frase 
// 3 - Imprime a frase espelhada 
// 4 - Termina o algoritmo 
// OPCAO 

import javax.swing.JOptionPane;
public class Algoritmo346 {

    public static void main(String[] args) {
        
        ClassAlgoritmo346 menu = new ClassAlgoritmo346();

        do {
          
            JOptionPane.showMessageDialog(null, "\nMENU");
            JOptionPane.showMessageDialog(null, "1 - Imprime o comprimento da frase");
            JOptionPane.showMessageDialog(null, "2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            JOptionPane.showMessageDialog(null, "3 - Imprime a frase espelhada");
            JOptionPane.showMessageDialog(null, "4 - Termina o algoritmo");
            menu.op = Integer.parseInt(JOptionPane.showInputDialog("Opção: "));


            switch (menu.op) {
                case 1:
                    menu.frase = JOptionPane.showInputDialog("Digite uma frase: ");
                    JOptionPane.showMessageDialog(null, "Número de caracteres da frase: " + menu.frase.length());
                                  break;
                
                case 2:
                    menu.frase = JOptionPane.showInputDialog("Digite uma frase:");
                    JOptionPane.showMessageDialog(null,"Os dois primeiros caracteres: " + menu.frase.substring(0, 2));
                           menu.tam = menu.frase.length() - 2;
                    JOptionPane.showMessageDialog(null, "Os dois últimos caracteres: "+ menu.frase.substring(menu.tam));
                                 break;
                
                case 3:
                   menu.frase = JOptionPane.showInputDialog("Digite uma frase: ");
                   StringBuilder espelhada = new StringBuilder(menu.frase);
                   espelhada.reverse(); 
                  JOptionPane.showMessageDialog(null, "Frase espelhada: " + espelhada.toString());
                                  break;

                
                case 4:
                   JOptionPane.showMessageDialog(null, "Fim do algoritmo.");
                                 break;
                
                default: JOptionPane.showMessageDialog(null, "Opção não disponível.");
                                
            }
        } while (menu.op != 4);  
    }
}

