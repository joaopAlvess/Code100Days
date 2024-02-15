package br.com.fox.Desafio01_LerArquivo_ContarPalavras;

import javax.swing.*;
import java.io.IOException;

public class ExecutarLeituraArquivo {

    public static void main(String[] args) throws IOException {

        String caminho = JOptionPane.showInputDialog(null, "Digite o caminho do arquivo: ");

        if (caminho == null || caminho.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Caminho do arquivo vazio ou inválido");
            return;
        }

        LerArquivo.leituraArquivo(caminho);
    }
}


