package gft.ex04concessionaria;

/*
Concessionária (Vale 3 pontos)
Faça um programa que receba o valor de um carro e mostre uma tabela com os seguintes
dados: preço final, quantidade de parcelas e valor da parcela. Considere o seguinte:
        • O preço final para compra à vista tem um desconto de 20%;
        • A quantidade de parcelas pode ser: 6, 12, 18
        • Os percentuais de acréscimo sobre o preço final seguem a tabela a seguir.

        Quantidade de Parcelas Percentual de acréscimo
            6                      3%
            12                     6%
            18                     9%
*/

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valorCarro = 0d;
        int quantidadeParcelas = 0;
        double valorParcela = 0d;

        System.out.println("Digite o valor do carro: ");
        valorCarro = scanner.nextDouble();
        while(true) {
            System.out.println("Digite a quantidade de parcelas (digite 1 se sua compra for à vista): ");
            quantidadeParcelas = scanner.nextInt();
            if (quantidadeParcelas != 1 && quantidadeParcelas != 6 && quantidadeParcelas != 12 && quantidadeParcelas != 18)
                System.out.println("Quantidade de parcelas inválida. As compras podem ser parceladas em 6, 12 ou 18 vezes.");
            else break;
        }

        switch (quantidadeParcelas) {
            case 1 -> {
                System.out.println("Pagamento à vista: ");
                System.out.println("O valor do carro será de R$" + (valorCarro - valorCarro * 0.2));
            }
            case 6 -> {
                valorCarro = valorCarro + valorCarro * 0.03;
                System.out.println("Pagamento em 6 parcelas:");
                System.out.printf("O valor de cada parcela será de R$ %.2f", (valorCarro / quantidadeParcelas));
                System.out.println(". Preço final: R$" + valorCarro);
            }
            case 12 -> {
                valorCarro = valorCarro + valorCarro * 0.06;
                System.out.println("Pagamento em 12 parcelas:");
                System.out.printf("O valor de cada parcela será de R$ %.2f", (valorCarro / quantidadeParcelas));
                System.out.println(". Preço final: R$" + valorCarro);
            }
            case 18 -> {
                valorCarro = valorCarro + valorCarro * 0.09;
                System.out.println("Pagamento em 18 parcelas:");
                System.out.printf("O valor de cada parcela será de R$ %.2f", (valorCarro / quantidadeParcelas));
                System.out.println(". Preço final: R$" + valorCarro);
            }
        }

    }
}
