package aula11;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto pro1 = new Produto();
        Produto pro2 = new Produto();
        Produto pro3 = new Produto();
        Pedido pedido = new Pedido();


        pro1.id = 10;
        pro1.nome = "Requeijão";
        pro1.preco = 12.50;

        pro2.id = 18;
        pro2.nome = "Farofa";
        pro2.preco = 5.00;

        pro3.id = 02;
        pro3.nome = "Morango";
        pro3.preco = 9.50;
        
        //Trabalhando com lista
        List<Produto> cestinha = new ArrayList<>();
        cestinha.add(pro3);
        cestinha.add(pro1);
        cestinha.add(pro2);
       
        //Cadastrndo pedido
        pedido.id = 1;
        pedido.status = "Em andamento";
        pedido.precoTotal = 27.00;
        pedido.data = LocalDateTime.now();
        pedido.produtos = cestinha;

        //Método paara imprimir os produtos

        System.out.println("Nota fiscal: ");
        System.out.println("ID: " + pedido.id);
        System.out.println("Data: " + pedido.data);
        System.out.println("Status: " + pedido.status);

        //iterar (pecorrer) a lista for each
        for (Produto p : pedido.produtos){
            System.out.println("Produto: " + p.nome);
            System.out.println("Valor: " + p.preco + "\n");
        }
    
    }
}
