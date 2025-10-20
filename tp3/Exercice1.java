package ma.tp3;

import java.util.Scanner;

public class Exercice1 {

    public static double addition(int... valeurs) {
        double total = 0;
        for (double v : valeurs) {
            total += v;
        }
        return total;
    }

    public static void main(String[] args) {

        System.out.println("Donner le nombre de valeurs :");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] valeurs = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("valeur " + (i + 1) + ":");
                valeurs[i] = sc.nextInt();
            }

            System.out.println("La somme est : " + addition(valeurs));
        }
    }
}
