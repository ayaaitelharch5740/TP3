package ma.tp3;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] Args ) {
		
		System.out.println("Donner le nombre de lignes :");
		try (Scanner sc = new Scanner(System.in)) {
		  int n = sc.nextInt() ; 
		  int étoiles = 1;
		  
		  for (int i = 1; i <= n; i++) {
	            
	            for (int j = 1; j <= étoiles; j++) {
	                System.out.print("*");
	            }
	            System.out.println(); 
	            étoiles += 2; 
	        }
		  
		}
 }
}	
	
