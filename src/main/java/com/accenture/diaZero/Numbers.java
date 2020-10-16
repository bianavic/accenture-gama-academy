package com.accenture.diaZero;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int number1 = scanner.nextInt();

        System.out.println("Digite um segundo numero inteiro: ");
        int number2 = scanner.nextInt();

        System.out.println("Digite um terceiro numero inteiro: ");
        int number3 = scanner.nextInt();

        scanner.close();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}
