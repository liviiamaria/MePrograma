package aula12;

import java.time.LocalDateTime;

public class Teste {
    public static void main(String[] args) {
        //só posso atribuir valores a atributos
        //quando instancioo objeto
        Pessoa p = new Pessoa();
        p.nome = "abc";  

        //com exceção de atributos
        //ou métodos estáticos

        Pessoa.nome = "Marcos";
        LocalDateTime.now();

        System.out.println("Nome: " + p.nome);
        System.out.println("Nome: " + Pessoa.nome);
    }
}
