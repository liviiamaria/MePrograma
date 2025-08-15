package aula5;

public class App2 {

public static void main(String[] args) {
    Aluno aluno1 = new Aluno();
    Aluno aluno2 = new Aluno("Lívia\n");
    Aluno aluno3 = new Aluno(21, "Sukinho", "2564", 12);

    aluno1.imprimirDados();
    aluno2.imprimirDados();
    aluno3.imprimirDados();
}
    
}
