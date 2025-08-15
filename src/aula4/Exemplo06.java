package aula4;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.print("Digite um valor para exibir a tabuada: \n");
        int valor = teclado.nextInt ();

        System.out.println(1 + "X" + valor + "=" + (1*valor));
        
        //inputs da repetição:
        //valor inicial
        //condição de parada
        //incremento
        
        int i = 1;
        while (i <= 10){
            System.out.println(i + "X" + valor + "=" + (i*valor));
            i = i + 1;

        }





    }
}
