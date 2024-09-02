package exercicios;

import javax.swing.*;

public class Ex01 {

    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para verificar se ele\npertence à sequência de Fibonacci:"));

        if (isFibonacci(num)) {
            JOptionPane.showMessageDialog(null, "O número '" + num + "' pertence à sequência.");
        } else {
            JOptionPane.showMessageDialog(null, "O número '" + num + "' não pertence à sequência.");
        }
    }

    public static boolean isFibonacci(int n) {

        if (n < 0) return false;

        int a = 0, b = 1;

        while (a < n) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == n;
    }
}
