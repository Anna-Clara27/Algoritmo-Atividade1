/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo360;

/**
 *
 * @author Anna
 */
// Criar um algoritmo que imprima o horóscopo de várias pessoas, a partir de sua 
// data de nascimento (ddmm). O fim é determinado quando se digita 9999 para 
// data; considere que a data foi digitada corretamente. 

import javax.swing.JOptionPane;
public class Algoritmo360 {

    public static void main(String[] args) {
        
        ClassAlgoritmo360 horóscopo = new ClassAlgoritmo360();

        for (int i = 0; i < 12; i++) {
            horóscopo.signo[i] = JOptionPane.showInputDialog("Digite o signo: ");
            horóscopo.ultdia[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o último dia para o signo " + horóscopo.signo[i] + ": "));
        }

   
        horóscopo.data = Integer.parseInt(JOptionPane.showInputDialog("Digite a data no formato ddmm ou 9999 para terminar: "));

        while (horóscopo.data != 9999) {
            horóscopo.dia = horóscopo.data / 100;  
            horóscopo.mes = (horóscopo.data % 100) - 1; 
           
            if (horóscopo.dia > horóscopo.ultdia[horóscopo.mes]) {
                horóscopo.mes = (horóscopo.mes + 1) % 12;  
            }
           
            JOptionPane.showMessageDialog(null, "Signo: " + horóscopo.signo[horóscopo.mes]);

            horóscopo.data = Integer.parseInt(JOptionPane.showInputDialog("Digite a data no formato ddmm ou 9999 para terminar: "));
        }

    }
}