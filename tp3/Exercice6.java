package ma.tp3;



public class Exercice6 {
	
	public static void main(String[] args) {

        
        int n = 8;         
        int k = 4;         
        int[] T = {1, 2, 2, 3, 2, 1, 4, 2,5,6,7,4,3,9,8,7,6,54,3,2,2,56,9,6}; 

        final int MAXV = 100000;
        int[] freq = new int[MAXV + 1]; 

        int distinct = 0;

        
        for (int i = 0; i < k; i++) {
            if (freq[T[i]] == 0) distinct++;
            freq[T[i]]++;
        }

        
        System.out.print(distinct);

        
        for (int i = k; i < n; i++) {
            int out = T[i - k]; 
            freq[out]--;
            if (freq[out] == 0) distinct--;

            int in = T[i];      
            if (freq[in] == 0) distinct++;
            freq[in]++;

            System.out.print(" " + distinct);
        }

        System.out.println(); 
    }
}
