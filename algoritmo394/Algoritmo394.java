/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo394;

/**
 *
 * @author Anna
 */
// Criar um algoritmo que possa armazenar nome, duas notas e média de 50 alunos. 
// A média será calculada segundo o critério: peso 3 para a primeira nota e peso 7 
// para a segunda. A impressão deverá conter nome, duas notas e a média. 
// ESCOLA VIVA 
// 1 - Entrar nomes 
// 2 - Entrar Pa nota 
// 3- Entrar 2 nota 
// 4 - Calcular média 
// 5 - Listar no display 
// 6-Sair 
// opcao

import javax.swing.JOptionPane;
public class Algoritmo394 {

    public static void main(String[] args) {
        
        ClassAlgoritmo394 alunos = new ClassAlgoritmo394();
        
         do {
            JOptionPane.showMessageDialog(null, "\nMENU\n");
            JOptionPane.showMessageDialog(null, "1 - Entrar Nomes\n");
            JOptionPane.showMessageDialog(null, "2 - Entrar 1ª Nota\n");
            JOptionPane.showMessageDialog(null, "3 - Entrar 2ª Nota\n");
            JOptionPane.showMessageDialog(null, "4 - Calcular Média\n");
            JOptionPane.showMessageDialog(null, "5 - Listar no Display\n");
            JOptionPane.showMessageDialog(null, "6 - Sair\n");
            alunos.op = Integer.parseInt(JOptionPane.showInputDialog("Opção: "));
            
             switch (alunos.op) {
                case 1:
                    for (int L = 0; L <= 49; L++) {
                        alunos.nomes[L] = JOptionPane.showInputDialog("Digite o nome do aluno " + (L + 1) + " (com até 30 caracteres e todas as letras maiúsculas):");
                        while (alunos.nomes[L].length() > 30) {
                            alunos.nomes[L] = JOptionPane.showInputDialog("Nome com até 30 caracteres. Digite o nome do aluno " + (L + 1) + " (todas as letras maiúsculas):");
                        }
                    }
                    alunos.flag = 1; 
                    break;

                case 2:
                    if (alunos.flag == 0) {
                        JOptionPane.showMessageDialog(null, "Não tem nome cadastrado!");
                    } else {
                        for (int L = 0; L <= 49; L++) {
                            alunos.nota1[L] = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota do aluno " + (L + 1) + ": "));
                        }
                        alunos.flag1 = 1; 
                    }
                    break;

                case 3:
                    if (alunos.flag == 0) {
                        JOptionPane.showMessageDialog(null, "Não tem nome cadastrado!");
                    } else {
                        for (int L = 0; L <= 49; L++) {
                            alunos.nota2[L] = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota do aluno " + (L + 1) + ": "));
                        }
                        alunos.flag2 = 1; 
                    }
                    break;

                case 4:
                    if (alunos.flag == 0 || alunos.flag1 == 0 || alunos.flag2 == 0) {
                        JOptionPane.showMessageDialog(null, "Nem todos os dados estão cadastrados!");
                    } else {
                        for (int L = 0; L <= 49; L++) {
                            alunos.media[L] = (3 * alunos.nota1[L] + 7 * alunos.nota2[L]) / 10;
                        }
                        JOptionPane.showMessageDialog(null, "Médias calculadas!");
                    }
                    break;

                case 5:
                    if (alunos.flag == 0 || alunos.flag1 == 0 || alunos.flag2 == 0) {
                        JOptionPane.showMessageDialog(null, "Nem todos os dados estão cadastrados!");
                    } else {
                        System.out.println("NOME\t\t\t\tNOTA1\tNOTA2\tMÉDIA\n");
                        for (int L = 0; L <= 49; L++) {
                        System.out.println("\tNome: " + alunos.nomes[L] + "\nNota 1: " + alunos.nota1[L] + "\nNota 2: " +alunos.nota2[L] + "\nMedia: " + alunos.media[L]);
                        
                        }
                    }
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção não disponível!");
            }

        } while (alunos.op != 6);
    }
}

        
   