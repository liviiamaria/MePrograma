package aula15teste;

import aula15encapsulamento.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setIdade(-10);
        p.setNome("Zaíne");

        System.out.println("Nome: " +p.getNome());
        System.out.println("Idade: " +p.getIdade());
    }   
}