package aula5;

public class App {
    public static void main(String[] args) {
        //invocando os metódos construtores
        //para criação dos objetos
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.id = 10;
        aluno1.nome = "Lívia";
        aluno1.matricula = "2025001";
        aluno1.idade = 15;

        aluno2.id = 11;
        aluno2.nome = "Maria";
        aluno2.matricula = "2025002";
        aluno2.idade = 16;

        aluno3.id = 12;
        aluno3.nome = "Silva";
        aluno3.matricula = "2025003";
        aluno3.idade = 17;

        Aluno aluno4 = aluno3;
        Aluno aluno5 = aluno3;

        //imprimir dados

        aluno1.imprimirDados(1);;
        aluno2.imprimirDados(2);
        aluno3.imprimirDados(3);

    }
    
}
