package trabalhoed2n1;

import java.util.Arrays;

public class InsertionSort {
    public void sort(int[] vetor) {
        int n = vetor.length;

        for (int i = 1; i < n; i++) {
            int x = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > x) { //Aqui mudou sinal
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = x;
        }
    }
}
