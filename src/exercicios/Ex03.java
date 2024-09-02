package exercicios;

import javax.swing.*;

public class Ex03 {

    public static void main(String[] args) {

        int indice = 12, soma = 0, k = 1;

        while (k < indice) {
            k += 1;
            soma += k;
            System.out.println("K: " +k + " SOMA: " + soma);
        }
        JOptionPane.showMessageDialog(null, soma);
    }
}
