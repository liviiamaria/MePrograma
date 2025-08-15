package aula5;
//Classe DNA
//Objetivo: Definir a estrutura

public class Aluno {
    
    public int id;
    public String nome;
    public String matricula;
    public int idade;

    //declarando explicitamente o método vazio
    public Aluno(){
        System.out.println("chamou construtor vazio!");
    }

    public Aluno (String nome){
        this.nome =  nome;
    }

    public Aluno (int id, String nome, String matricula, int idade){
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;

    }


    //assinatura:
    //proteção + retrno + nome + parâmetros
    public void imprimirDados(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Idade: " + idade);   
    }

    public void imprimirDados (int ordem){
        System.out.println("\nAluno: " + ordem);
        imprimirDados();   
    }
    
}
