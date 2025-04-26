package trabalhoed2n1;

import java.util.Arrays;

public class SelectSort {
    public void sort(int[] vetor) {
        int tv = vetor.length;

        for (int i = 0; i < tv - 1; i++) {
            int vmenor = vetor[i];
            int pmenor = i;
            for (int j = i + 1; j < tv; j++) {
                if (vmenor > vetor[j]) { //Aqui mudou
                    vmenor = vetor[j];
                    pmenor = j;
                }
            }
            int bkp = vetor[i];
            vetor[i] = vmenor;
            vetor[pmenor] = bkp;
        }
    }
}
