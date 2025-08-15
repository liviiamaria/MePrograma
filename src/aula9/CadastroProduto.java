package aula9;

//Classe principal para cadastro e exibição de produtos
public class CadastroProduto {

    public static void main(String[] args) {

        //Definição dos dados dos produtos
        //Criação dos objetos Produto

        Produto produto1 = new Produto();
        produto1.id = 10;
        produto1.nome = "Base fluida";
        produto1.descricao = "Textura leve e de fácil aplicação, com cobertura natural que uniformiza o tom da pele e disfarça imperfeições. ";
        produto1.codigoBarras = "0907200702025";
        produto1.valor = 68.99;

        Produto produto2 = new Produto(86, "Pó compacto", "Uniformiza a pele e sela com toque seco. ", "0205201102025", 20.40);
        
        Produto produto3 = new Produto(53, "Paleta de sombras", "Conjunto de sombras compactadas, para maquiar e realçar os olhos. ", "1701200802025", 49.90);

        //Método para imprimir as informações de um produto
        System.out.println("°°°°° Produto 01 °°°°°");
        produto1.imprimir();

        System.out.println("°°°°° Produto 02 °°°°°");
        produto1.imprimir();

        System.out.println("°°°°° Produto 03 °°°°°");
        produto1.imprimir();

    }

}
