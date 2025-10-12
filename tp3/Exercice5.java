package ma.tp3;



public class Exercice5 {

	 public static void affiche(int[][] A) {
	        for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < A[i].length; j++) {
	                System.out.print(A[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	 public static void rotate90ClockwiseInPlace(int[][] A) {
	        int N = A.length;

	        
	        for (int i = 0; i < N; i++) {
	            for (int j = i + 1; j < N; j++) {
	                int temp = A[i][j];
	                A[i][j] = A[j][i];
	                A[j][i] = temp;
	            }
	        }      
	        
	     for (int i = 0; i < N; i++) {
         for (int j = 0; j < N / 2; j++) {
             int temp = A[i][j];
             A[i][j] = A[i][N - 1 - j];
             A[i][N - 1 - j] = temp;
         }
     }
 }
	 
	 public static void main(String[] args) {
	        
	        int[][] A = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12},
	            {13, 14, 15, 16}
	        };

	        System.out.println("Matrice originale :");
	        affiche(A);

	        rotate90ClockwiseInPlace(A);

	        System.out.println("\nMatrice après rotation 90° horaire :");
	        affiche(A);
	    }
}
	
