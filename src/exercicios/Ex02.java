package exercicios;

import javax.swing.*;

public class Ex02 {

    public static void main(String[] args) {

        String txt = JOptionPane.showInputDialog("Informe o texto para contagem de letras 'A':");

        analisartxt(txt);
    }

    private static void analisartxt(String txt) {

        int contador = 0;

        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == 'A' || txt.charAt(i) == 'a') {
                contador++;
            }
        }

        if (contador == 0) {
            JOptionPane.showMessageDialog(null, " A letra 'A' não tem ocorrencia no texto");
        } else {
            JOptionPane.showMessageDialog(null, "A letra 'A' aparece " + contador + " vezes no texto.");
        }
    }

}

