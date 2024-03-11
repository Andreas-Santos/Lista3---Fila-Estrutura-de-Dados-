// 3) Considere que você tenha duas filas (Denominadas F1 e F2) contendo
// números inteiros que foram informados pelo usuário. Verifique e informe se a
// fila F1 tem mais elementos do que uma fila F2.

import javax.swing.JOptionPane;

public class exercicio03 {
    public static void main(String[] args) {
        Fila f1 = new Fila(10);
        Fila f2 = new Fila(10);
        int contadorf1 = 0;
        int contadorf2 = 0;
        int valor;

        //preenche a fila f1
        do{
            valor = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Informe o número inteiro que deseja incluir na fila F1(ou digite 0 para não incluir mais números)"));
            
            if(valor == 0) {
                break;
            }
            else{
                f1.enfileirar(valor);
            }
        }while(valor != 0 && !f1.cheia());

        //preenche a fila f2
        do{
            valor = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Informe o número inteiro que deseja incluir na fila F2(ou digite 0 para não incluir mais números)"));
            
            if(valor == 0) {
                break;
            }
            else{
                f2.enfileirar(valor);
            }
        }while(valor != 0 && !f2.cheia());

        //checa quantidade de itens na fila F1
        do{
            f1.desenfileirar();
            contadorf1++;
        }while(!f1.vazia());

        //checa quantidade de itens na fila F2
        do{
            f2.desenfileirar();
            contadorf2++;
        }while(!f2.vazia());

        if(contadorf1 == contadorf2) {
            JOptionPane.showMessageDialog(
                null, "A duas filas possuem o mesmo número de itens: " + contadorf1);
        }
        else if(contadorf1 > contadorf2) {
            JOptionPane.showMessageDialog(
                null,
                "Número de elementos da fila F1: " + contadorf1 +
                "\nNúmero de elementos da fila F2: " + contadorf2 +
                "\nA Fila F1 tem mais elementos do que a fila F2");
        }
        else{
            JOptionPane.showMessageDialog(
                null,
                "Número de elementos da fila F1: " + contadorf1 +
                "\nNúmero de elementos da fila F2: " + contadorf2 +
                "\nA Fila F2 tem mais elementos do que a fila F1");
        }
    }
}