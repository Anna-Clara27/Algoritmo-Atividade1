/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.algoritmo400;

/**
 *
 * @author Anna
 */
// Um hotel fazenda gostaria de fazer um algoritmo que pudesse controlar os seguintes 
// dados dos 50 quartos número de leitos por quarto; 
// preço 
// situação: alugado, livre ou reservado; 
// aluguel do quarto com data de entrada e de saída e numero de diárias; 
// despesas dentro do hotel; 
// valor a ser pago; 
// impressão de todos os quartos com a situação de cada um; 
// impressão dos quartos livres. 
// Criar um algoritmo que funcione de acordo com o menu a seguir 
// Hotel-Fazenda Sucesso 
// 1. Cadastra quartos 
// 2. Lista todos os quartos 
// 3. Lista quartos ocupados 
// 4. Aluguel/reserva quarto 
// 5. Entra despesas extras 
// 6. Calcula despesa do quarto 
// 7. Sai

import javax.swing.JOptionPane;
public class Algoritmo400 {

    public static void main(String[] args) {
       
        ClassAlgoritmo400 hotel = new ClassAlgoritmo400();
        
        do {
             JOptionPane.showMessageDialog(null, "Hotel Fazenda Sucesso\n");
             JOptionPane.showMessageDialog(null, "1. Cadastra quartos\n");
             JOptionPane.showMessageDialog(null, "2. Lista todos os quartos\n");
             JOptionPane.showMessageDialog(null, "3. Lista quartos livres\n");
             JOptionPane.showMessageDialog(null, "4. Aluguel /Reserva de quarto\n");
             JOptionPane.showMessageDialog(null, "5. Entra despesas extras\n");
             JOptionPane.showMessageDialog(null, "6. Calcula despesas do quarto\n");
             JOptionPane.showMessageDialog(null, "7. Sai\n");
             hotel.op = Integer.parseInt(JOptionPane.showInputDialog("Opção: "));
           

            switch (hotel.op) {
                case 1: 
                    if (hotel.chave == 1) {
                        JOptionPane.showMessageDialog(null, "Atenção: Dados já cadastrados.");
                    } else {
                        for (int i = 0; i < 50; i++) {
                            hotel.leitos[i] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de leitos para o quarto " + (i + 1) + ":"));
                            hotel.precos[i] = Float.parseFloat(JOptionPane.showInputDialog("Preço do quarto:"));
                            hotel.sit[i] = "L"; 
                            hotel.nd[i] = 0;
                            hotel.despesas[i] = 0;
                            hotel.din[i] = "XXXX";
                            hotel.dout[i] = "XXXX";
                            hotel.nome[i] = "";
                            hotel.tel[i] = "";
                        }
                        hotel.chave = 1;
                        JOptionPane.showMessageDialog(null, "Quartos cadastrados com sucesso!");
                    }
                    break;

                case 2: 
                    if (hotel.chave == 0) {
                        JOptionPane.showMessageDialog(null, "Escolha a opção 1 para cadastrar os quartos primeiro.");
                    } else {
                        StringBuilder listaQuartos = new StringBuilder("Lista de Quartos:\n");
                        for (int i = 0; i < 50; i++) {
                            if (hotel.sit[i].equals("L")) {
                               System.out.println(" - Quarto ");
                               System.out.println(" - Leitos: "+hotel.leitos[i]);
                               System.out.println(" - Preco: R$"+hotel.precos[i]);
                        }
                      }
                    }
                    break;

                case 3:
                    if (hotel.chave == 0) {
                        JOptionPane.showMessageDialog(null, "Escolha a opção 1 para cadastrar os quartos primeiro.");
                    } else {
                     
                        for (int i = 0; i < 50; i++) {
                            if (hotel.sit[i].equals("L")) {
                               System.out.println(" - Quarto ");
                               System.out.println(" - Leitos: " +hotel.leitos[i]);
                               System.out.println(" - Preco: R$" +hotel.precos[i]);
                            }
                        }
                    }
                    break;

                case 4: 
                    if (hotel.chave == 0) {
                        JOptionPane.showMessageDialog(null, "Escolha a opção 1 para cadastrar os quartos primeiro.");
                    } else {
                        hotel.numeroQuarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto (1-50):"));
                        if (hotel.numeroQuarto < 1 || hotel.numeroQuarto > 50 || !hotel.sit[hotel.numeroQuarto - 1].equals("L")) {
                            JOptionPane.showMessageDialog(null, "Quarto inválido ou ocupado.");
                        } else {
                            hotel.sit[hotel.numeroQuarto - 1] = JOptionPane.showInputDialog("Alugar (A) ou Reservar (R):").toUpperCase();
                            hotel.nome[hotel.numeroQuarto - 1] = JOptionPane.showInputDialog("Nome do hóspede:");
                            hotel.tel[hotel.numeroQuarto - 1] = JOptionPane.showInputDialog("Telefone:");
                            hotel.din[hotel.numeroQuarto - 1] = JOptionPane.showInputDialog("Data de entrada:");
                            hotel.dout[hotel.numeroQuarto - 1] = JOptionPane.showInputDialog("Data de saída:");
                            hotel.nd[hotel.numeroQuarto - 1] = Integer.parseInt(JOptionPane.showInputDialog("Número de diárias:"));
                        }
                    }
                    break;

                case 5: 
                    if (hotel.chave == 0) {
                        JOptionPane.showMessageDialog(null, "Escolha a opção 1 para cadastrar os quartos primeiro.");
                    } else {
                        int numeroQuarto = Integer.parseInt(JOptionPane.showInputDialog("Número do quarto:"));
                        if (numeroQuarto < 1 || numeroQuarto > 50) {
                            JOptionPane.showMessageDialog(null, "Número de quarto inválido.");
                        } else {
                            hotel.valor = Double.parseDouble(JOptionPane.showInputDialog("Valor das despesas extras: R$"));
                            hotel.despesas[numeroQuarto - 1] += hotel.valor;
                        }
                    }
                    break;

                case 6: 
                    if (hotel.chave == 0) {
                        JOptionPane.showMessageDialog(null, "Escolha a opção 1 para cadastrar os quartos primeiro.");
                    } else {
                        int numeroQuarto = Integer.parseInt(JOptionPane.showInputDialog("Número do quarto:"));
                        if (numeroQuarto < 1 || numeroQuarto > 50) {
                            JOptionPane.showMessageDialog(null, "Número de quarto inválido.");
                        } else {
                            double total = hotel.despesas[numeroQuarto - 1] + (hotel.precos[numeroQuarto - 1] * hotel.nd[numeroQuarto - 1]);
                            JOptionPane.showMessageDialog(null, "Total a ser pago: R$" + total);
                            hotel.sit[numeroQuarto - 1] = "L"; // Libera o quarto
                            hotel.despesas[numeroQuarto - 1] = 0;
                            hotel.din[numeroQuarto - 1] = "XXXX";
                            hotel.dout[numeroQuarto - 1] = "XXXX";
                            hotel.nd[numeroQuarto - 1] = 0;
                            hotel.nome[numeroQuarto - 1] = "";
                            hotel.tel[numeroQuarto - 1] = "";
                        }
                    }
                    break;

                case 7: 
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        } while (hotel.op != 7);
    }
}

   



   
