// 4) Existem partes de sistemas operacionais que cuidam da ordem em que os programas
// devem ser executados. Por exemplo, em um sistema de computação de tempo
// compartilhadao (“time-shared”) existe a necessidade de manter um conjunto de
// processos em uma fila, esperando para serem executados.
// Escreva um programa que seja capaz de ler uma série de solicitações para:
//  a) Incluir novos processos na fila de processo;
//  b) Retirar da fila o processo com o maior tempo de espera;
//  c) Imprimir o conteúdo da lista de processo em determinado momento. Assuma que cada
// processo é representado por um registro composto por um número identificador do
// processo.

import javax.swing.JOptionPane;

public class exercicio04 {
    public static void main(String[] args) {
        Fila f = new Fila(10);
        int escolha;
        int processo;

        do{
            escolha = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "1 - Incluir processo" +
                "\n2 - Remover processo" +
                "\n3 - Imprimir processos" +
                "\n0 - Encerrar programa"));  

            switch (escolha) {
                case 1:                 
                    processo = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "Digite o processo que deseja incluir a fila:"));
                    
                    f.enfileirar(processo);
                    break;
                
                case 2:
                    JOptionPane.showMessageDialog(
                        null, "Processo removido da fila: " + f.desenfileirar());
                    break;
                
                case 3:
                    f.exibeFila();
                    break;
                    
                case 0:
                    JOptionPane.showMessageDialog(
                        null, "Programa encerrado");
                    break;

                default:
                    break;
            }
        }while(escolha != 0);
    }
}