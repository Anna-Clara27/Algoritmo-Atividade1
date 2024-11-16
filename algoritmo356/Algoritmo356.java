/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo356;

/**
 *
 * @author Anna
 */
// Armazenar nomes e notas das PR 1 e PR2 de 15 alunos. Calcular e armazenar a 
// média arredondada. Armazenar também a situação do aluno: AP ou RP. Imprimir 
// uma listagem contendo nome notas media e situação de cada aluno tabulando.

import javax.swing.JOptionPane;
public class Algoritmo356 {

    public static void main(String[] args) {
       
        ClassAlgoritmo356 alunos = new ClassAlgoritmo356();
        
          for (int L = 0; L <= 14; L++) {
           
            alunos.nome[L] = JOptionPane.showInputDialog("Digite o " + (L + 1) + "nome:");

            while (alunos.nome[L].length() > 30) {
                JOptionPane.showInputDialog("Nomes com até 30 caracteres.");
                JOptionPane.showInputDialog("Digite o " + (L + 1) + "nome:");
            }
           
            while (alunos.nome[L].length() < 30) {
                alunos.nome[L] = alunos.nome[L] + " "; 
            }

          
            alunos.pr1[L] = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:  "));
            alunos.pr2[L] = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));

          
            alunos.media[L] = (int) Math.round((alunos.pr1[L] + alunos.pr2[L]) / 2.0);

            if (alunos.media[L] >= 6) {
                alunos.sit[L] = "AP"; 
            } else {
                alunos.sit[L] = "RP"; 
            }
        }

        System.out.println("\n\n\n\t\t\t\tRELACAO FINAL");
        for (int L = 0; L <= 14; L++) {
           System.out.println("\nNome: " + alunos.nome[L] + "\nPr1: " + alunos.pr1[L] + "\nPr2: " + alunos.pr2[L] + "\nMedia: " + alunos.media[L] + "\nSit: " + alunos.sit[L]);
    }
  }
}
    