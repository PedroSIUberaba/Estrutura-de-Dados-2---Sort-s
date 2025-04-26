package trabalhoed2n1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TrabalhoED2N1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("=     BEM-VINDO AO SISTEMA DE ORDENAÇÃO =");
        System.out.println("=========================================");

        System.out.print("\nDigite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];

        Random random = new Random();
        System.out.println("\nVetor gerado aleatoriamente:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(1001);
        }
        System.out.println(Arrays.toString(vetor));

        System.out.println("\n=====================================");
        System.out.println("Escolha o algoritmo de ordenação:");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");
        System.out.println("4 - Merge Sort");
        System.out.println("5 - Quick Sort");
        System.out.println("6 - Executar todos");
        System.out.println("=====================================");

        System.out.print("Digite a opção desejada: ");
        int escolha = sc.nextInt();

        long startTime, endTime;

        System.out.println("\n=====================================");

        switch (escolha) {
            case 1:
                executarBubbleSort(vetor);
                break;
            case 2:
                executarSelectionSort(vetor);
                break;
            case 3:
                executarInsertionSort(vetor);
                break;
            case 4:
                executarMergeSort(vetor);
                break;
            case 5:
                executarQuickSort(vetor);
                break;
            case 6:
                executarTodos(vetor);
                break;
            default:
                System.out.println("Opção inválida!");
        }
        sc.close();
    }

    private static void executarBubbleSort(int[] vetorOriginal) {
        int[] vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
        System.out.println("Bubble Sort:");
        long start = System.currentTimeMillis();
        new BubbleSort().sort(vetor);
        long end = System.currentTimeMillis();
        exibirResultado(vetor, end - start);
    }

    private static void executarSelectionSort(int[] vetorOriginal) {
        int[] vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
        System.out.println("Selection Sort:");
        long start = System.currentTimeMillis();
        new SelectSort().sort(vetor);
        long end = System.currentTimeMillis();
        exibirResultado(vetor, end - start);
    }

    private static void executarInsertionSort(int[] vetorOriginal) {
        int[] vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
        System.out.println("Insertion Sort:");
        long start = System.currentTimeMillis();
        new InsertionSort().sort(vetor);
        long end = System.currentTimeMillis();
        exibirResultado(vetor, end - start);
    }

    private static void executarMergeSort(int[] vetorOriginal) {
        int[] vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
        System.out.println("Merge Sort:");
        long start = System.currentTimeMillis();
        new MergeSort().sort(vetor);
        long end = System.currentTimeMillis();
        exibirResultado(vetor, end - start);
    }

    private static void executarQuickSort(int[] vetorOriginal) {
        int[] vetor = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
        System.out.println("Quick Sort:");
        long start = System.currentTimeMillis();
        new QuickSort().sort(vetor);
        long end = System.currentTimeMillis();
        exibirResultado(vetor, end - start);
    }

    private static void executarTodos(int[] vetorOriginal) {
        executarBubbleSort(vetorOriginal);
        executarSelectionSort(vetorOriginal);
        executarInsertionSort(vetorOriginal);
        executarMergeSort(vetorOriginal);
        executarQuickSort(vetorOriginal);
    }

    private static void exibirResultado(int[] vetor, long tempo) {
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
        System.out.println("Tempo de execução: " + tempo + " ms");
        System.out.println("=====================================\n");
    }
}
