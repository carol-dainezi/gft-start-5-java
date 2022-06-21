package gft.ex03totaldevendas;

/*
Total de Vendas (Vale 3 pontos)
        Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um
        programa que receba código e valor de 5 transações. Calcule e mostre:
        • O valor total das compras à vista
        • O valor total das compras a prazo
        • O valor total das compras efetuadas
        • O valor da soma da primeira prestação das compras a prazo
*/

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String codigo;
        double valorDigitado = 0d;
        double valorVista = 0d;
        double valorPrazo = 0d;
        double valorTotal = 0d;
        double primeiraPrestacao = 0d;
        double somaPrestacoes = 0d;

        for (int i = 0; i<5; i++) {
            System.out.println("Digite o código da transação: ");
            codigo = scanner.nextLine();
            System.out.println("Digite o valor da transação: ");
            valorDigitado = scanner1.nextDouble();
            if (codigo.equalsIgnoreCase("P")) {
                System.out.println("Digite a quantidade de prestações: ");
                primeiraPrestacao = valorDigitado/scanner2.nextInt();

            }


            if (codigo.equalsIgnoreCase("V")) valorVista += valorDigitado;
            if (codigo.equalsIgnoreCase("P")) {
                valorPrazo += valorDigitado;
                somaPrestacoes += primeiraPrestacao;
            }
            valorTotal += valorDigitado;
        }

        System.out.println("Valor total das compras à vista: " + valorVista);
        System.out.println("Valor total das compras à prazo: " + valorPrazo);
        System.out.println("Valor total das compras efetuadas: " + valorTotal);
        System.out.println("Soma das primeiras prestações das compras à prazo: " + somaPrestacoes);
    }
}
