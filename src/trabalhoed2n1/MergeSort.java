package trabalhoed2n1;

public class MergeSort {

    public void sort(int[] vetor) {
        mergeSort(vetor, 0, vetor.length - 1);
    }

    private void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);

            merge(vetor, inicio, meio, fim);
        }
    }

    private void merge(int[] vetor, int inicio, int meio, int fim) {
        int com1 = inicio, com2 = meio + 1, comAux = 0;
        int[] vetAux = new int[fim - inicio + 1];

        while (com1 <= meio && com2 <= fim) {
            if (vetor[com1] <= vetor[com2]) {
                vetAux[comAux] = vetor[com1];
                com1++;
            } else {
                vetAux[comAux] = vetor[com2];
                com2++;
            }
            comAux++;
        }

        while (com1 <= meio) {
            vetAux[comAux] = vetor[com1];
            comAux++;
            com1++;
        }

        while (com2 <= fim) {
            vetAux[comAux] = vetor[com2];
            comAux++;
            com2++;
        }

        for (comAux = 0; comAux < vetAux.length; comAux++) {
            vetor[inicio + comAux] = vetAux[comAux];
        }
    }
}
