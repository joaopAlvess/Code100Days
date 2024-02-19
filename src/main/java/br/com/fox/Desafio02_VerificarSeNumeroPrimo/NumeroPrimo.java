package br.com.fox.Desafio03_VerificarSeNumeroPrimo;

import javax.swing.*;
import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número para verificar se é primo: ");
        int num = scan.nextInt();

        int contador = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + " é divisivel ");
                contador += 1;
            } else {
                System.out.println(i);
            }


        }
        System.out.printf("Número %s foi dividido %d vezes\n", num, contador);

        if (contador == 2){
            System.out.printf("Dito isso o %s É PRIMO", num);
        } else {
            System.out.printf("Dito isso o %s NÃO É PRIMO", num);
        }
    }
}

