package br.com.fox.Desafio01_LerArquivo_ContarPalavras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {

   //Primeiro crio o método e passo como argumento um String para ele ler o "caminho" em forma de String, também preciso
    //lançar uma IOException, pois caso aconteça um erro ele precisa capturar.
    public static void leituraArquivo(String caminho) throws IOException {
        BufferedReader lendoBuffer = new BufferedReader(new FileReader(caminho));

        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            } else {
                break;
            }
            linha = lendoBuffer.readLine();
        }
        lendoBuffer.close();
    }
}
