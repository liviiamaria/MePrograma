package aula10;

//Classe para cadastro e exibição de aluno/matrícula
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Lara";
        aluno1.idade = 27;

        Matricula mat = new Matricula();
        mat.codigo = "202510025";
        mat.status = "Matriculado.";
        mat.data = LocalDateTime.now();
        mat.aluno = aluno1;     
       
        //Método para imprimir as informações
        System.out.println("Dados Matrícula");
        System.out.println("Aluno: " + mat.aluno.nome);
        System.out.println("Idade: " + mat.aluno.idade);
        System.out.println("Matrícula: " + mat.codigo);
        System.out.println("Status: " + mat.status);
        System.out.println("Data: " + mat.data);
    }
}
