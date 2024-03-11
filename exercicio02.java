// 2) Considere uma fila contendo números inteiros que foram informados pelo
// usuário. Escreva uma função que calcule o maior, o menor e a media
// aritmética dos seus elementos.

import javax.swing.JOptionPane;

public class exercicio02 {
    public static void main(String[] args) {
        int maior = 0;
        int menor = 0;
        int valor;
        double media = 0;
        int contador = 0;
        Fila f = new Fila(10);

        do{
            valor = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Informe o número inteiro que deseja incluir na fila:"));
            f.enfileirar(valor);
        }while(!f.cheia());

        do{
            int valorDesinfileirado = Integer.parseInt(f.desenfileirar());

            media += valorDesinfileirado;
            contador++;

            if (maior == 0 && menor == 0) {
                maior = valorDesinfileirado;
                menor = valorDesinfileirado;
            }
            
            if (valorDesinfileirado > maior) {
                maior = valorDesinfileirado;
            }

            if (valorDesinfileirado < menor) {
                menor = valorDesinfileirado;
            }
        }while(!f.vazia());

        media /= contador;

        JOptionPane.showMessageDialog(
            null, "Maior elemento da fila: "+ maior +
            "\nMenor elemento da fila: " + menor +
            "\nMédia Aritmética da fila: "+ media);
    }
}