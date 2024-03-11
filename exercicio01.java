// 1) Escreva um programa em Java que leia números inteiros e armazene em
// uma fila. A entrada de dados deve ser interrompida quando o usuário
// informar o número zero ou esgotar a quantidade definida de elementos a
// serem armazenados na estrutura. Por último, imprima os elementos na
// ordem em que forem removidos da fila.

import javax.swing.JOptionPane;

public class exercicio01 {
    public static void main(String[] args) {
        Fila f = new Fila(10);
        int valor;
        
        do{
            
            valor = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite um número inteiro para inserir na fila:"
            ));

            if(valor == 0) {
                break;
            }
            else {
                f.enfileirar(valor);
            }
        }while(valor != 0 && !f.cheia());

        f.exibeFila();
    }
}