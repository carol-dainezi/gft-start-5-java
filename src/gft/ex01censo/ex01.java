package gft.ex01censo;

/*
A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados
sobre o salário e número de filhos. Faça um procedimento que leia esses dados para um
número não determinado de pessoas e retorne a média de salário da população, a média do
número de filhos, o maior salário e o percentual de pessoas com salário até R$350,00.
*/

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        double salario = 0d;
        double somaSalario = 0d;
        double maiorSalario = 0d;
        int filhos = 0;
        int somaFilhos = 0;
        int populacao = 0;
        int salarioBaixo = 0;

        while(true) {
            System.out.println("Digite o seu salário: ");
            salario = scanner.nextDouble();

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            System.out.println("Digite o número de filhos: ");
            filhos = scanner1.nextInt();
            System.out.println("Deseja parar o programa? Y/N: ");
            if (scanner2.nextLine().equalsIgnoreCase("Y")) break;

            somaSalario += salario;
            populacao ++;
            somaFilhos += filhos;


        }

        System.out.printf("Média de salário da população: %.2f", somaSalario/populacao);
        System.out.println("\nMédia do número de filhos: " + somaFilhos/populacao);
        System.out.printf("Maior salário: R$" + maiorSalario);
        System.out.println("\nPercentual de pessoas com salário de até R$350,00: " + salarioBaixo/populacao*100 + "%.");
    }
}
