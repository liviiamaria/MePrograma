package avaliacao1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastroApp {
    public static void main(String[] args) {

        Transacao transacao1 = new Transacao();
        transacao1.id = 12;
        transacao1.tipo = "Saque";
        transacao1.valor = 5000.00;
        transacao1.dataHora = LocalDateTime.now();
        transacao1.status = "Finalizada";

        Transacao transacao2 = new Transacao(23, "Depósito", 350, LocalDateTime.now(), "Cancelada");

        Transacao transacao3 = new Transacao(57, "Saque", 1200.00, LocalDateTime.now(), "Em andamento");

        //Trabalhando com lista
        List<Transacao> transacoes = new ArrayList<>();
        transacoes.add(transacao1);
        transacoes.add(transacao2);
        transacoes.add(transacao3);
    
        //Cadastrndo conta bancaria
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.id = 65;
        contaBancaria.titular = "Adna Zaíne Alves Nunes";
        contaBancaria.numero = "0294 1001 3673 8425";
        contaBancaria.agencia = "Inter";
        contaBancaria.saldo = 100000.00;
        contaBancaria.limite = 200;
        contaBancaria.tipo = "Corrente";
        contaBancaria.transacoes = transacoes;

        //Método para imprimir o cupom fiscal
        System.out.println("\n---------- CUPOM FISCAL ----------\n");
        System.out.println("ID: " + contaBancaria.id);
        System.out.println("TITULAR: " + contaBancaria.titular);
        System.out.println("NÚMERO DA CONTA: " + contaBancaria.numero);
        System.out.println("AGÊNCIA: " + contaBancaria.agencia);
        System.out.println("SALDO: " + contaBancaria.saldo);
        System.out.println("LIMITE: " + contaBancaria.limite);
        System.out.println("TIPO: " + contaBancaria.tipo + "\n");

        System.out.println("---------- TRANSAÇÔES ----------\n");

        //iterar (pecorrer) a lista for each
        for (Transacao transacao : contaBancaria.transacoes) {
            System.out.println("ID: " + transacao.id);
            System.out.println("TÍTULO: " + transacao.tipo);
            System.out.println("VALOR: R$ " + transacao.valor);
            System.out.println("DATA E HORA DA TRANSAÇÃO: " + transacao.dataHora);
            System.out.println("STATUS: " + transacao.status + "\n");
        }

    }

}
