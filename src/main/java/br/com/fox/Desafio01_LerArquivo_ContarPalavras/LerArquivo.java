package br.com.fox.Desafio01_LerArquivo_ContarPalavras;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class LerArquivo {

    public static void leituraArquivo(String caminho) throws IOException {
        BufferedReader lendoBuffer = new BufferedReader(new FileReader(caminho));

        Set<String> palavrasUnicas = new TreeSet<>();

        String linha = "";
        while((linha = lendoBuffer.readLine()) != null) {

            linha = linha.toLowerCase();
            linha = linha.replaceAll("[^\\p{L}0-9 ]", "");
            String[] palavraSeparada = linha.split(" ");

            for (String palavra : palavraSeparada) {
                palavrasUnicas.add(palavra);
            }
        }
        lendoBuffer.close();

        System.out.println("Somente palavras não repetidas: ");
        System.out.println("--------------------------------");
        for (String palavra: palavrasUnicas){
            System.out.println(palavra);
        }
        System.out.println("--------------------------------");
        System.out.println("O número de palavras únicas é: " + palavrasUnicas.size());


    }
}
