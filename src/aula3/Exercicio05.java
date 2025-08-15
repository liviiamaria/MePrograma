package aula3;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        String nomeAluno;
        double nota1 = 0, nota2 = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        nomeAluno = input.nextLine();

        System.out.print("Digite nota 1:");
        nota1 = input.nextDouble();

        System.out.print("Digite nota 2:");
        nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média\n" + media);

        if (media >= 6) {
            System.out.println("Aprovado!!");
            if (media == 10) {
                System.out.println("Parabés" + nomeAluno);
            }
        } else {
            System.out.println("Reprovado");
        }

    }

}
