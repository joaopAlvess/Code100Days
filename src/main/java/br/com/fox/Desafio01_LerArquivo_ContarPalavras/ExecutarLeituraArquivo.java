package br.com.fox.Desafio01_LerArquivo_ContarPalavras;

import java.io.IOException;

public class ExecutarLeituraArquivo {

    public static void main(String[] args) throws IOException {
        String caminho = "C:\\Users\\JP\\Desktop\\hino.txt";
        LerArquivo.leituraArquivo(caminho);
    }
}
