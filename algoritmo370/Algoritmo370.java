/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo370;

/**
 *
 * @author Anna
 */
// Criar um algoritmo que realize as reservas de passagem aéreas de uma companhia. 
// Além da leitura do número de vôos e da quantidade de lugares disponíveis, 
// leia vários pedidos de reserva, constituídos do número da carteira de identidade 
// do cliente e do número do vôo desejado. Para cada cliente, verificar se há 
// possibilidade no vôo desejado. Em caso afirmativo, imprimir o número da 
// identidade do cliente e o número do vôo, atualizando o número de lugares disponíveis. 
// Caso contrário, avisar ao cliente a inexistência de lugares.

import javax.swing.JOptionPane;
public class Algoritmo370 {

    public static void main(String[] args) {
        
        ClassAlgoritmo370 passagem = new ClassAlgoritmo370();

        passagem.nv = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de voos: "));

        for (int i = 0; i < passagem.nv; i++) {
            passagem.nome[i] = JOptionPane.showInputDialog("Entre com a identificação do voo " + (i + 1) + ":");
            passagem.voos[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de lugares disponíveis no voo " + passagem.nome[i] + ":"));
        }

        passagem.nvd = JOptionPane.showInputDialog("Entre com o número do voo desejado ou @ para terminar: ");
        
        while (!passagem.nvd.equals("@")) { 
            int i = 0;
            while (!passagem.nvd.equals(passagem.nome[i]) && i < passagem.nv - 1) { 
                i++;
            }
            
            if (passagem.nvd.equals(passagem.nome[i])) {  
                if (passagem.voos[i] > 0) {  
                    passagem.voos[i]--; 
                    passagem.id = JOptionPane.showInputDialog("Qual o número da identidade do cliente?");
                    JOptionPane.showMessageDialog(null, "Identidade: " + passagem.id + "  Voo: " + passagem.nvd);
                } else {
                    JOptionPane.showMessageDialog(null, "Não existem mais lugares neste voo.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não existe este voo.");
            }

            passagem.nvd = JOptionPane.showInputDialog("Entre com o número do voo desejado ou @ para terminar: ");
        }
    }
}

