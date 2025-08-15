package aula9;

//Classe DNA
//Definindo a estrutura
public class Produto {

    public int id;
    public String nome;
    public String descricao;
    public String codigoBarras;
    public double valor;

    // Declarando o método vazio
    public Produto() {
    }

    // Declarando o método cheio
    public Produto(int id, String nome, String descricao, String codigoBarras, double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.codigoBarras = codigoBarras;
        this.valor = valor;
    }

    // Método para imprimir as informações de um produto
    public void imprimir() {

        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Código de Barras: " + this.codigoBarras);
        System.out.println("Valor: R$ " + this.valor + "\n");
    }

}
