/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package algoritmo398;

/**
 *
 * @author Anna
 */
// A Fabrica de Queijo Rio Novense deseja elaborar um algoritmo para controlar o 
// estoque e as vendas. Inicialmente, deverão ser lidos e armazenados em vetores: o 
// código, a quantidade disponível em estoque e o preço de venda dos produtos. O 
// término do cadastramento é determinado quando se digita -1 para o código do 
// produto. Sabe-se que a Fábrica de Queijo Rio Novense trabalha com no máximo 
// 50 produtos diferentes. A segunda fase do algoritmo é a venda. Deverá ser lido o 
// código do produto a ser vendido e a quantidade requerida. Se o código do produto 
// estiver cadastrado, a venda poderá ser realizada; caso contrário, a mensagem Produto 
// Não-Cadastrado deverá ser exibida no monitor. Caso o produto esteja disponível, a venda só 
// poderá ser realizada se a quantidade disponível no estoque for suficiente para 
// atender ao pedido. Nesse caso, você deverá abater do estoque a quantidade vendida. 
// Se o estoque não for suficiente para atender ao pedido, a mensagem Estoque Insuficiente 
// deverá ser exibida no monitor. O final das vendas será detectado quando o código do produto 
// for igual a zero. No final devera aparecer uma listagem no video contendo o total vendido no dia 
// e a relação de todos os produtos do estoque, com suas respectivas quantidades, 
// em ordem decrescente de quantidades disponíveis. 

import javax.swing.JOptionPane;
public class Algoritmo398 {

    public static void main(String[] args) {
        
        ClassAlgoritmo398 vendas =  new ClassAlgoritmo398();
        
        int k = 0; 
     
        while (k < 50) {
            vendas.codi = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto ou -1 para acabar: "));
            if (vendas.codi == 0){

            vendas.cod[k] = vendas.codi;
            vendas.quant[k] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto: "));
            vendas.preco[k] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: "));
                k++;
        }

        JOptionPane.showMessageDialog(null, "Cadastro de produtos concluído.");

            vendas.codigoVenda = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto para venda ou 0 para encerrar: "));
            if (vendas.codigoVenda == 0){

            vendas.quantidadeVenda = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade requerida para o produto: "));
            vendas.indiceProduto = -1;

           
            for (int i = 0; i < k; i++) {
                if (vendas.cod[i] == vendas.codigoVenda) {
                    vendas.indiceProduto = i;
                }
            }

            if (vendas.indiceProduto == -1) {
                JOptionPane.showMessageDialog(null, "Produto não cadastrado.");
            } else if (vendas.quant[vendas.indiceProduto] < vendas.quantidadeVenda) {
                JOptionPane.showMessageDialog(null, "Estoque insuficiente.");
            } else {
                // Realiza a venda
                vendas.quant[vendas.indiceProduto] -= vendas.quantidadeVenda;
                double valorVenda = vendas.quantidadeVenda * vendas.preco[vendas.indiceProduto];
                vendas.totalVendido += valorVenda;
                JOptionPane.showMessageDialog(null, "Venda realizada. Valor:  " + valorVenda);
            }
        }

        for (int i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (vendas.quant[i] < vendas.quant[j]) {
                    
                    int tempQuant = vendas.quant[i];
                    vendas.quant[i] = vendas.quant[j];
                    vendas.quant[j] = tempQuant;

                    
                    int tempCod = vendas.cod[i];
                    vendas.cod[i] = vendas.cod[j];
                    vendas.cod[j] = tempCod;

                    double tempPreco = vendas.preco[i];
                    vendas.preco[i] = vendas.preco[j];
                    vendas.preco[j] = tempPreco;
                }
            }
        }

        System.out.println("Total vendido no dia:  " + vendas.totalVendido + "\n\nEstoque final:\n");
        for (int i = 0; i < k; i++) {
             System.out.println("Codigo: \n" + vendas.cod[i]);
             System.out.println("Quantidade: \n"+ vendas.quant[i]);
             System.out.println("Preco: \n" + vendas.preco[i]);
   }
  }
 }
}


