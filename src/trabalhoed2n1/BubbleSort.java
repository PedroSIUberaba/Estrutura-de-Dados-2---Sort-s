package trabalhoed2n1;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] vetor) {
        int n = vetor.length;
        int flag = 1;
        while (flag != 0) {
            flag = 0;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) { //Aqui mudou sinal
                    int temp = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = temp;
                    flag = 1;
                }
            }
        }
    }
}
