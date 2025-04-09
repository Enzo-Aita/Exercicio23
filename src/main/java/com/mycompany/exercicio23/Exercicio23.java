

package com.mycompany.exercicio23;
import javax.swing.JOptionPane;

public class Exercicio23 {

    public static void main(String[] args) {
         String inputInicial = JOptionPane.showInputDialog(
            null,
            "Digite o número INICIAL da faixa:",
            "Soma de Números em Faixa",
            JOptionPane.QUESTION_MESSAGE
        );
        
        
        if(inputInicial == null) {
            JOptionPane.showMessageDialog(
                null,
                "Operação cancelada pelo usuário!",
                "Cancelado",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        
      
        String inputFinal = JOptionPane.showInputDialog(
            null,
            "Digite o número FINAL da faixa:",
            "Soma de Números em Faixa",
            JOptionPane.QUESTION_MESSAGE
        );
        
       
        if(inputFinal == null) {
            JOptionPane.showMessageDialog(
                null,
                "Operação cancelada pelo usuário!",
                "Cancelado",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        
        try {
           
            int inicio = Integer.parseInt(inputInicial);
            int fim = Integer.parseInt(inputFinal);
            
            
            if(fim < inicio) {
                JOptionPane.showMessageDialog(
                    null,
                    "O número final deve ser maior ou igual ao inicial!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                );
                return;
            }
            
            int soma = 0;
            int numeroAtual = inicio;
            
            while(numeroAtual <= fim) {
                soma += numeroAtual;
                numeroAtual++;
            }
            
            
            JOptionPane.showMessageDialog(
                null,
                "A soma dos números de " + inicio + " até " + fim + " é: " + soma,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE
            );
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "Por favor, digite números inteiros válidos!",
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
        
    
