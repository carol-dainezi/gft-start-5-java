package gft.ex02categorianadador;

/*Categoria do Nadador (Vale 2 pontos)
Faça um procedimento que recebe a idade de um nadador e retorna a categoria desse
nadador de acordo com a tabela abaixo:

        Idade Categoria
        5 a 7 anos Infantil A
        8 a 10 anos Infantil B
        11-13 anos Juvenil A
        14-17 anos Juvenil B
        Maiores de 18 anos (inclusive) Adulto
*/

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        if (idade >= 5 && idade <= 7)
            System.out.println("O nadador está na categoria Infantil A.");
        if (idade >= 8 && idade <= 10)
            System.out.println("O nadador está na categoria Infantil B.");
        if (idade >= 11 && idade <= 13)
            System.out.println("O nadador está na categoria Juvenil A.");
        if (idade >= 14 && idade <= 17)
            System.out.println("O nadador está na categoria Juvenil B.");
        if (idade >= 18)
            System.out.println("O nadador está na categoria Adulto.");
    }
}
