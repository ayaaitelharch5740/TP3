package ma.tp3;

import java.util.Scanner;

public class Exercice3 {
	
	public static void main(String[] Args) {
		System.out.println("Combien de valeurs : ");
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt() ;
			int[] valeurs = new int[n] ;
			int nombreImpairs = 1;
			
			for (int i = 0 ; i < n  ; i++) {
				valeurs[i] = nombreImpairs * nombreImpairs;
				System.out.println(nombreImpairs  + " a pour carre " + valeurs[i]);
				nombreImpairs += 2 ;
				
				
			}
		
	}
 }
}
