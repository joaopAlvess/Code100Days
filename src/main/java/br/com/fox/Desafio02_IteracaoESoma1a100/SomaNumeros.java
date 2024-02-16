package br.com.fox.Desafio02_NumerosPrimos1a100;

public class SomaNumeros {

    public static void main(String[] args) {


        int contador = 0;
        for (int i = 1; i <= 100; i++){
            contador += i;
        }

        System.out.println("A soma dos numeros é: " + contador);
    }
}
